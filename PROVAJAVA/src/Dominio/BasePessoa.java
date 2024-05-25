package Dominio;

public abstract class BasePessoa extends BaseDominio{
    protected String nome;
    protected String endereco;
    protected String telefone;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public BasePessoa(Long codigo, String nome, String endereco, String telefone) {
        super(codigo);
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
}
