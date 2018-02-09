import java.util.Scanner;

public class aula2_Ex3_06_02_2018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entrada1 = sc.nextInt();
		int entrada2 = sc.nextInt();
		int perimetro = (2 * entrada1) + (2 * entrada2);
		int area = entrada1 * entrada2;
		
		System.out.println("Perímetro: "+perimetro+" Área: "+area);
		
		sc.close();
		}

	}
