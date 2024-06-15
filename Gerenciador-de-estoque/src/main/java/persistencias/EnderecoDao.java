package persistencias;

import java.util.List;
import model.Endereco;

public class EnderecoDao extends Dao {
    private static final EnderecoDao instancia = new EnderecoDao();
    
    private EnderecoDao(){}
    
    public static EnderecoDao getInstancia() {
        return instancia;
    }
    
    public List listar() {
        return em.createNativeQuery("select * from endereco", Endereco.class).getResultList();
    }
}
