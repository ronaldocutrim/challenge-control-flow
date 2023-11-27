import errors.ParametrosInvalidosException;

import java.util.Scanner;

public class Contactor {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            Contactor.contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException paramException) {
            System.out.println(paramException.getMessage() + " First param must be greather than the second");
        }catch (Exception exception) {
            System.out.println(exception.getMessage() + " Error");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        if(parametroUm > parametroDois) throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;
        System.out.println(contagem);
        for (int c = 1; contagem >= c; c++) {
            System.out.println(c + " " + "de " + contagem);
        }

    }
}
