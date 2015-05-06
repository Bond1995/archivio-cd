
import java.util.ArrayList;

public class ArchivioCD {

	private ArrayList<CD> elencoCD;
	
	public ArchivioCD(CD... nuoviCD){
		elencoCD = new ArrayList<CD>();
		for (CD cd: nuoviCD) elencoCD.add(cd);
		
	}
	
	public ArchivioCD(){
		elencoCD = new ArrayList<CD>();
	}
	
	public void addCD (CD nuovo){
		
		elencoCD.add(nuovo);
		
	}
	
	public CD getCD(int index){
		
		return elencoCD.get(index);
		
	}
	
	public void removeCD(int index){
		
		elencoCD.remove(index);
		
	}
	
	public CD estraiCD(){
		
		return elencoCD.get(randomInt(0, elencoCD.size() - 1));
		
	}
	
}
