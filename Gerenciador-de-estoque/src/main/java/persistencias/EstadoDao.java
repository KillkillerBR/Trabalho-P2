package persistencias;

import java.util.List;

public class EstadoDao extends Dao {
    private static final EstadoDao instancia = new EstadoDao();
    
    private EstadoDao(){}
    
    public static EstadoDao getInstancia() {
        return instancia;
    }
    
    public List listar() {
        return null;
    }
    
}
