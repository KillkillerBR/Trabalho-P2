package DTO;

import java.util.LinkedList;
import java.util.List;
import model.Endereco;
import model.Entrada;
import model.NotaFiscal;
import model.Saida;

public class NotaFiscalDTO extends DTO {
    private String cnpj;
    private String empresa;
    private Entrada entrada;
    private Saida saida;
    private Endereco endereco;
    
    @Override
    public NotaFiscal builder() {
        NotaFiscal nota = new NotaFiscal();
        nota.setCnpj(cnpj);
        nota.setEmpresa(empresa);
        nota.setEndereco(endereco);
        nota.setEntrada(entrada);
        nota.setSaida(saida);
        nota.setId(id!=null?Long.valueOf(id):1);
        return nota;
    }
    
    private Object converte(NotaFiscal n) {
        NotaFiscalDTO dto = new NotaFiscalDTO();
        dto.cnpj = n.getCnpj();
        dto.empresa = n.getEmpresa();
        dto.endereco = n.getEndereco();
        dto.entrada = n.getEntrada();
        dto.saida = n.getSaida();
        dto.id = n.getId().toString();
        return dto;
    }
    
    public List getListaDados(List<NotaFiscal> dados) {
        List dadosDTO = new LinkedList();
        for (NotaFiscal dado: dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }
}
