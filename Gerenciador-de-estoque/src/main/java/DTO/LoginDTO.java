package DTO;

import java.util.LinkedList;
import java.util.List;
import model.Estoque;
import model.Funcionario;
import model.Login;

public class LoginDTO extends DTO {
    public String nome;
    private String senha;
    private Estoque estoque;
    private Funcionario funcionario;
    
    @Override
    public Login builder() {
        Login login = new Login();
        login.setEstoque(estoque);
        login.setFuncionario(funcionario);
        login.setNome(nome);
        login.setSenha(senha);
        login.setId(id!=null?Long.valueOf(id):1);
        return login;
    }
    
    private Object converte(Login l) {
        LoginDTO dto = new LoginDTO();
        dto.estoque = l.getEstoque();
        dto.funcionario = l.getFuncionario();
        dto.nome = l.getNome();
        dto.senha = l.getSenha();
        dto.id = l.getId().toString();
        return dto;
    }
    
    public List getListaDados(List<Login> dados) {
        List dadosDTO = new LinkedList();
        for (Login dado: dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }
}
