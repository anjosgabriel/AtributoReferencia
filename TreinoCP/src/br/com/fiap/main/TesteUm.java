package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Produto;

import javax.swing.*;

public class TesteUm {

    public static void main(String[] args) {
        Cliente objCliente = new Cliente();
        Colaborador objColaborador = new Colaborador();
        Produto objProduto = new Produto();

        Endereco objEndColaborador = new Endereco();
        Endereco objEndCliente = new Endereco();
        
        //set classe cliente
        objCliente.setNome(JOptionPane.showInputDialog("Digite o nome do cliente: "));
        objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: ")));
        objCliente.setCpf(JOptionPane.showInputDialog("Digite o cpf: "));
        //endereço do cliente
        objEndCliente.setLogradouro(JOptionPane.showInputDialog("Digite o logradouro: "));
        objEndCliente.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite a numero: ")));
        objEndCliente.setComplemento(JOptionPane.showInputDialog("Digite o complemento: "));
        objEndCliente.setCep(JOptionPane.showInputDialog("Digite o cep: "));
        objEndCliente.setBairro(JOptionPane.showInputDialog("Digite o bairro: "));
        objEndCliente.setCidade(JOptionPane.showInputDialog("Digite o cidade: "));
        objEndCliente.setEstado(JOptionPane.showInputDialog("Digite o estado: "));

        objCliente.setEndereco(objEndCliente);

        //set classe colaborador
        objColaborador.setNome(JOptionPane.showInputDialog("Digite o nome do colaborador: "));
        objColaborador.setCargo(JOptionPane.showInputDialog("Digite o cargo: "));
        objCliente.setCpf(JOptionPane.showInputDialog("Digite o cpf: "));
        //endereço do colaborador
        objEndColaborador.setLogradouro(JOptionPane.showInputDialog("Digite o logradouro: "));
        objEndColaborador.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite a numero: ")));
        objEndColaborador.setComplemento(JOptionPane.showInputDialog("Digite o complemento: "));
        objEndColaborador.setCep(JOptionPane.showInputDialog("Digite o cep: "));
        objEndColaborador.setBairro(JOptionPane.showInputDialog("Digite o bairro: "));
        objEndColaborador.setCidade(JOptionPane.showInputDialog("Digite o cidade: "));
        objEndColaborador.setEstado(JOptionPane.showInputDialog("Digite o estado: "));

        objColaborador.setEndereco(objEndColaborador);

        //produtos
        objProduto.setNome(JOptionPane.showInputDialog("Digite o nome do produto: "));
        objProduto.setMarca(JOptionPane.showInputDialog("Digite o marca: "));
        objProduto.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo: ")));
        objProduto.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o preco: ")));

        System.out.println(
                "Nome do Cliente: "+objCliente.getNome() +
                "\nIdade do Cliente: "+objCliente.getIdade() +
                "\nCadastro de pessoa física(CPF): "+objCliente.getCpf()+
                "\nEndereço: "+ objCliente.getEndereco().getLogradouro()+
                ", "+ objCliente.getEndereco().getNumero()+
                ", "+ objCliente.getEndereco().getComplemento()+
                ", "+ objCliente.getEndereco().getBairro()+
                ", "+ objCliente.getEndereco().getCidade()+
                ", "+ objCliente.getEndereco().getEstado()+(".")+
                "\n\nProduto Comprado"+"\nNome: "+objProduto.getNome()+
                "\nCódigo: "+objProduto.getCodigo()+
                "\nMarca: "+objProduto.getMarca()+
                "\nValor: "+objProduto.getPreco()+
                "\n\nNome do Colaborador: "+objColaborador.getNome()+
                "\nCPF: "+objColaborador.getCpf()+
                "\nCargo: "+objColaborador.getCargo()+
                "\nEndereço: "+objColaborador.getEndereco().getLogradouro()+
                ", "+objColaborador.getEndereco().getNumero()+
                ", "+objColaborador.getEndereco().getComplemento()+
                ", "+objColaborador.getEndereco().getBairro()+
                ", "+objColaborador.getEndereco().getCidade()+
                ", "+objColaborador.getEndereco().getEstado()+"."+
                "\nObrigado!"
        );
    }
}
