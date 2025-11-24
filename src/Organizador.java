import java.io.*;
import java.util.*;

public class Organizador extends Pessoa {
    private int nivel;

    public Organizador() {}

    public Organizador(String nome, String telefone, int nivel) throws TelefoneInvalidoException {
        super(nome, telefone);
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String getTipo() {
        return "Organizador";
    }

    @Override
    public String apresentar() {
        return "Organizador: " + getNome() + " | Nível: " + nivel;
    }
}