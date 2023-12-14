package repetições;

public class desafio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		while (x < 100) {
			System.out.print(x % 2!= 0 ? x + " " : "");
			x = x + 1;
		}
	}

}