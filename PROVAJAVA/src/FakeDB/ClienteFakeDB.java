package FakeDB;

import java.util.HashMap;

import Dominio.Cliente;

public class ClienteFakeDB extends BaseFakeDB<Cliente>{

    @Override
    protected void CarregarDados() {
        this.tabela.put(1L, new Cliente(1L, "Amanda", "Rua Ceara, 333", "67991478520", "061.250.478-41"));
        this.tabela.put(2L, new Cliente(2L, "Beatriz", "Rua Rui Barbosa, 76", "67991478741", "062.250.478-52"));
        this.tabela.put(3L, new Cliente(3L, "Claudia", "Rua Maracaju, 147", "67991477410", "063.250.478-63"));
        this.tabela.put(4L, new Cliente(4L, "Daniela", "Rua Jose Barbosa, 851", "67991478520", "064.250.478-74"));
        this.tabela.put(5L, new Cliente(5L, "Eduarda", "Rua 14 de Julho, 6789", "67991479630", "035.250.478-85"));
    }

    @Override
    public HashMap<Long, Cliente> getTabela() {
        if(this.tabela == null){
            this.tabela = new HashMap<>();
            this.CarregarDados();
           }
    
           return this.tabela;
    }

    public ClienteFakeDB(){
        super();
    }
}
