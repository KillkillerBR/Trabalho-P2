package unigran.dto;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import model.Endereco;
import model.Funcionario;


public class FuncionarioDTO extends DTO {
    public String nomeFuncionario;
    public String cpfFuncionario;
    private LocalDate nascimentoFuncionario;
    private String sexoFuncionario;
    private String telefoneFuncionario;
    private String emailFuncionario;
    private String emissaoFuncionario;
    private String cargoFuncionario;
    private String funcaoFuncionario;
    private String salarioFuncionario;
    private Endereco enderecoFuncionario;
    
    @Override
    public Funcionario construtor(){
        Funcionario funcionario = new Funcionario();
        funcionario.setNomeCompleto(nomeFuncionario);
        funcionario.setId(id!=null?Long.valueOf(id):0l);
        funcionario.setCpf(cpfFuncionario);
        funcionario.setNasCimentoFuncionario(nascimentoFuncionario);
        funcionario.setSexo(sexoFuncionario);
        funcionario.setTelefone(telefoneFuncionario);
        funcionario.setEmissao(emissaoFuncionario);
        funcionario.setCargo(cargoFuncionario);
        funcionario.setFuncao(funcaoFuncionario);
        funcionario.setSalario(salarioFuncionario);
        funcionario.setEndereco(enderecoFuncionario);
        return funcionario;
    }
        public List getListaDados(List<Funcionario> dados) {
        List dadosDTO = new LinkedList();
        for (Funcionario dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

}
