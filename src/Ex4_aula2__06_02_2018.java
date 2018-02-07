import java.util.Scanner;

public class Ex4_aula2__06_02_2018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		int N3 = sc.nextInt();
		int N4 = sc.nextInt();
		
		int M_aritmetica = (N1+N2+N3+N4)/4;
		
		System.out.println("Média Aritmética:"+M_aritmetica);
		
		sc.close();

	}

}
