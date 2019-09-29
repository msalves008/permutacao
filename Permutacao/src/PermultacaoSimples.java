
public class PermultacaoSimples {

	public static void main(String[] args) {
		
	
	double x = 69; // aqui criamos uma variável que irá armazenar o numero do fatorial
	double f = x; // aqui criamos outra var. Será o resultado temporário da multiplicação

		                  

	

	while (x > 1){
	  f = f *(x-1); x--;
	                    }
	  System.out.println(f); // Aqui exibira o valor final do Fatorial

	 while (x > 1){ 
	             f = f *(x-1);
	             x--;
	             System.out.println(f); // Aqui exibira o valor parcial do Fatorial, o seu último valor será o resultado do fatorial.               }
	
	
	
}
	  
}
}
