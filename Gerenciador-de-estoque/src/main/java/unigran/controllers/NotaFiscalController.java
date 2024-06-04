package unigran.controllers;
import java.util.List;
import model.NotaFiscal;
import persistencias.NotaFiscalDao;
import DTO.DTO;
import DTO.NotaFiscalDTO;

public class NotaFiscalController implements Controller {
        @Override
    public void salvar(DTO dto) throws Exception {
        NotaFiscalDao.getInstancia().salvar(dto);
    }
        @Override
    public String[] getTitulosColunas() {
        return new String[]{"id", "Nome"};
    }

    @Override
    public Object[] getDados(DTO o) {
        NotaFiscalDTO dto = (NotaFiscalDTO) o;
        return new Object[]{dto.id, dto.cnpj};
    }

    @Override
    public List getListaDados() {
        List<NotaFiscal> dados = NotaFiscalDao.getInstancia().listar();
        NotaFiscalDTO notaFiscalDTO = new NotaFiscalDTO();
        return notaFiscalDTO.getListaDados(dados);
    }

    @Override
    public void remover(DTO dto) {
        NotaFiscalDao.getInstancia().remove(dto);
    }
}