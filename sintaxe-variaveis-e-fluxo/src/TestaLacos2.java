
public class TestaLacos2 {
	public static void main(String[] args) {
		int linha, coluna;
		for(linha = 0; linha < 10; linha++) {
			for(coluna = 0; coluna < linha; coluna++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
