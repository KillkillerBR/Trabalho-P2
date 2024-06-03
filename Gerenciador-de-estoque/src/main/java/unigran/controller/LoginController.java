package unigran.controller;
import model.Login;
import persistencias.LoginDao;

public class LoginController {
    LoginDao dao = LoginDao.getInstancia();
    public void cadastrar(Login login){
        dao.salvar(login);
    }
    
    public void alterar(Login login){
        dao.atualiza(login);
    }
     public void remover(Login login){
        dao.remove(login);
    }
}
