package DTO;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import model.Endereco;
import model.Funcionario;
import model.Login;


public class FuncionarioDTO extends DTO {
    public String nomeCompleto;
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
        funcionario.setNomeCompleto(nomeCompleto);
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
        dto.nomeCompleto = f.getNomeCompleto();
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
