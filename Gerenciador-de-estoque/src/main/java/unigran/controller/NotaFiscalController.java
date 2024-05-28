
package unigran.controller;

import model.NotaFiscal;
import persistencias.NotaFiscalDao;


public class NotaFiscalController {
    NotaFiscalDao dao = NotaFiscalDao.getInstancia();
    public void cadastrar(NotaFiscal notaFiscal){
        dao.salvar(notaFiscal);
    }
    
    public void alterar(NotaFiscal notaFiscal){
        dao.atualiza(notaFiscal);
    }
     public void remover(NotaFiscal notaFiscal){
        dao.remove(notaFiscal);
    }
}

