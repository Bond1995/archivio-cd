
public class Brano {

	private String titolo;
	private int minuti;
	private int secondi;

	public Brano(String titolo, int minuti, int secondi){

		this.titolo = titolo;
		this.minuti = minuti;
		this.secondi = secondi;
		
	}

	public String getTitolo() {
		
		return titolo;
		
	}
	
	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		builder.append("Titolo: ").append(titolo).append(" - Durata: ");
		
		builder.append(minuti).append(" min ").append(secondi).append(" s;\n");
		return builder.toString();
		
	}

}
