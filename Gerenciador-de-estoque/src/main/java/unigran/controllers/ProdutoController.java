package unigran.controllers;

import DTO.DTO;
import DTO.ProdutoDTO;
import java.util.LinkedList;
import java.util.List;
import model.Produto;
import persistencias.ProdutoDao;

public class ProdutoController implements Controller {

    public void salvar(Produto produtoDTO) throws Exception {
        ProdutoDao.getInstancia().salvar(produtoDTO);
    }

    @Override
    public String[] getTitulosColunas() {
        return new String[]{"id", "Nome"};
    }

    public Object[] getDados(ProdutoDTO o) {
        ProdutoDTO dto = (ProdutoDTO) o;
        return new Object[]{dto.id, dto.marca};
    }

    @Override
    public List getListaDados() {
        List<Produto> dados = ProdutoDao.getInstancia().listar();
        for (Produto dado : dados) {
            System.out.println(dado.getId());
        }
        ProdutoDTO produtoDTO = new ProdutoDTO();
        return produtoDTO.getListaDados(dados);
    }

    public void remover(Produto produtoDTO) {
        ProdutoDao.getInstancia().remove(produtoDTO);
    }

    public void atualizar(Produto produtoDTO) throws Exception {
        ProdutoDao.getInstancia().atualiza(produtoDTO);
    }

    public List listar() {
        List<Produto> produtos = ProdutoDao.getInstancia().listar();
        ProdutoDTO dto = new ProdutoDTO();
        return dto.getListaDados(produtos);
    }
    
    
    @Override
    public Object[] getDados(DTO dto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remover(DTO dto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void salvar(DTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
