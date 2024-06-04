package unigran.controllers;
import DTO.DTO;
import DTO.ProdutoDTO;
import java.util.List;
import model.Produto;
import persistencias.ProdutoDao;


public class ProdutoController implements Controller {

    @Override
    public void salvar(DTO dto) throws Exception {
        ProdutoDao.getInstancia().salvar(dto);
    }
        @Override
    public String[] getTitulosColunas() {
        return new String[]{"id", "Nome"};
    }

    @Override
    public Object[] getDados(DTO o) {
        ProdutoDTO dto = (ProdutoDTO) o;
        return new Object[]{dto.id, dto.marca};
    }

    @Override
    public List getListaDados() {
        List<Produto> dados = ProdutoDao.getInstancia().listar();
        ProdutoDTO produtoDTO = new ProdutoDTO();
        return produtoDTO.getListaDados(dados);
    }

    @Override
    public void remover(DTO dto) {
        ProdutoDao.getInstancia().remove(dto);
    }
}