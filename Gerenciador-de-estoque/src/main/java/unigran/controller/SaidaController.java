package unigran.controller;
import model.Saida;
import persistencias.SaidaDao;


public class SaidaController {
    SaidaDao dao = SaidaDao.getInstancia();
    public void cadastrar(Saida saida){
        dao.salvar(saida);
    }
    
    public void alterar(Saida saida){
        dao.atualiza(saida);
    }
     public void remover(Saida saida){
        dao.remove(saida);
    }
}
