package FakeDB;

import java.util.HashMap;

public abstract class BaseFakeDB<TDominio>{
    protected TDominio dominio;
    protected HashMap<Long, TDominio> tabela;

    public abstract HashMap<Long, TDominio> getTabela();

    public BaseFakeDB(){
        this.tabela = new HashMap<>();
        this.CarregarDados();
    }

    protected abstract void CarregarDados();
}
