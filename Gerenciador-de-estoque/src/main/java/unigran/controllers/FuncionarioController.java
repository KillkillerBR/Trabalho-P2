package unigran.controllers;
import java.util.List;
import model.Funcionario;
import persistencias.FuncionarioDao;
import DTO.DTO;
import DTO.FuncionarioDTO;


public class FuncionarioController implements Controller {

    public void salvar(Funcionario funcionarioDTO) throws Exception {
        FuncionarioDao.getInstancia().salvar(funcionarioDTO);
    }
        @Override
    public String[] getTitulosColunas() {
        return new String[]{"id", "Nome"};
    }

    @Override
    public Object[] getDados(DTO o) {
        FuncionarioDTO dto = (FuncionarioDTO) o;
        return new Object[]{dto.id, dto.nome};
    }
    public void atualizar(Funcionario funcionarioDTO) throws Exception  {
        FuncionarioDao.getInstancia().atualiza(funcionarioDTO);
    }
    @Override
    public List getListaDados() {
        List<Funcionario> dados = FuncionarioDao.getInstancia().listar();
        FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
        return funcionarioDTO.getListaDados(dados);
    }

    public void remover(Funcionario funcionarioDTO) {
        FuncionarioDao.getInstancia().remove(funcionarioDTO);
    }

    @Override
    public void salvar(DTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remover(DTO dto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
