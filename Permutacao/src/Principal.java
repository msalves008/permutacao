import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		PermultacaoSimples ps = new PermultacaoSimples();
		Scanner entrada = new Scanner(System.in);
		System.out.println("-------------------------------------------------\n BEM VINDO!!!! \n-------------------------------------------------");
		
		System.out.println("Para calcular permuta��o SIMPLES digite 1 \nPara calcular permuta��o com REPETI��O digite 2" );
		int opcao = entrada.nextInt();
		System.out.println("-------------------------------------------------");
		while(opcao != 1 &&opcao != 2)
		{
			System.out.println("Digite apenas 1 ou 2 - informe novamente: ");
			opcao = entrada.nextInt();
		}
		
			
			if ( opcao == 1) {
				System.out.println("-------------------------------------------------");
				System.out.println("Op��o desejada: Permulta��o Simples \n");
				System.out.println("-------------------------------------------------");
				System.out.print("Digite um valor inteiro, positivo para permutar \n");
				double result = entrada.nextDouble();
				if (result <0) {
					System.out.println("ERRO!, O Valor digitado � invalido");
					System.out.print("Digite um valor inteiro, positivo para permutar \n");
					ps.setNumeroFatorial(entrada.nextDouble()); 
					ps.CalcularPermita��oSimpes();
				}else {
					 ps.setNumeroFatorial(result); 
					 ps.CalcularPermita��oSimpes();
				}
				
			}
			else if(opcao == 2) {
				System.out.println("-------------------------------------------------");
				System.out.println("Op��o desejada: Permulta��o Com Repeti��o \n");
				System.out.println("-------------------------------------------------");
			}
		
		
	}

}
