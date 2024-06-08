package unigran.controllers;
import DTO.CidadeDTO;
import java.util.List;
import model.Cidade;
import persistencias.CidadeDao;

public class CidadeController {
    private CidadeDao cidadeDao;

    public CidadeController() {
        cidadeDao = CidadeDao.getInstancia();
    }

    public List<CidadeDTO> getCidades() {
       List<Cidade> cidades = cidadeDao.listar();
       CidadeDTO cidadeDTO = new CidadeDTO();
       return cidadeDTO.getListaDados(cidades);
    }
}
