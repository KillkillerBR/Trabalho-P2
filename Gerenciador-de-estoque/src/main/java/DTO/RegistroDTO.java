package DTO;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import model.Login;
import model.Registro;

public class RegistroDTO extends DTO {
    private LocalDateTime dataAcessoEntrada;
    private LocalDateTime dataEntradaProduto;
    private LocalDateTime dataAcessoSaida;
    private LocalDateTime dataSaidaProduto;
    private Login login;
    
    @Override
    public Registro builder() {
        Registro registro = new Registro();
        registro.setId(id!=null?Long.valueOf(id):1);
        registro.setDataAcessoEntrada(dataAcessoEntrada);
        registro.setDataAcessoSaida(dataAcessoSaida);
        registro.setDataEntradaProduto(dataEntradaProduto);
        registro.setDataSaidaProduto(dataSaidaProduto);
        registro.setLogin(login);
        return registro;
    }
    
    private Object converte(Registro r) {
        RegistroDTO dto = new RegistroDTO();
        dto.dataAcessoEntrada = r.getDataAcessoEntrada();
        dto.dataAcessoSaida = r.getDataAcessoSaida();
        dto.dataEntradaProduto = r.getDataEntradaProduto();
        dto.dataSaidaProduto = r.getDataSaidaProduto();
        dto.login = r.getLogin();
        dto.id = r.getId().toString();
        return dto;
    }
    
    public List getListaDados(List<Registro> dados) {
        List dadosDTO = new LinkedList();
        for (Registro dado: dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }
}
