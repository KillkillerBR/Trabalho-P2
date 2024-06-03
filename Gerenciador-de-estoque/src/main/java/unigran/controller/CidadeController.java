package unigran.controller;
import model.Cidade;
import persistencias.CidadeDao;


public class CidadeController {
    CidadeDao dao = CidadeDao.getInstancia();
    public void cadastrar(Cidade cidade){
        dao.salvar(cidade);
    }
    
    public void alterar(Cidade cidade){
        dao.atualiza(cidade);
    }
     public void remover(Cidade cidade){
        dao.remove(cidade);
    }
}
