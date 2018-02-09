import java.util.Scanner;

public class aula3_Ex2_08_02_2018 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite um raio para o círculo!");
		Circulo1 circulo1 = new Circulo1();
		circulo1.raio = sc.nextDouble();	
		System.out.println("Raio: "+circulo1.raio);
		sc.close();
	}

}

class Circulo1 {
	double raio;
	
}