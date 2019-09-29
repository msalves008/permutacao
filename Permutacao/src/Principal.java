import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		PermultacaoSimples ps = new PermultacaoSimples();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("BEM VINDO!!!! \n Para calcular permutação SIMPLES digite 1 \n Para calcular permutação com REPETIÇÃO digite 2" );
		int opcao = entrada.nextInt();
		
		
		if ( opcao == 1) {
			System.out.println("Opção desejada: Permultação Simples \n");
			System.out.print("Digite o valor que deseja permutar");
			 ps.setNumeroFatorial(entrada.nextDouble()); 
			 ps.CalcularPermitaçãoSimpes();
					
		}
			
		
		
	}

}
