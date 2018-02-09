import java.util.Scanner;

public class aula3_Ex1_08_02_2018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Casa casa = new Casa(); 
		
		System.out.println("Digite um nome!");
		casa.proprietario.nome = sc.nextLine();
		System.out.println("Digite um logradouro!");
		casa.endereco.logradouro = sc.nextLine();
		System.out.println("Digite um número!");
		casa.endereco.numero = sc.nextLine();
		System.out.println("Digite uma cidade!");
		casa.endereco.cidade = sc.nextLine();
		System.out.println("Digite um estado!");
		casa.endereco.estado = sc.nextLine();
		System.out.println("Digite um CEP!");
		casa.endereco.CEP = sc.nextLine();
		
		System.out.print(
				"\nProprietário: "+casa.proprietario.nome+
				"\nLogradouro: "+casa.endereco.logradouro+
				"\nnúmero: "+casa.endereco.numero+
				"\ncidade: "+casa.endereco.cidade+
				"\nestado: "+casa.endereco.estado+
				"\nCPF: "+casa.endereco.CEP
				);
		
		sc.close();
	}

}

class Pessoa {
	String nome;		
			
		}
class Endereco {
	 String logradouro;
	 String numero;
	 String cidade;
	 String estado;
	 String CEP;
	
}
class Casa {
	Pessoa proprietario = new Pessoa();
	Endereco endereco = new Endereco();
	
}