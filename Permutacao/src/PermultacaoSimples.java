
public class PermultacaoSimples {

	public static void main(String[] args) {
		
	
	double x = 69; // aqui criamos uma vari�vel que ir� armazenar o numero do fatorial
	double f = x; // aqui criamos outra var. Ser� o resultado tempor�rio da multiplica��o

		                  

	

	while (x > 1){
	  f = f *(x-1); x--;
	                    }
	  System.out.println(f); // Aqui exibira o valor final do Fatorial

	 while (x > 1){ 
	             f = f *(x-1);
	             x--;
	             System.out.println(f); // Aqui exibira o valor parcial do Fatorial, o seu �ltimo valor ser� o resultado do fatorial.               }
	
	
	
}
	  
}
}
