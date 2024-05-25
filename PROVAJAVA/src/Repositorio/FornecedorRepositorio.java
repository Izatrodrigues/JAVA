package Repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Dominio.Fornecedor;
import FakeDB.FornecedorFakeDB;

public class FornecedorRepositorio extends BaseRepositorio<FornecedorFakeDB, Fornecedor> implements IBaseRepositorio<FornecedorFakeDB, Fornecedor> {

    public FornecedorRepositorio(){
        this.dados = this.fakeDB.getTabela();
    }

    @Override
    public Fornecedor Create(Fornecedor instancia) {
        Long posicao = Long.valueOf(this.dados.size()) - 1;
        Long novaPosicao = posicao + 1;
        Long novaChave = this.Read(posicao).getCodigo() + 1;
        instancia.setCodigo(novaChave);
        this.dados.put(novaPosicao, instancia);
        return instancia;
    }

    @Override
    public Fornecedor Read(Long chave) {
        if(this.dados.containsKey(chave)){
            return this.dados.get(chave);
        } else {
            return null;
        }
    }

    @Override
    public List<Fornecedor> ReadAll() {
        return this.ReadAllAsArrayList();
    }

    public ArrayList<Fornecedor> ReadAllAsArrayList () {
        ArrayList<Fornecedor> lista = new ArrayList<>();
        for(Map.Entry<Long, Fornecedor> par : this.dados.entrySet()){
            lista.add(par.getValue());
        }
        return lista;
    }

    @Override
    public Fornecedor Update(Long chave, Fornecedor instancia) {
        if (this.dados.containsKey(chave)) {
            Fornecedor objVelho = this.dados.get(chave);
            if (this.dados.replace(chave, objVelho, instancia)) {
                return instancia;
            }
        }
        return null;
    }

    @Override
    public Fornecedor Delete(Long chave) {
        return this.dados.remove(chave);
    }
}
