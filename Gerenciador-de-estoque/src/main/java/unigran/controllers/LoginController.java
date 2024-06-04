
package unigran.controllers;

import java.util.List;
import model.Login;
import persistencias.LoginDao;
import DTO.DTO;
import DTO.LoginDTO;

public class LoginController implements Controller {
        @Override
    public void salvar(DTO dto) throws Exception {
        LoginDao.getInstancia().salvar(dto);
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

    @Override
    public void remover(DTO dto) {
        LoginDao.getInstancia().remove(dto);
    }
}
