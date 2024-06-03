package unigran.controllers;

import java.util.List;
import model.Registro;
import persistencias.RegistroDao;
import unigran.dto.DTO;


public class RegistroController implements Controller {
        @Override
    public void salvar(DTO dto) throws Exception {
        RegistroDao.getInstancia().salvar(dto);
    }
        @Override
    public String[] getTitulosColunas() {
        return new String[]{"id", "Nome"};
    }

    @Override
    public Object[] getDados(DTO o) {
        RegistroDTO dto = (RegistroDTO) o;
        return new Object[]{dto.id, dto.login};
    }

    @Override
    public List getListaDados() {
        List<Registro> dados = RegistroDao.getInstancia().listar();
        RegistroDTO entradaDTO = new RegistroDTO();
        return entradaDTO.getListaDados(dados);
    }

    @Override
    public void remover(DTO dto) {
        RegistroDao.getInstancia().remove(dto);
    }
}
