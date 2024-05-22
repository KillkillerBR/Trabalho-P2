package persistencias;

import java.util.List;
import model.Saida;

public class SaidaDao extends Dao {
    private static final SaidaDao instancia = new SaidaDao();
    
    private SaidaDao(){}
    
    public static SaidaDao getInstancia() {
        return instancia;
    }
    
    public List listar() {
        return em.createNativeQuery("select * from cidade p", Saida.class).getResultList();
    }
}
