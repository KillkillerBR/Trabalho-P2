package unigran.controller;
import model.Tipo;
import persistencias.TipoDao;

public class TipoController {

    TipoDao dao = TipoDao.getInstancia();
    public void cadastrar(Tipo tipo){
        dao.salvar(tipo);
    }
    
    public void alterar(Tipo tipo){
        dao.atualiza(tipo);
    }
     public void remover(Tipo tipo){
        dao.remove(tipo);
    }
}
