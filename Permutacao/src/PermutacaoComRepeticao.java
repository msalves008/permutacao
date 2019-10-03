
public class PermutacaoComRepeticao {
 private double nfatorial, rep1, rep2, rep3, rep4;
 
 
	 public double getNfatorial() {
		return nfatorial;
	}
	
	
	public void setNfatorial(double nfatorial) {
		this.nfatorial = nfatorial;
	}
	
	
	public double getRep1() {
		return rep1;
	}
	
	
	public void setRep1(double rep1) {
		this.rep1 = rep1;
	}
	
	
	public double getRep2() {
		return rep2;
	}
	
	
	public void setRep2(double rep2) {
		this.rep2 = rep2;
	}
	
	
	public double getRep3() {
		return rep3;
	}
	
	
	public void setRep3(double rep3) {
		this.rep3 = rep3;
	}
	
	
	public double getRep4() {
		return rep4;
	}
	
	
	public void setRep4(double rep4) {
		this.rep4 = rep4;
	}
			
	
		double f;
			
			public void fatorial(double n) {
			double f;
				f =  n; 
			
					while ( n > 1){
					  f = f *( n-1);  n--;
					}
			}
			
			public double permutacao() {
				 double result;

				 result  =  nfatorial / (rep1 *  rep2 * rep3 * rep4);
				 
				 
				 return result;
			 }
	 
 
 
}
