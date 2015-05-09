
import java.util.ArrayList;
import ing.unibs.esercitazioni.mylib.*;;

public class Cd {
	
	private String titolo;
	private String autore;
	private ArrayList<Brano> listaBrani;
	public static final String MESS_LISTA_BRANI = "\nLista Brani:\n";
	public static final String MESS_ELENCO_BRANI = "%d - %s";
	
	public Cd (String titolo, String autore){
		
		this.titolo = titolo;
		this.autore = autore;
		listaBrani = new ArrayList<Brano>();
		
	}
	
	public void aggiungiBrano(Brano brano){
		
		listaBrani.add(brano);
	}
	
	public Brano branoCasuale(){
		
		return listaBrani.get(myUtil.randomInt(0, listaBrani.size() - 1));
		
	}
	
	public Brano ricercaBrano(int i){
		return listaBrani.get(i);
	}

	public boolean equalsCD(String autore, String titolo) {
		
		if (this.autore.equalsIgnoreCase(autore) && this.titolo.equalsIgnoreCase(titolo)) return true;
		return false;
		
	}
	
	public String getTitolo() {
		
		return this.titolo;
		
	}
	
	public boolean haTitolo(String titolo) {
		
		if (this.titolo == titolo) return true;
		return false;
		
	}
	
	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		builder.append("Autore: ").append(autore).append(" - Titolo: ").append(titolo);
		
		if (listaBrani.size() > 0) builder.append(MESS_LISTA_BRANI);
		
		for (int i = 0; i < listaBrani.size(); i++) {
			
			Brano elemento = listaBrani.get(i);
			builder.append(String.format(MESS_ELENCO_BRANI, (i+1), elemento.toString()));
			
		}
		
		return builder.toString();
		
	}
	
}
