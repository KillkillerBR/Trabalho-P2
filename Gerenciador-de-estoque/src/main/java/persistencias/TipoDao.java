package persistencias;

import java.util.List;
import model.Tipo;

public class TipoDao extends Dao {
    private static final TipoDao instancia = new TipoDao();
    
    private TipoDao(){}
    
    public static TipoDao getInstancia() {
        return instancia;
    }
    
    @Override
    public List listar() {
        em.clear();
        return em.createNativeQuery("select * from cidade p", Tipo.class).getResultList();
    }
}
