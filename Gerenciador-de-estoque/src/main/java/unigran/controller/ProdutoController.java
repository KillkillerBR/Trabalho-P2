package unigran.controller;
import model.Produto;
import persistencias.ProdutoDao;

public class ProdutoController {
    ProdutoDao dao = ProdutoDao.getInstancia();
    public void cadastrar(Produto produto){
        dao.salvar(produto);
    }
    
    public void alterar(Produto produto){
        dao.atualiza(produto);
    }
     public void remover(Produto produto){
        dao.remove(produto);
    }
}
