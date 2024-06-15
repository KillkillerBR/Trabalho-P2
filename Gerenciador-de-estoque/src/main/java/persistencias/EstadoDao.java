package persistencias;

import java.util.List;
import model.Estado;

public class EstadoDao extends Dao {
    private static final EstadoDao instancia = new EstadoDao();
    
    private EstadoDao(){}
    
    public static EstadoDao getInstancia() {
        return instancia;
    }
    
    @Override
    public List listar() {
        em.clear();
        return em.createNativeQuery("select * from estado p", Estado.class).getResultList();
    }
    
}
