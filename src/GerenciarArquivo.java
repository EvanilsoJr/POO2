import java.io.*;
import java.util.*;

public class GerenciarArquivo {
    public static void salvarTexto(List<Pessoa> lista, String nomeArquivo) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(nomeArquivo))) {
            for (Pessoa p : lista) {
                pw.println(p.getTipo() + ";" + p.getNome() + ";" + p.getTelefone());
            }
        } catch (Exception e) {
            System.out.println("Erro ao salvar arquivo de texto: " + e.getMessage());
        }
    }

    public static List<Pessoa> carregarTexto(String nomeArquivo) {
        List<Pessoa> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] p = linha.split(";");
                if (p.length >= 3) {
                    String tipo = p[0];
                    String nome = p[1];
                    String tel = p[2];

                    switch (tipo) {
                        case "Cliente" -> lista.add(new Cliente(nome, tel, "00000000000"));
                        case "Funcionário" -> lista.add(new Funcionario(nome, tel, 0));
                        case "Fornecedor" -> lista.add(new Fornecedor(nome, tel, "00000000"));
                        case "Organizador" -> lista.add(new Organizador(nome, tel, 1));
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao carregar arquivo de texto: " + e.getMessage());
        }
        return lista;
    }
}