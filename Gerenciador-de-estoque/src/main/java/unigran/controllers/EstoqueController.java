package unigran.controllers;

import java.util.List;
import model.Estoque;
import persistencias.EstoqueDao;
import unigran.dto.DTO;


public class EstoqueController implements Controller {

    @Override
    public void salvar(DTO dto) throws Exception {
        EstoqueDao.getInstancia().salvar(dto);
    }
        @Override
    public String[] getTitulosColunas() {
        return new String[]{"id", "Nome"};
    }

    @Override
    public Object[] getDados(DTO o) {
        EstoqueDTO dto = (EstoqueDTO) o;
        return new Object[]{dto.id, dto.nomeFuncionario};
    }

    @Override
    public List getListaDados() {
        List<Estoque> dados = EstoqueDao.getInstancia().listar();
        EstoqueDTO funcionarioDTO = new EstoqueDTO();
        return estoqueDTO.getListaDados(dados);
    }

    @Override
    public void remover(DTO dto) {
        EstoqueDao.getInstancia().remove(dto);
    }
}
