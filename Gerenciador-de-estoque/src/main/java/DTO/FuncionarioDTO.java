package DTO;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import lombok.Data;
import model.Endereco;
import model.Funcionario;
import model.Login;
@Data
public class FuncionarioDTO extends DTO {
    public String nome;
    public String cpf;
    public LocalDate nascimento;
    public String sexo;
    public String telefone;
    public String email;
    public LocalDate admissao;
    public String cargo;
    public String funcao;
    public String salario;
    public Endereco endereco;
    private Login login;
    @Override
    public Funcionario builder() {
        Funcionario funcionario = new Funcionario();
        funcionario.setCargo(cargo);
        funcionario.setCpf(cpf);
        funcionario.setEmail(email);
        funcionario.setId(id!=null?Long.valueOf(id):1);
        funcionario.setAdmissao(admissao);
        funcionario.setEndereco(endereco);
        funcionario.setFuncao(funcao);
        funcionario.setLogin(login);
        funcionario.setNascimento(nascimento);
        funcionario.setNome(nome);
        funcionario.setSalario(salario);
        funcionario.setSexo(sexo);
        funcionario.setTelefone(telefone);
        return funcionario;
    }
    
    private Object converte(Funcionario f) {
        FuncionarioDTO dto = new FuncionarioDTO();
        dto.cargo = f.getCargo();
        dto.cpf = f.getCpf();
        dto.email = f.getEmail();
        dto.admissao = f.getAdmissao();
        dto.endereco = f.getEndereco();
        dto.funcao = f.getFuncao();
        dto.id = f.getId().toString();
        dto.login = f.getLogin();
        dto.nascimento = f.getNascimento();
        dto.nome = f.getNome();
        dto.salario = f.getSalario();
        dto.sexo = f.getSexo();
        dto.telefone = f.getTelefone();
        return dto;
    }
    
    public List getListaDados(List<Funcionario> dados) {
        List dadosDTO = new LinkedList();
        for (Funcionario dado: dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }
}
