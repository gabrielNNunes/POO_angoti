import java.util.Scanner;

public class aula3_Ex4_08_02_2018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma palavra:");
		String entrada = sc.nextLine();
		System.out.println(entrada.toUpperCase());		
		
		sc.close();
	}

}
