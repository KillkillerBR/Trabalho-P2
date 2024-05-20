package persistencias;

import java.util.List;
import model.CodigoBarras;

public class CodigoBarrasDao extends Dao {
   private static final CodigoBarrasDao instancia = new CodigoBarrasDao();
    
    private CodigoBarrasDao(){}
    
    public static CodigoBarrasDao getInstancia() {
        return instancia;
    }
    
    public List listar() {
        return em.createNativeQuery("select * from cidade p", CodigoBarras.class).getResultList();
    } 
}
