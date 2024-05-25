package Visao;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.table.DefaultTableModel;

import Dominio.Cliente;
import Servico.ClienteServico;

public class ClienteFrm extends JFrame {

    private JTable tabela;

    public ClienteFrm(){
        this.setTitle("Clientes");
        this.setSize(new DimensionUIResource(800, 600));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void Exibir(){
        this.tabela = new JTable();
        this.tabela.setBounds(30, 40, 200, 300);
        this.PrepararDados();
    }

    private void PrepararDados(){
        ClienteServico servico = new ClienteServico();
        ArrayList<Cliente> lista = servico.Browse();

        DefaultTableModel mod = new DefaultTableModel(
            new Object[][]{}, 
            new String[]{"Código", "Nome", "Endereço", "Telefone", "CPF"}){

            boolean[] canEdit = new boolean[]{false, false, false, false, false};

            public boolean isCellEditable(int rowIndex, int columnIndex){
                return canEdit[columnIndex];
            }
        };

        for (Cliente cliente : lista){
            mod.addRow(new Object[]{cliente.getCodigo(), cliente.getNome(), cliente.getEndereco(), cliente.getTelefone(), cliente.getCpf()});
        }

        this.tabela.setModel(mod);
        JScrollPane painel = new JScrollPane(this.tabela);
        this.add(painel);
        this.setVisible(true);
    }
}
