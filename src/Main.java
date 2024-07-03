//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        verificaFinalString verificador = new verificaFinalString();

        System.out.println(verificador.verificaFinalString("programaçâo", "âo"));
        System.out.println(verificador.verificaFinalString("olá", "mundo"));
        System.out.println(verificador.verificaFinalString("", "abc"));

    }
}