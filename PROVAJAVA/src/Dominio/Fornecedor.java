package Dominio;

public class Fornecedor extends BasePessoa{
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Fornecedor(Long codigo, String nome, String endereco, String telefone, String cnpj) {
        super(codigo, nome, endereco, telefone);
        this.cnpj = cnpj;
    }

}
