package unigran.controllers;
import DTO.DTO;
import java.util.List;
import persistencias.EntradaDao;
import DTO.EntradaDTO;
import model.Entrada;


public class EntradaController implements Controller {
        @Override
    public void salvar(DTO dto) throws Exception {
        EntradaDao.getInstancia().salvar(dto);
    }
        @Override
    public String[] getTitulosColunas() {
        return new String[]{"id", "Nome"};
    }

    @Override
    public Object[] getDados(DTO o) {
        EntradaDTO dto = (EntradaDTO) o;
        return new Object[]{dto.id, dto.secao};
    }
    public void atualizar(Entrada entradaDTO) throws Exception  {
        EntradaDao.getInstancia().atualiza(entradaDTO);
    }
    @Override
    public List getListaDados() {
        List<Entrada> dados = EntradaDao.getInstancia().listar();
        EntradaDTO entradaDTO = new EntradaDTO();
        return entradaDTO.getListaDados(dados);
    }

    @Override
    public void remover(DTO dto) {
        EntradaDao.getInstancia().remove(dto);
    }
}
