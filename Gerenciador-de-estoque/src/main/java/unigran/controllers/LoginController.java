package unigran.controllers;

import java.util.List;
import model.Login;
import persistencias.LoginDao;
import DTO.DTO;
import DTO.LoginDTO;

public class LoginController implements Controller {

    
    public void salvar(Login loginDTO) throws Exception {
        LoginDao.getInstancia().salvar(loginDTO);
         
    }

    @Override
    public String[] getTitulosColunas() {
        return new String[]{"id", "Nome"};
    }

    @Override
    public Object[] getDados(DTO o) {
        LoginDTO dto = (LoginDTO) o;
        return new Object[]{dto.id, dto.nome};
    }

    @Override
    public List getListaDados() {
        List<Login> dados = LoginDao.getInstancia().listar();
        LoginDTO loginDTO = new LoginDTO();
        return loginDTO.getListaDados(dados);
    }

    public void remover(LoginDTO loginDTO) {
         LoginDao.getInstancia().remove(loginDTO);
    }

    public Login buscarPorNomeESenha(String nome, String senha) {
        return LoginDao.getInstancia().buscarPorNomeESenha(nome, senha);
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
