package Repositorio;

import java.util.HashMap;

public abstract class BaseRepositorio<TFakeDB, TDominio> {
    protected TFakeDB fakeDB;
    protected HashMap<Long, TDominio> dados;
    
}
