package DTO;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import model.CodigoBarras;
import model.Entrada;
import model.Estoque;
import model.Login;
import model.NotaFiscal;
import model.Registro;

public class EntradaDTO extends DTO {
    private LocalDateTime data;
    public String secao;
    private List<CodigoBarras> codigosDeBarras;
    private Estoque estoque;
    private Login login;
    private NotaFiscal notaFiscal;
    private Registro registro;
    
   @Override
   public Entrada builder() {
       Entrada entrada = new Entrada();
       entrada.setId(id!=null?Long.valueOf(id):1);
       entrada.setData(data);
       entrada.setSecao(secao);
       entrada.setCodigosDeBarras(codigosDeBarras);
       entrada.setEstoque(estoque);
       entrada.setLogin(login);
       entrada.setNotaFiscal(notaFiscal);
       entrada.setRegistro(registro);
       return entrada;
   }
   
   private Object converte(Entrada e) {
       EntradaDTO dto = new EntradaDTO();
       dto.codigosDeBarras = e.getCodigosDeBarras();
       dto.data = e.getData();
       dto.estoque = e.getEstoque();
       dto.id = e.getId().toString();
       dto.login = e.getLogin();
       dto.notaFiscal = e.getNotaFiscal();
       dto.registro = e.getRegistro();
       dto.secao = e.getSecao();
       return dto;
   }
   
   public List getListaDados(List<Entrada> dados) {
       List dadosDTO = new LinkedList();
       for (Entrada dado: dados) {
           dadosDTO.add(converte(dado));
       }
       return dadosDTO;
   }
}
