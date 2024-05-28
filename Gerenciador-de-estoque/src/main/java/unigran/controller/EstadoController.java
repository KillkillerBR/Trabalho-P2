
package unigran.controller;

import model.Estado;
import persistencias.EstadoDao;


public class EstadoController {
    EstadoDao dao = EstadoDao.getInstancia();
    public void cadastrar(Estado estado){
        dao.salvar(estado);
    }
    
    public void alterar(Estado estado){
        dao.atualiza(estado);
    }
     public void remover(Estado estado){
        dao.remove(estado);
    }
}
