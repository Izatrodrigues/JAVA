package Servico;

import java.util.ArrayList;

public abstract class BaseServico<TRepositorio, TDominio>{
    protected TRepositorio repo;

    public abstract ArrayList<TDominio> Browse();
    public abstract TDominio Read(Long chave);
    public abstract TDominio Edit(Long chave, TDominio instancia);
    public abstract TDominio Add(TDominio instancia);
    public abstract TDominio Delete(Long chave);
    

}
