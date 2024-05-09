package model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter @Setter @NoArgsConstructor
public class Entrada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime data;
    private String secao;
    private List<CodigoBarras> codigosDeBarras;
    private Estoque estoque;
    private Login login;
    @OneToOne
    private NotaFiscal notaFiscal;
    private Registro registro;

    @Override
    public String toString() {
        return "model.Entrada[ id=" + id + " ]";
    }
    
}
