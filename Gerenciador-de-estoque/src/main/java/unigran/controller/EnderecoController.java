package unigran.controller;

import model.Endereco;
import persistencias.EnderecoDao;


public class EnderecoController {
    EnderecoDao dao = EnderecoDao.getInstancia();
    public void cadastrar(Endereco endereco){
        dao.salvar(endereco);
    }
    
    public void alterar(Endereco endereco){
        dao.atualiza(endereco);
    }
     public void remover(Endereco endereco){
        dao.remove(endereco);
    }
}

