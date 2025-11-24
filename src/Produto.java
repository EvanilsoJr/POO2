import java.io.*;
import java.util.*;

public class Produto implements Serializable {
    private String nome;
    private double preco;
    private List<Fornecedor> fornecedores = new ArrayList<>();

    public Produto() {}

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void adicionarFornecedor(Fornecedor f) {
        fornecedores.add(f);
    }

    public List<Fornecedor> getFornecedores() {
        return fornecedores;
    }
}