package persistencias;

import java.util.List;
import model.Login;

public class LoginDao extends Dao {
    private static final LoginDao instancia = new LoginDao();
    
    private LoginDao(){}
    
    public static LoginDao getInstancia() {
        return instancia;
    }
    
    public List listar() {
        return em.createNativeQuery("select * from cidade p", Login.class).getResultList();
    }
}
