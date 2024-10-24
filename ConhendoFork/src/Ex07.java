/*Triângulo de Asteriscos com Condição: Imprima um triângulo de asteriscos de 
 * altura N, onde N é fornecido pelo usuário, mas não deve ser menor que 1.
 */
import java.util.Scanner;
// pyerre
public class Ex07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		
		int n;
		
		System.out.println("Escolha qual tamanho será seu triangulo (digite um número acima de 1): ");
		n = scanner .nextInt();
		
		if (n <=1) {
			System.out.print("Erro, número digitado abaixo de 1. Tente novamente!");
		}
		else {
			for (int i = 1; i<=n; i++) {
				for(int j = i; j < n; j++) {
					System.out.print(" ");
				}
				for (int k = 1;k <= (2 * i -1);k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		scanner.close();
		
	}

}