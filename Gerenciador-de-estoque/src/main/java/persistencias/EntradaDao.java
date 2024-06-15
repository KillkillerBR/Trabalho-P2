package persistencias;

import java.util.List;
import model.Entrada;

public class EntradaDao extends Dao {
    private static final EntradaDao instancia = new EntradaDao();
    
    private EntradaDao(){}
    
    public static EntradaDao getInstancia() {
        return instancia;
    }
    
    @Override
    public List listar() {
        em.clear();
        return em.createNativeQuery("select * from entrada ", Entrada.class).getResultList();
    }
}
