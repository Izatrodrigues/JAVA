package Repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Dominio.Cliente;
import FakeDB.ClienteFakeDB;

public class ClienteRepositorio extends BaseRepositorio<ClienteFakeDB, Cliente> implements IBaseRepositorio<ClienteFakeDB, Cliente> {

    public ClienteRepositorio(){
        this.fakeDB = new ClienteFakeDB();
        this.dados = this.fakeDB.getTabela();    
    }

    @Override
    public Cliente Create(Cliente instancia) {
        Long posicao = Long.valueOf(this.dados.size()) - 1;
        Long novaPosicao = posicao + 1;
        Long novaChave = this.Read(posicao).getCodigo() + 1;
        instancia.setCodigo(novaChave);
        this.dados.put(novaPosicao, instancia);
        return instancia;
    }

    @Override
    public Cliente Read(Long chave) {
        if(this.dados.containsKey(chave)){
            return this.dados.get(chave);
        } else {
            return null;
        }
    }

    @Override
    public List<Cliente> ReadAll() {
        return this.ReadAllAsArrayList();
    }

    public ArrayList<Cliente> ReadAllAsArrayList () {
        ArrayList<Cliente> lista = new ArrayList<>();
        for(Map.Entry<Long, Cliente> par : this.dados.entrySet()){
            lista.add(par.getValue());
        }
        return lista;
    }

    @Override
    public Cliente Update(Long chave, Cliente instancia) {
        if (this.dados.containsKey(chave)) {
            Cliente objVelho = this.dados.get(chave);
            if (this.dados.replace(chave, objVelho, instancia)) {
                return instancia;
            }
        }
        return null;
    }

    @Override
    public Cliente Delete(Long chave) {
        return this.dados.remove(chave);
    }
}
