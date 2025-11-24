import java.io.*;
import java.util.*;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario() {}

    public Funcionario(String nome, String telefone, double salario) throws TelefoneInvalidoException {
        super(nome, telefone);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String getTipo() {
        return "Funcionário";
    }

    @Override
    public String apresentar() {
        return "Funcionário: " + getNome() + " | Salário: R$ " + salario;
    }
}