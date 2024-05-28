package unigran.controller;
import model.Validade;
import persistencias.ValidadeDao;


public class ValidadeController {
   ValidadeDao dao = ValidadeDao.getInstancia();
    public void cadastrar(Validade validade){
        dao.salvar(validade);
    }
    
    public void alterar(Validade validade){
        dao.atualiza(validade);
    }
     public void remover(Validade validade){
        dao.remove(validade);
    }
}
