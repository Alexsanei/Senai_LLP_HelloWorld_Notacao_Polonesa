import java.util.Scanner;
public class NotacaoPolonesa {
    public static void main( String[] args){
        Scanner scanner = new Scanner(System.in);
        
        String entrada = scanner.nextLine();
        int operando1, operando2;
        char operacao;
        double resultado;
        String[] partes = entrada.split(" ");
        
        operando1 = Integer.parseInt(partes[0]);
        operando2 = Integer.parseInt(partes[1]);
        
        operacao = partes[2].charAt(0);
        switch (operacao) {
            case '+':
                resultado = operando1 + operando2;
                System.out.println(resultado);

                break;
            case '-':
                resultado = operando1 - operando2;
                System.out.println(resultado);

                break;

            case '*':
                resultado = operando1 * operando2;
                System.out.println(resultado);

                break;

            case '/':
                if (operando2 == 0) {
                    System.out.println("Impossivel dividir por 0 !");
                    break;    
                }

                resultado = operando1 / operando2;
                System.out.println(resultado);

                break;
            default:
                System.out.println("Operacao inválida! ");
                break;
        }
            scanner.close();
    }
}
