package Repositorio;
import java.util.List;

// Modelo CRUD

public interface IBaseRepositorio<TFakeDB, TDominio> {
    TDominio Create(TDominio instancia);

    TDominio Read(Long chave);
    List<TDominio> ReadAll();
    
    TDominio Update(Long chave, TDominio instancia);

    TDominio Delete(Long chave);
}