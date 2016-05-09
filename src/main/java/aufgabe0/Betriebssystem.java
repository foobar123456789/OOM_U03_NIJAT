package aufgabe0;

public class Betriebssystem {
	private Strategie strategie ; 
	public Betriebssystem(Strategie strategie) {
		this.strategie = strategie ; 
	}


    @Override 
	public String toString() {
		return this.strategie.getOS(); 
	}
}