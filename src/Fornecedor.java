import java.io.*;
import java.util.*;

public class Fornecedor extends Pessoa {
    private String cnpj;
    private List<Produto> produtos = new ArrayList<>();

    public Fornecedor() {}

    public Fornecedor(String nome, String telefone, String cnpj) throws TelefoneInvalidoException {
        super(nome, telefone);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(Produto p) {
        if (!produtos.contains(p)) {
            produtos.add(p);
        }
    }

    @Override
    public String getTipo() {
        return "Fornecedor";
    }

    @Override
    public String apresentar() {
        return "Fornecedor: " + getNome() + " | CNPJ: " + cnpj;
    }
}