
public class Fatorial {
	public static void main(String[] args) {
		int n = 4;
		int i, fatorial = 1;
		for(i = 1; i < n; i++) {
			fatorial *= (i + 1);
		}
		System.out.println("o fatorial de " + n + " é " + fatorial);
		
	}

}
