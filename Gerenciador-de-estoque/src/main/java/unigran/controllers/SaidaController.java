package unigran.controllers;

import java.util.List;
import model.Saida;
import persistencias.SaidaDao;
import unigran.dto.DTO;


public class SaidaController implements Controller {
        @Override
    public void salvar(DTO dto) throws Exception {
        SaidaDao.getInstancia().salvar(dto);
    }
        @Override
    public String[] getTitulosColunas() {
        return new String[]{"id", "Nome"};
    }

    @Override
    public Object[] getDados(DTO o) {
        SaidaDTO dto = (SaidaDTO) o;
        return new Object[]{dto.id, dto.secao};
    }

    @Override
    public List getListaDados() {
        List<Saida> dados = SaidaDao.getInstancia().listar();
        SaidaDTO saidaDTO = new SaidaDTO();
        return saidaDTO.getListaDados(dados);
    }

    @Override
    public void remover(DTO dto) {
        SaidaDao.getInstancia().remove(dto);
    }
}