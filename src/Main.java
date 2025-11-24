import java.io.*;
import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Pessoa> pessoas = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opc;
        do {
            System.out.println("===== MENU =====");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Listar pessoas");
            System.out.println("3 - Simular eventos em 6 meses");
            System.out.println("4 - Salvar cadastro em backup");
            System.out.println("5 - Adicionar ao backup de cadastros");
            System.out.println("6 - Simular exceção");
            System.out.println("0 - Sair");
            opc = sc.nextInt(); sc.nextLine();

            switch (opc) {
                case 1 -> cadastrarCliente();
                case 2 -> listarPessoas();
                case 3 -> simulacao();
                case 4 -> salvarDados();
                case 5 -> carregarDados();
                case 6 -> forcarErro();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opc != 0);
    }

    public static void cadastrarCliente() {
        try {
            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Telefone: ");
            String tel = sc.nextLine();

            System.out.println("CPF: ");
            String cpf = sc.nextLine();

            Cliente c = new Cliente(nome, tel, cpf);
            pessoas.add(c);
            System.out.println("Cliente cadastrado!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void listarPessoas() {
        for (Pessoa p : pessoas) {
            System.out.println(p.apresentar());
        }
    }

    public static void salvarDados() {
        GerenciarArquivo.salvarTexto(pessoas, "pessoas.txt");
    }

    public static void carregarDados() {
        pessoas = new ArrayList<>(GerenciarArquivo.carregarTexto("pessoas.txt"));
    }

    public static void simulacao() {
        Calendar cal = Calendar.getInstance();
        for (int i = 1; i <= 6; i++) {
            cal.add(Calendar.MONTH, -1);
            System.out.println("Evento " + i + " | Data: " + cal.getTime());
        }
    }

    public static void forcarErro() {
        try {
            System.out.println("Forçando telefone inválido...");
            Cliente foneInvalido = new Cliente("Teste", "11", "12345678910");
            pessoas.add(foneInvalido);
        } catch (TelefoneInvalidoException e) {
            System.out.println("Capturado na exception de telefone: " + e.getMessage());
        } catch (CPFInvalidoException e) {
            System.out.println("Capturado na exception de CPF: " + e.getMessage());
        }
    }
}