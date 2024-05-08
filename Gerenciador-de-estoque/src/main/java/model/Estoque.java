package model;

import java.io.Serializable;
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
public class Estoque implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer estoqueAtual;
    private Integer estoqueAnterior;
    private Integer quantidadeEntrada;
    private Integer quantidadeSaida;
    
    public Estoque(Integer entrada) {
        this.quantidadeEntrada = entrada;
        this.estoqueAtual = entrada;
        this.quantidadeSaida = 0;
        this.estoqueAnterior = 0;
    }

    @Override
    public String toString() {
        return "model.Estoque[ id=" + id + " ]";
    }
    
}
