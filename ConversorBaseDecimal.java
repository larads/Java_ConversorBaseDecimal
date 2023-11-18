import java.util.Scanner;

public class ConversorBaseDecimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Software de conversao de base decimal");
        System.out.println();

        while (true) {
            System.out.print("Digite um numero em decimal para conversao (ex.: 423): ");
  
            if (!scanner.hasNextInt()) {
                System.out.println("Entrada invalida. Apenas numeros sao permitidos.");
                break;
            }

            int numero = scanner.nextInt();
 
            if (numero < 1) {
                System.out.println("Apenas numeros positivos ou acima de 0 sao permitidos.");
            } else {
                System.out.println("Opcoes de bases para conversao:");
                System.out.println("1 = Converter para Binario");
                System.out.println("2 = Converter para Octal");
                System.out.println("3 = Converter para Hexadecimal");
                System.out.print("Escolha uma das opcoes acima para fazer a conversao (ex.: 1): ");

                int tipoConversao;

                if (!scanner.hasNextInt()) {
                    System.out.println("Opcao invalida, tente novamente.");
                    break;
                }

                tipoConversao = scanner.nextInt();

                if (tipoConversao == 0 || tipoConversao >= 4) {
                    System.out.println("Opcao invalida, tente novamente.");
                } else {
                    String resultado;

                    switch (tipoConversao) {
                        case 1:
                            resultado = Integer.toBinaryString(numero);
                            System.out.println("O numero em binario e " + resultado);
                            break;
                        case 2:
                            resultado = Integer.toOctalString(numero);
                            System.out.println("O numero em octal e " + resultado);
                            break;
                        case 3:
                            resultado = Integer.toHexString(numero).toUpperCase();
                            System.out.println("O numero em hexadecimal e " + resultado);
                            break;
                        default:
                            break;
                    }
                }

                System.out.print("Digite S para sair ou qualquer tecla para continuar: ");
                String sair = scanner.next().toUpperCase();
                if (sair.equals("S")) {
                    break;
                }

                System.out.println("--------------------------------------------------------------");
            }
        }
        
        scanner.close();
    }
}
