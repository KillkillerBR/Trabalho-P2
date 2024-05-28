package unigran.controller;
import model.Estoque;
import persistencias.EstoqueDao;

public class EstoqueController {
    EstoqueDao dao = EstoqueDao.getInstancia();
    public void cadastrar(Estoque estoque){
        dao.salvar(estoque);
    }
    
    public void alterar(Estoque estoque){
        dao.atualiza(estoque);
    }
     public void remover(Estoque estoque){
        dao.remove(estoque);
    }
}    

