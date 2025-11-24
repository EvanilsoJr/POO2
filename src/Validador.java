public class Validador {
    public static boolean validarTelefone(String t) {
        if (t == null || t.length() < 8) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean validarCpf(String cpf) {
        if (cpf == null || cpf.length() != 11) {
            return false;
        } else {
            return true;
        }
    }
}