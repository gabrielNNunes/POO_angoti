import java.util.Scanner;

public class aula3_Ex3_08_02_2018 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite um raio para o círculo!");
		Circulo2 circulo2 = new Circulo2();
		circulo2.raio = sc.nextDouble();
		double area = circulo2.CalcularArea(circulo2.raio);
		double circunferencia = circulo2.CalcularCircunferencia(circulo2.raio);
		
		System.out.println("Área: "+ area);
		System.out.println("Circunferência: "+ circunferencia);
		
		sc.close();
	}

}

class Circulo2 {
	double raio;
	
	public double CalcularArea(double raio){
		double resultado=3.14 * (raio * raio);		
		return resultado;
	}
	public double CalcularCircunferencia(double raio){
		double resultado=2 * 3.14 * raio;		
		return resultado;
	}
}