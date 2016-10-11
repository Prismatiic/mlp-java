import java.util.Scanner;

public class ProgramaPrincipal {
	public static void main(String[] args) {

		boolean sair = true;
		int op;
		float num1 = 0;
		float num2 = 0;


		
		\\teste
		
		while (sair) {
			Scanner leitor = new Scanner(System.in);
			System.out.print("1-soma\n");
			System.out.print("2-subtracao\n");
			System.out.print("3-multiplicacao\n");
			System.out.print("4-divisao\n");
			System.out.print("5-sair\n");
			System.out.print("Digite sua opcao\n");
			op = leitor.nextInt();
			System.out.println("Digite os 2 numeros\n");
			num1 = leitor.nextFloat();
			num2 = leitor.nextFloat();

			switch (op) {

			case 1: {
				// soma=num1+num2;
				System.out.println("Resultado da soma: " + (num1 + num2));
				break;
			}
			case 2: {
				// subtracao=num1-num2;
				System.out.println("Resultado da subtracao" + (num1 - num2));
				break;
			}
			case 3: {
				System.out.println("Resultado da multiplicacao:" + (num1 * num2));
				break;

			}
			case 4: {
				System.out.println("Resultado da divisao" + (num1 / num2));
				break;
			}
			case 5: {
				sair = true;
				break;
			}
			}
			leitor.close();
		}

	}

}
