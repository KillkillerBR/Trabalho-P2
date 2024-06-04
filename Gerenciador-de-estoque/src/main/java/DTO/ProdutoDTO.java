package DTO;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import model.CodigoBarras;
import model.Entrada;
import model.Estoque;
import model.Produto;
import model.Saida;
import model.Validade;

public class ProdutoDTO extends DTO {
    public String marca;
    private String categoria;
    private Integer quantidadeRecebida;
    private Float precoProducao;
    private Float precoVenda;
    private String fornecedor;
    private LocalDateTime dataValidadeEmbalagem;
    private Integer quantidadeMinima;
    private CodigoBarras codigoDeBarras;
    private Validade validade;
    private Entrada entrada;
    private Saida saida;
    private Estoque estoque;
    
    @Override
    public Produto builder() {
        Produto produto = new Produto();
        produto.setCategoria(categoria);
        produto.setCodigoDeBarras(codigoDeBarras);
        produto.setDataValidadeEmbalagem(dataValidadeEmbalagem);
        produto.setEntrada(entrada);
        produto.setEstoque(estoque);
        produto.setFornecedor(fornecedor);
        produto.setMarca(marca);
        produto.setPrecoProducao(precoProducao);
        produto.setPrecoVenda(precoVenda);
        produto.setQuantidadeMinima(quantidadeMinima);
        produto.setQuantidadeRecebida(quantidadeRecebida);
        produto.setSaida(saida);
        produto.setValidade(validade);
        produto.setId(id!=null?Long.valueOf(id):1);
        return produto;
    }
    
    private Object converte(Produto p) {
        ProdutoDTO dto = new ProdutoDTO();
        dto.categoria = p.getCategoria();
        dto.codigoDeBarras = p.getCodigoDeBarras();
        dto.dataValidadeEmbalagem = p.getDataValidadeEmbalagem();
        dto.entrada = p.getEntrada();
        dto.estoque = p.getEstoque();
        dto.fornecedor = p.getFornecedor();
        dto.id = p.getId().toString();
        dto.marca = p.getMarca();
        dto.precoProducao = p.getPrecoProducao();
        dto.precoVenda = p.getPrecoVenda();
        dto.quantidadeMinima = p.getQuantidadeMinima();
        dto.quantidadeRecebida = p.getQuantidadeRecebida();
        dto.saida = p.getSaida();
        dto.validade = p.getValidade();
        return dto;
    }
    
    public List getListaDados(List<Produto> dados) {
        List dadosDTO = new LinkedList();
        for (Produto dado: dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }
}
