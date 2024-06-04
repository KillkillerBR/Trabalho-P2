package DTO;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import model.CodigoBarras;
import model.Estoque;
import model.Login;
import model.NotaFiscal;
import model.Registro;
import model.Saida;

public class SaidaDTO extends DTO {
    private LocalDateTime data;
    public String motivo;
    private Estoque estoque;
    private List<CodigoBarras> codigosDeBarras;
    private NotaFiscal notaFiscal;
    private Registro registro;
    private Login login;
    
    @Override
    public Saida builder() {
        Saida saida = new Saida();
        saida.setCodigosDeBarras(codigosDeBarras);
        saida.setData(data);
        saida.setEstoque(estoque);
        saida.setLogin(login);
        saida.setMotivo(motivo);
        saida.setNotaFiscal(notaFiscal);
        saida.setRegistro(registro);
        saida.setId(id!=null?Long.valueOf(id):1);
        return saida;
    }
    
    private Object converte(Saida s) {
        SaidaDTO dto = new SaidaDTO();
        dto.codigosDeBarras = s.getCodigosDeBarras();
        dto.data = s.getData();
        dto.estoque = s.getEstoque();
        dto.id = s.getId().toString();
        dto.login = s.getLogin();
        dto.motivo = s.getMotivo();
        dto.notaFiscal = s.getNotaFiscal();
        dto.registro = s.getRegistro();
        return dto;
    }
    
    public List getListaDados(List<Saida> dados) {
        List dadosDTO = new LinkedList();
        for (Saida dado: dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }
}
