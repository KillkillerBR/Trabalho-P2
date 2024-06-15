package DTO;
    
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import model.Entrada;
import model.Validade;
import lombok.Data;
@Data
public class ValidadeDTO extends DTO {
    private LocalDateTime fabricacao;
    private Entrada entrada;
    
    @Override
    public Validade builder() {
        Validade validade = new Validade();
        validade.setEntrada(entrada);
        validade.setFabricacao(fabricacao);
        validade.setId(id!=null?Long.valueOf(id):1);
        return validade;
    }
    
    private Object converte(Validade v) {
        ValidadeDTO dto = new ValidadeDTO();
        dto.entrada = v.getEntrada();
        dto.fabricacao = v.getFabricacao();
        dto.id = v.getId().toString();
        return dto;
    }
    
    public List getListaDados(List<Validade> dados) {
        List dadosDTO = new LinkedList();
        for (Validade dado: dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }
}
