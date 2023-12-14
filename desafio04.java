package repetições;
import java.util.Scanner;
public class desafio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero ");
		int resp = entrada.nextInt();
		int x = 1;
		int y = 1;
		int qnt = 0;
		int qnt2 = 0;
		System.out.println("IMPARES");
		while(x <= resp) {
			if(x%2!=0) {
			System.out.print(x + " ");
			qnt++;
			} x++;
		
		} System.out.println("\n quantidade numeros impares: " + qnt);
		
		System.out.println("\nPARES");
		while(y <= resp) {
			if(y%2==0) {
			System.out.print(y + " ");
			qnt2++;
			} y++;
			
		} System.out.println("\n quantidade numeros pares: " + qnt2);
	}

}