import java.util.Scanner;

public class aula2_Ex5_06_02_2018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		int N3 = sc.nextInt();
		int N4 = sc.nextInt();
		String resposta = "";
		
		int M_aritmetica = (N1+N2+N3+N4)/4;
		
		if(M_aritmetica >= 6){
			resposta = "Aprovado!";
		}else{
			resposta = "Reprovado!";
		};
		
		System.out.println("M�dia Aritm�tica:"+M_aritmetica+" "+resposta);
		
		sc.close();

	}

}
