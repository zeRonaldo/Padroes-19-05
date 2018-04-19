package locadora;

import java.util.ArrayList;
import java.util.Collection;

public class Cliente {
	 private String nome;
	  private Collection<Aluguel> fitasAlugadas = new ArrayList<Aluguel>();
	  
	  public Cliente(String nome) {
	    this.nome = nome;
	  }
	  public String getNome() {
	    return nome;
	  }
	  public void adicionaAluguel(Aluguel aluguel) {
	    getFitasAlugadas().add(aluguel);
	  }
	 
	  public void extrato(){
		  
	  }
	public Collection<Aluguel> getFitasAlugadas() {
		return fitasAlugadas;
	}
	public void setFitasAlugadas(Collection<Aluguel> fitasAlugadas) {
		this.fitasAlugadas = fitasAlugadas;
	}
}
