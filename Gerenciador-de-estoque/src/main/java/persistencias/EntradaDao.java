package persistencias;

import java.util.List;
import model.Entrada;

public class EntradaDao extends Dao {
    private static final EntradaDao instancia = new EntradaDao();
    
    private EntradaDao(){}
    
    public static EntradaDao getInstancia() {
        return instancia;
    }
    
    public List listar() {
        return em.createNativeQuery("select * from cidade p", Entrada.class).getResultList();
    }
}
