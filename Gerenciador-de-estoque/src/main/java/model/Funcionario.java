package model;

import java.io.Serializable;
import java.time.LocalDate;
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
public class Funcionario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private LocalDate nascimento;
    private String sexo;
    private String telefone;
    private String email;
    private LocalDate admissao;
    private String cargo;
    private String funcao;
    private String salario;
    private Endereco endereco;
    @OneToOne
    private Login login;

    

    @Override
    public String toString() {
        return "model.Funcionario[ id=" + id + " ]";
    }
    
}
