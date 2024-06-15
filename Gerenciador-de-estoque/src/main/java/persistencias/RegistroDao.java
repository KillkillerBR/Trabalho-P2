package persistencias;

import java.util.List;
import model.Registro;

public class RegistroDao extends Dao {
    private static final RegistroDao instancia = new RegistroDao();
    
    private RegistroDao(){}
    
    public static RegistroDao getInstancia() {
        return instancia;
    }
    
    @Override
    public List listar() {
        em.clear();
        return em.createNativeQuery("select * from cidade p", Registro.class).getResultList();
    }
}
