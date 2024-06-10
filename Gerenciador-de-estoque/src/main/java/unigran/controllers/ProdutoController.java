package unigran.controllers;
import DTO.DTO;
import DTO.ProdutoDTO;
import java.util.LinkedList;
import java.util.List;
import model.Produto;
import persistencias.ProdutoDao;


public class ProdutoController implements Controller {


    public void salvar(ProdutoDTO produtoDTO) throws Exception {
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
        ProdutoDTO produtoDTO = new ProdutoDTO();
        return produtoDTO.getListaDados(dados);
    }

    public void remover(ProdutoDTO dto) {
        ProdutoDao.getInstancia().remove(dto);
    }
    
    public void atualizar(ProdutoDTO dto) {
        ProdutoDao.getInstancia().atualiza(dto);
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