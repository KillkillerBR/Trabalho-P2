package unigran.controller;

import model.Entrada;
import persistencias.EntradaDao;

public class EntradaController {
    EntradaDao dao = EntradaDao.getInstancia();
    public void cadastrar(Entrada entrada){
        dao.salvar(entrada);
    }
    public void alterar(Entrada entrada){
        dao.atualiza(entrada);
    }
     public void remover(Entrada entrada){
        dao.remove(entrada);
    }    
}
