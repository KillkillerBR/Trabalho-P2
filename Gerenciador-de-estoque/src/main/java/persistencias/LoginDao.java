package persistencias;

import java.util.List;
import model.Login;

public class LoginDao extends Dao {
    private static final LoginDao instancia = new LoginDao();
    
    private LoginDao() {}
    
    public static LoginDao getInstancia() {
        return instancia;
    }

    @Override
    public List listar() {
        return em.createNativeQuery("select * from login", Login.class).getResultList();
    }

    public Login buscarPorNomeESenha(String nome, String senha) {
        try {
            return em.createQuery("SELECT l FROM Login l WHERE l.nome = :nome AND l.senha = :senha", Login.class)
                     .setParameter("nome", nome)
                     .setParameter("senha", senha)
                     .getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
            

        }
    }
}
