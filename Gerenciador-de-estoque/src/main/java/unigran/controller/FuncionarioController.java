package unigran.controller;
import java.util.Date;
import model.Funcionario;
import persistencias.FuncionarioDao;

public class FuncionarioController {
    FuncionarioDao dao = FuncionarioDao.getInstancia();
    public void cadastrar(Funcionario funcionario){
        dao.salvar(funcionario);
    }
    
    public void alterar(Funcionario funcionario){
        dao.atualiza(funcionario);
    }
     public void remover(Funcionario funcionario){
        dao.remove(funcionario);
    }
}

