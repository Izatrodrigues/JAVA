package Servico;

import java.util.ArrayList;

import Dominio.Cliente;
import Repositorio.ClienteRepositorio;

public class ClienteServico extends BaseServico<ClienteRepositorio, Cliente> {

    public ClienteServico(){
        this.repo = new ClienteRepositorio();
    }

    @Override
    public ArrayList<Cliente> Browse() {
        return this.repo.ReadAllAsArrayList();
    }

    @Override
    public Cliente Read(Long chave) {
        return this.repo.Read(chave);
    }

    @Override
    public Cliente Edit(Long chave, Cliente instancia) {
        return this.repo.Update(chave, instancia);
    }

    @Override
    public Cliente Add(Cliente instancia) {
        return this.repo.Create(instancia);
    }

    @Override
    public Cliente Delete(Long chave) {
        return this.repo.Delete(chave);
    }
}
