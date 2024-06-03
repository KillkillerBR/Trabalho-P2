package DTO;

import java.util.LinkedList;
import java.util.List;
import model.Tipo;

public class TipoDTO extends DTO {
    String descricao;
    
    @Override
    public Tipo builder() {
        Tipo tipo = new Tipo();
        tipo.setId(id!=null?Long.valueOf(id):1);
        tipo.setDescricao(descricao);
        return tipo;
    }
    
    private Object converte(Tipo t) {
        TipoDTO dto = new TipoDTO();
        dto.id = t.getId().toString();
        dto.descricao = t.getDescricao();
        return dto;
    }
    
    public List getListaDados(List<Tipo> dados) {
        List dadosDTO = new LinkedList();
        for (Tipo dado: dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }
}
