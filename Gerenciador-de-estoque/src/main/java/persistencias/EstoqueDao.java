package persistencias;

import java.util.List;
import model.Estoque;

public class EstoqueDao extends Dao {
    private static final EstoqueDao instancia = new EstoqueDao();
    
    private EstoqueDao(){}
    
    public static EstoqueDao getInstancia() {
        return instancia;
    }
    
    public List listar() {
        return em.createNativeQuery("select * from cidade p", Estoque.class).getResultList();
    }
}
