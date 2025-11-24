import java.io.*;
import java.util.*;

abstract class Pessoa implements Serializable {
    private String nome;
    private String telefone;

    public Pessoa() {}

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) throws TelefoneInvalidoException {
        if (!Validador.validarTelefone(telefone)) {
            throw new TelefoneInvalidoException("Telefone inválido: " + telefone);
        }
        this.telefone = telefone;
    }

    public abstract String getTipo();
    public abstract String apresentar();
}