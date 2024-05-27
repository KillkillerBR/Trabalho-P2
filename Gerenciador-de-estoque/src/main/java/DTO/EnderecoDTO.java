package DTO;

import java.util.LinkedList;
import java.util.List;
import model.Cidade;
import model.Endereco;

public class EnderecoDTO extends DTO {
    private String logradouro;
    private String cep;
    private Cidade cidade;
    
    @Override
    public Endereco builder() {
        Endereco endereco = new Endereco();
        endereco.setId(id!=null?Long.valueOf(id):1);
        endereco.setLogradouro(logradouro);
        endereco.setCep(cep);
        endereco.setCidade(cidade);
        return endereco;
    }
    
    private Object converte (Endereco e) {
        EnderecoDTO dto = new EnderecoDTO();
        dto.id = e.getId().toString();
        dto.cep = e.getCep();
        dto.logradouro = e.getLogradouro();
        dto.cidade = e.getCidade();
        return dto;
    }
    
    public List getListaDados(List<Endereco> dados) {
        List dadosDTO = new LinkedList(); 
        for (Endereco dado:dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }
}
