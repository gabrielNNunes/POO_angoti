import java.util.Scanner;

public class aula3_Ex5_08_02_2018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite duas palavras para a compara��o:");
		String entrada1 = sc.next();
		String entrada2 = sc.next();
		
		if(entrada1.equals(entrada2)){
			System.out.println("S�o iguais!");
		}else{
			System.out.println("S�o diferentes!");
		}
		
		sc.close();
	}

}
