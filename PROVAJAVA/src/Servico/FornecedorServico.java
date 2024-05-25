package Servico;

import java.util.ArrayList;

import Dominio.Fornecedor;
import Repositorio.FornecedorRepositorio;

public class FornecedorServico extends BaseServico<FornecedorRepositorio, Fornecedor> {

    public FornecedorServico(){
        this.repo = new FornecedorRepositorio();
    }

    @Override
    public ArrayList<Fornecedor> Browse() {
        return this.repo.ReadAllAsArrayList();
    }

    @Override
    public Fornecedor Read(Long chave) {
        return this.repo.Read(chave);
    }

    @Override
    public Fornecedor Edit(Long chave, Fornecedor instancia) {
        return this.repo.Update(chave, instancia);
    }

    @Override
    public Fornecedor Add(Fornecedor instancia) {
        return this.repo.Create(instancia);
    }

    @Override
    public Fornecedor Delete(Long chave) {
        return this.repo.Delete(chave);
    }
}
