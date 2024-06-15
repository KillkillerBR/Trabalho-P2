package persistencias;

import java.util.List;
import model.Cidade;

public class CidadeDao extends Dao {
    private static final CidadeDao instancia = new CidadeDao();
    
    private CidadeDao(){}
    
    public static CidadeDao getInstancia() {
        return instancia;
    }
    
    @Override
    public List listar() {
        em.clear();
        return em.createNativeQuery("select * from cidade p", Cidade.class).getResultList();
    }
    
}
