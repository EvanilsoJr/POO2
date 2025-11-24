import java.io.*;
import java.util.*;

public class Cliente extends Pessoa {
    private String cpf;
    private Evento evento;

    public Cliente() {}

    public Cliente(String nome, String telefone, String cpf) throws CPFInvalidoException, TelefoneInvalidoException {
        super(nome, telefone);
        setCpf(cpf);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws CPFInvalidoException {
        if (!Validador.validarCpf(cpf)) {
            throw new CPFInvalidoException("CPF inválido: " + cpf);
        }
        this.cpf = cpf;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Evento getEvento() {
        return evento;
    }

    @Override
    public String getTipo() {
        return "Cliente";
    }

    @Override
    public String apresentar() {
        return "Cliente: " + getNome() + " | CPF: " + cpf;
    }
}