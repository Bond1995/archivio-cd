import java.util.ArrayList;

public class ArchivioCD {

	ArrayList<CD> elencoCD = new ArrayList<CD>();
	
	public ArchivioCD(CD... nuoviCD){
		
		for (CD cd: nuoviCD) elencoCD.add(cd);
		
	}
	
	
	public void addCD (CD nuovo){
		
		elencoCD.add(nuovo);
		
	}
	
	public CD getCD(int index){
		
		return elenco.get(index);
		
	}
	
	public void removeCD(int index){
		
		elencoCD.remove(index);
		
	}
	
	public CD estraiCD(){
		
		return elencoCD.get(randomInt(0, elencoCD.size() - 1));
		
	}
	
}
