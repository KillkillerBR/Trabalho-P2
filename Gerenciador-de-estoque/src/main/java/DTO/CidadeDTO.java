package DTO;

import java.util.LinkedList;
import java.util.List;
import lombok.Data;
import model.Cidade;
import model.Estado;
@Data
public class CidadeDTO extends DTO {
    private String nome;
    private Estado estado;

    @Override
    public Cidade builder() {
        Cidade cidade = new Cidade();
        cidade.setId(id!=null?Long.valueOf(id):1);
        cidade.setNome(nome);
        cidade.setEstado(estado);
        return cidade;
    }
    
    private Object converte(Cidade c) {
        CidadeDTO dto = new CidadeDTO();
        dto.nome = c.getNome();
        dto.id = c.getId().toString();
        dto.estado = c.getEstado();
        return dto;
    }
    
    public List getListaDados(List<Cidade> dados) {
        List dadosDTO = new LinkedList();
        for (Cidade dado: dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }
}
