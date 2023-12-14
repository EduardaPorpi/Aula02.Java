package repetições;
import java.util.Scanner;
public class desafio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont = 1;
		double soma_nota = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos alunos tem na turma? ");
		int alunos = entrada.nextInt();
		
		while (cont <= alunos) {
			System.out.println("Digite a nota do aluno: ");
			int nota = entrada.nextInt();
			cont = cont + 1;	
			soma_nota = soma_nota + nota;
		}
		double media = soma_nota / alunos;
		System.out.println("A media da turma " + media);
	}

}