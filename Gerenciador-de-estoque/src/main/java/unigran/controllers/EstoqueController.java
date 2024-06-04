package unigran.controllers;

import java.util.List;
import model.Estoque;
import persistencias.EstoqueDao;
import DTO.DTO;
import DTO.EstoqueDTO;


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
        return new Object[]{dto.id, dto.estoqueAtual};
    }

    @Override
    public List getListaDados() {
        List<Estoque> dados = EstoqueDao.getInstancia().listar();
        EstoqueDTO estoqueDTO = new EstoqueDTO();
        return estoqueDTO.getListaDados(dados);
    }

    @Override
    public void remover(DTO dto) {
        EstoqueDao.getInstancia().remove(dto);
    }
}
