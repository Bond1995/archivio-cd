
import java.util.ArrayList;
import ing.unibs.esercitazioni.mylib.*;

public class ArchivioCd {

	private ArrayList<Cd> elencoCD;
	public static final String ERRORE_ARCHIVIO_VUOTO = "Attenzione: l'archivio è vuoto!";
	public static final String MESS_CD = "CD n. %d%n%s";
	
	public ArchivioCd(){
		
		elencoCD = new ArrayList<Cd>();
		
	}
	
	public Cd findCd (String titoloCercato) {
		
		for (Cd cd: elencoCD) {
			
			if (cd.getTitolo().equals(titoloCercato)) return cd;
			
		}
		
		return null;
		
	}
	
	public boolean contiene (String titoloCercato) {
		
		for (Cd cd: elencoCD) {
			
			if (cd.getTitolo().equals(titoloCercato)) return true;
			
		}
		
		return false;
	}
	
	public void aggiungiCd(Cd nuovoCD) {
		
		elencoCD.add(nuovoCD);
		
	}
	
	public int getNumeroCd() {
		
		return elencoCD.size();
		
	}
	
	public Cd getCD(int index){
		
		return elencoCD.get(index);
		
	}
	
	public boolean eliminaCd(String titolo){
		
		if (!elencoCD.remove(findCd(titolo))) return false;
		return true;
		
	}
	
	public Cd estraiCD(){
		
		return elencoCD.get(myUtil.randomInt(0, elencoCD.size() - 1));
		
	}

	@Override
	public String toString() {
		
		if (elencoCD.size() == 0) return ERRORE_ARCHIVIO_VUOTO;
		
		StringBuilder builder = new StringBuilder();
		
		for (int i=0; i < elencoCD.size(); i++) {
			
			Cd elemento = elencoCD.get(i);
			builder.append(String.format(MESS_CD, (i+1), elemento.toString()));
			 
		}
		
		return builder.toString();
		
	}
	
}
