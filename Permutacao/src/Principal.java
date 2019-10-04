import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		PermultacaoSimples ps = new PermultacaoSimples();
		PermutacaoComRepeticao  pr =  new PermutacaoComRepeticao();
		Fatorial fatorial  = new Fatorial();
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("--------------------------------------------\n BEM VINDO!!!! \n--------------------------------------------");
		
		System.out.println("Para calcular permutação SIMPLES digite 1 \nPara calcular permutação com REPETIÇÃO digite 2" );
		int opcao = entrada.nextInt();
		System.out.println("-------------------------------------------------");
		while(opcao != 1 &&opcao != 2){
		
			System.out.println("Digite apenas 1 ou 2 - informe novamente: ");
			opcao = entrada.nextInt();
		}
		
			
			if ( opcao == 1) {
				System.out.println("-------------------------------------------------");
				System.out.println("Opção desejada: Permultação Simples \n");
				System.out.println("-------------------------------------------------");
				System.out.print("Digite um valor inteiro, positivo para permutar \n");
				double result = entrada.nextDouble();
				
				while (result <0) {
					System.out.println("-------------------------------------------------");
					System.out.println("ERRO!, O Valor digitado é invalido\n");
					System.out.print("Digite um valor inteiro, positivo para permutar \n");
					result = entrada.nextDouble();
				}
				ps.setNumeroFatorial(result); 
				ps.CalcularPermitaçãoSimpes();
				
			}
			else if(opcao == 2) {
				System.out.println("-------------------------------------------------");
				System.out.println("Opção desejada: Permultação Com Repetição \n");
				System.out.println("-------------------------------------------------");
				System.out.print("Digite um valor inteiro, positivo para permutar \n");
				double result = entrada.nextDouble();
				
				while (result <0) {
					System.out.println("-------------------------------------------------");
					System.out.println("ERRO!, O Valor digitado é invalido\n");
					System.out.print("Digite um valor inteiro, positivo para permutar \n");
					result = entrada.nextDouble();
				}
				fatorial.setNumeroFatorial(result);
				fatorial.CalcularFatorial();
				pr.setNfatorial(fatorial.f);
				//System.out.printf("\nNº do fatorial %4.0f ",pr.getNfatorial());
				
				System.out.print("\nDigite um valor inteiro, positivo para permutar da PRIMEIRA Repetição \n");
				double rep1 = entrada.nextDouble();

				while ( rep1 <0) {
					System.out.println("-------------------------------------------------");
					System.out.println("ERRO!, O Valor digitado é invalido\n");
					System.out.print("Digite um valor inteiro, positivo para permutar \n");
					 rep1 = entrada.nextDouble();
				}
				fatorial.setNumeroFatorial(rep1);
				fatorial.CalcularFatorial();
				pr.setRep1(fatorial.f);
				
				System.out.print("\nDigite um valor inteiro, positivo para permutar da PRIMEIRA Repetição \n");
				double rep2 = entrada.nextDouble();

				while ( rep2 <0) {
					System.out.println("-------------------------------------------------");
					System.out.println("ERRO!, O Valor digitado é invalido\n");
					System.out.print("Digite um valor inteiro, positivo para permutar \n");
					 rep2 = entrada.nextDouble();
				}
				fatorial.setNumeroFatorial(rep2);
				fatorial.CalcularFatorial();
				pr.setRep2(fatorial.f);
				
				System.out.print("\nDigite um valor inteiro, positivo para permutar da PRIMEIRA Repetição \n");
				double rep3 = entrada.nextDouble();

				while ( rep3 <0) {
					System.out.println("-------------------------------------------------");
					System.out.println("ERRO!, O Valor digitado é invalido\n");
					System.out.print("Digite um valor inteiro, positivo para permutar \n");
					 rep3 = entrada.nextDouble();
				}
				fatorial.setNumeroFatorial(rep3);
				fatorial.CalcularFatorial();
				pr.setRep3(fatorial.f);
				
				System.out.print("\nDigite um valor inteiro, positivo para permutar da PRIMEIRA Repetição \n");
				double rep4 = entrada.nextDouble();

				while ( rep4 <0) {
					System.out.println("-------------------------------------------------");
					System.out.println("ERRO!, O Valor digitado é invalido\n");
					System.out.print("Digite um valor inteiro, positivo para permutar \n");
					 rep4 = entrada.nextDouble();
				}
				fatorial.setNumeroFatorial(rep4);
				fatorial.CalcularFatorial();
				pr.setRep4(fatorial.f);
				
				
				pr.permutacao();
			}
		
		
	}

}
