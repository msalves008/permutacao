
public class Fatorial {

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
	

		public double CalcularFatorial() {
			 f = numeroFatorial; 
	
			while (numeroFatorial > 1){
			  f = f *(numeroFatorial-1); numeroFatorial--;
			}
			  //System.out.printf("O Resultado desta Permuta��o �: %4.0f",f); // Aqui exibira o valor final do Fatorial
		return f;
			 	
		 }
	  
}
