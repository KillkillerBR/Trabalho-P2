package unigran.controllers;
import java.util.List;
import DTO.DTO;


public interface Controller {
    public String[] getTitulosColunas();
    public Object[] getDados(DTO dto);
    public List getListaDados();
    public void remover(DTO dto);
    public void salvar(DTO dto) throws Exception;

}
