package unigran.controllers;

import DTO.DTO;
import DTO.RegistroDTO;
import java.util.List;
import model.Registro;
import persistencias.RegistroDao;



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
        return new Object[]{dto.id, dto.dataAcessoEntrada};
    }

    @Override
    public List getListaDados() {
        List<Registro> dados = RegistroDao.getInstancia().listar();
        RegistroDTO registroDTO = new RegistroDTO();
        return registroDTO.getListaDados(dados);
    }

    @Override
    public void remover(DTO dto) {
        RegistroDao.getInstancia().remove(dto);
    }
}
