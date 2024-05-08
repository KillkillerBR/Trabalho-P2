package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Data
@Getter @Setter @NoArgsConstructor
public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String logradouro;
    private String cep;
    private Cidade cidade;
    
    public Endereco(String logradouro, String cep, Cidade cidade) {
        this.logradouro = logradouro;
        this.cep = cep;
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "model.Endereco[ id=" + id + " ]";
    }
    
}
