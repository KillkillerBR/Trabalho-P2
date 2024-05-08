package model;

import java.io.Serializable;
import java.time.LocalDateTime;
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
public class Saida implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime data;
    private String motivo;
    private Estoque estoque;
    private CodigoBarras codigoDeBarras;
    private NotaFiscal notaFiscal;
    private Registro registro;
    private Login login;

    @Override
    public String toString() {
        return "model.Saida[ id=" + id + " ]";
    }
    
}
