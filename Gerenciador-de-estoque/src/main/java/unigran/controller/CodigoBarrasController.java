
package unigran.controller;

import model.CodigoBarras;
import persistencias.CodigoBarrasDao;


public class CodigoBarrasController {
    CodigoBarrasDao dao = CodigoBarrasDao.getInstancia();
    public void cadastrar(CodigoBarras codigoBarras){
        dao.salvar(codigoBarras);
    }
    
    public void alterar(CodigoBarras codigoBarras){
        dao.atualiza(codigoBarras);
    }
     public void remover(CodigoBarras codigoBarras){
        dao.remove(codigoBarras);
    }
}

