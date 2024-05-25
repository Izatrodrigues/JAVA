package Dominio;

public class Cliente extends BasePessoa {
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Cliente(Long codigo, String nome, String endereco, String telefone, String cpf) {
        super(codigo, nome, endereco, telefone);
        this.cpf = cpf;
    }

}
