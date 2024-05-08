package model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter @Setter @NoArgsConstructor
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String marca;
    private String categoria;
    private Integer quantidadeRecebida;
    private Float precoProducao;
    private Float precoVenda;
    private String fornecedor;
    private LocalDateTime dataValidadeEmbalagem;
    private Integer quantidadeMinima;
    private CodigoBarras codigoDeBarras;
    private Validade validade;
    private List<Entrada> entradas;
    private List<Saida> saidas;
    private Estoque estoque;

    @Override
    public String toString() {
        return "model.Produto[ id=" + id + " ]";
    }
    
}
