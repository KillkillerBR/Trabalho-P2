package persistencias;

import java.util.List;
import model.Funcionario;

public class FuncionarioDao extends Dao {
    private static final FuncionarioDao instancia = new FuncionarioDao();
    
    private FuncionarioDao(){}
    
    public static FuncionarioDao getInstancia() {
        return instancia;
    }
    
    public List listar() {
        return em.createNativeQuery("select * from funcionario p", Funcionario.class).getResultList();
    }
}
