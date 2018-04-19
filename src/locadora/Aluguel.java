package locadora;

public class Aluguel {
	 private Fita fita;
	  private int diasAlugada;
	  public Aluguel(Fita fita, int diasAlugada) {
	    this.fita = fita;
	    this.diasAlugada = diasAlugada;
	  }
	  public Fita getFita() {
	    return fita;
	  }
	  public int getDiasAlugada() {
	    return diasAlugada;
	  }
	  public String getTítulo() {
		    return this.fita.getTítulo();
		  }
	public int getCódigoDePreço() {
		    return this.fita.getCódigoDePreço();
	}
	public double getPreço(){
		double valorCorrente = 0.0;
	      switch(this.getCódigoDePreço()) {
	      case Fita.NORMAL:
	        valorCorrente += 2;
	        if(this.getDiasAlugada() > 2) {
	          valorCorrente += (this.getDiasAlugada() - 2) * 1.5;
	        }
	        break;
	      case Fita.LANÇAMENTO:
	        valorCorrente += this.getDiasAlugada() * 3;
	        break;
	      case Fita.INFANTIL:
	        valorCorrente += 1.5;
	        if(this.getDiasAlugada() > 3) {
	          valorCorrente += (this.getDiasAlugada() - 3) * 1.5;
	        }
	        break;
	      } 
	     return valorCorrente;
	}
	public int somaPontos(){
		
		int pontosDeAlugadorFrequente = 1;
	      // adiciona bonus para aluguel de um lançamento por pelo menos 2 dias
	      if(this.getCódigoDePreço() == Fita.LANÇAMENTO &&
	         this.getDiasAlugada() > 1) {
	         pontosDeAlugadorFrequente++;
	      }
	      return pontosDeAlugadorFrequente;
	}
	public String extratoParcial(){
		String result = "\t"+this.getTítulo()+"\t - \t R$"+this.getPreço();
		return result;
	}
}