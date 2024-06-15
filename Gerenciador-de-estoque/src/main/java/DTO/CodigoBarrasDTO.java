package DTO;

import java.util.LinkedList;
import java.util.List;
import lombok.Data;
import model.CodigoBarras;
import model.Estoque;
import model.Tipo;
@Data

public class CodigoBarrasDTO extends DTO {
    private Tipo tipo;
    private Estoque estoque;
    
    @Override
    public CodigoBarras builder() {
        CodigoBarras cb =  new CodigoBarras();
        cb.setId(id!=null?Long.valueOf(id):1);
        cb.setTipo(tipo);
        cb.setEstoque(estoque);
        return cb;
    }
    
    private Object converte (CodigoBarras cb) {
        CodigoBarrasDTO dto = new CodigoBarrasDTO();
        dto.id = cb.getId().toString();
        dto.estoque = cb.getEstoque();
        dto.tipo = cb.getTipo();
        return dto;
    }
    
    public List getListaDados (List<CodigoBarras> dados) {
        List dadosDTO = new LinkedList();
        for (CodigoBarras dado: dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }
}
