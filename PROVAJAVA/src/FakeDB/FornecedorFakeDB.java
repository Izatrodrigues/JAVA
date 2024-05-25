package FakeDB;

import java.util.HashMap;

import Dominio.Fornecedor;

public class FornecedorFakeDB extends BaseFakeDB<Fornecedor>{

    @Override
    protected void CarregarDados() {
       this.tabela.put(6L, new Fornecedor(6L, "Luiz", "AV. Julio de Castilho", "67992458635", "32.241.661/0001-03"));
       this.tabela.put(7L, new Fornecedor(7L, "Maria", "Rua das Flores, 123", "67991567890", "45.987.654/0001-09"));
       this.tabela.put(8L, new Fornecedor(8L, "João", "Av. Brasil, 456", "67991345678", "12.345.678/0001-01"));
       this.tabela.put(9L, new Fornecedor(9L, "Ana", "Rua dos Limoeiros, 789", "67991234567", "98.765.432/0001-02"));
       this.tabela.put(10L, new Fornecedor(10L, "Carlos", "Av. Principal, 321", "67991122334", "23.456.789/0001-04"));
    }

    @Override
    public HashMap<Long, Fornecedor> getTabela() {
        if(this.tabela == null){
            this.tabela = new HashMap<>();
            this.CarregarDados();
           }
    
           return this.tabela;
    }
    
    public FornecedorFakeDB(){
        super();
    }
}
