package Dominio;

public abstract class BaseDominio {
    protected Long codigo;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public BaseDominio(Long codigo) {
        this.codigo = codigo;
    }
}

