package persistencias;

import java.util.List;
import model.Produto;

public class ProdutoDao extends Dao {
    private static final ProdutoDao instancia = new ProdutoDao();
    
    private ProdutoDao(){}
    
    public static ProdutoDao getInstancia() {
        return instancia;
    }
    
    @Override
    public List listar() {
        em.clear();
        return em.createNativeQuery("select * from produto", Produto.class).getResultList();
    }
}
