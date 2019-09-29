
public class PermultacaoSimples {		
	
	double numeroFatorial ; 
	double f;
	
	
		                  

	public double getNumeroFatorial() {
		return numeroFatorial;
	}




	public void setNumeroFatorial(double numeroFatorial) {
		this.numeroFatorial = numeroFatorial;
	}




	public double getF() {
		return f;
	}




	public void setF(double f) {
		this.f = f;
	}

	

	public void CalcularPermitaçãoSimpes() {
		 f = numeroFatorial; 

		while (numeroFatorial > 1){
		  f = f *(numeroFatorial-1); numeroFatorial--;
		}
		  System.out.println(f); // Aqui exibira o valor final do Fatorial
	
		 while (numeroFatorial > 1){ 
		    f = f *(numeroFatorial-1);
		    numeroFatorial--;
		    System.out.println(f); 
	
		 }
	
	 }
	  
}

