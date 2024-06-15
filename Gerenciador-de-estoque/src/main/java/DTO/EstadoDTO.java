package DTO;

import java.util.LinkedList;
import model.Estado;
import java.util.List;
import lombok.Data;
@Data

public class EstadoDTO extends DTO {
    private String nomeEstado;
    private String siglaEstado;
    
    @Override
    public Estado builder() {
        Estado estado = new Estado();
        estado.setId(id!=null?Long.valueOf(id):1);
        estado.setNomeEstado(nomeEstado);
        estado.setSiglaEstado(siglaEstado);
        return estado;
    }
    
    private Object converte(Estado e) {
        EstadoDTO dto = new EstadoDTO();
        dto.id = e.getId().toString();
        dto.nomeEstado = e.getNomeEstado();
        dto.siglaEstado = e.getSiglaEstado();
        return dto;
    }
    
    public List getListaDados(List<Estado> dados) {
        List dadosDTO = new LinkedList();
        for (Estado dado: dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }
}
