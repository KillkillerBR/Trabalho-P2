package unigran.controller;
import model.Registro;
import persistencias.RegistroDao;

public class RegistroController {
   RegistroDao dao = RegistroDao.getInstancia();
    public void cadastrar(Registro registro){
        dao.salvar(registro);
    }
    
    public void alterar(Registro registro){
        dao.atualiza(registro);
    }
     public void remover(Registro registro){
        dao.remove(registro);
    }
}
