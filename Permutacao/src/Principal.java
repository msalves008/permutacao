import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		PermultacaoSimples ps = new PermultacaoSimples();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("BEM VINDO!!!! \n Para calcular permuta��o SIMPLES digite 1 \n Para calcular permuta��o com REPETI��O digite 2" );
		int opcao = entrada.nextInt();
		
		
		if ( opcao == 1) {
			System.out.println("Op��o desejada: Permulta��o Simples \n");
			System.out.print("Digite o valor que deseja permutar");
			 ps.setNumeroFatorial(entrada.nextDouble()); 
			 ps.CalcularPermita��oSimpes();
					
		}
			
		
		
	}

}
