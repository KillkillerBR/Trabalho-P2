package DTO;

import java.util.LinkedList;
import java.util.List;
import model.Estoque;

public class EstoqueDTO extends DTO {
    public Integer estoqueAtual;
    private Integer estoqueAnterior;
    private Integer quantidadeEntrada;
    private Integer quantidadeSaida;
    
    @Override
    public Estoque builder() {
        Estoque estoque = new Estoque();
        estoque.setId(id!=null?Long.valueOf(id):1);
        estoque.setEstoqueAnterior(estoqueAnterior);
        estoque.setEstoqueAtual(estoqueAtual);
        estoque.setQuantidadeEntrada(quantidadeEntrada);
        estoque.setQuantidadeSaida(quantidadeSaida);
        return estoque;
    }
    
    private Object converte(Estoque e) {
        EstoqueDTO dto = new EstoqueDTO();
        dto.estoqueAnterior = e.getEstoqueAnterior();
        dto.estoqueAtual = e.getEstoqueAtual();
        dto.quantidadeEntrada = e.getQuantidadeEntrada();
        dto.quantidadeSaida = e.getQuantidadeSaida();
        dto.id = e.getId().toString();
        return dto;
    }
    public List getListaDados(List<Estoque> dados) {
        List dadosDTO = new LinkedList();
        for (Estoque dado: dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }
}
