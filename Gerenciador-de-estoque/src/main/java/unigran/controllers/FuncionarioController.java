package unigran.controllers;
import java.util.List;
import model.Funcionario;
import persistencias.Dao;
import persistencias.FuncionarioDao;
import unigran.dto.DTO;
import unigran.dto.FuncionarioDTO;

public class FuncionarioController implements Controller {

    @Override
    public void salvar(DTO dto) throws Exception {
        FuncionarioDao.getInstancia().salvar(dto);
    }
        @Override
    public String[] getTitulosColunas() {
        return new String[]{"id", "Nome"};
    }

    @Override
    public Object[] getDados(DTO o) {
        FuncionarioDTO dto = (FuncionarioDTO) o;
        return new Object[]{dto.id, dto.estoqueAtual};
    }

    @Override
    public List getListaDados() {
        List<Funcionario> dados = FuncionarioDao.getInstancia().listar();
        FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
        return funcionarioDTO.getListaDados(dados);
    }

    @Override
    public void remover(DTO dto) {
        FuncionarioDao.getInstancia().remove(dto);
    }
}
