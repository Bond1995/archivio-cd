import java.util.ArrayList;

public class CD {
	private String titolo;
	private String autore;
	ArrayList<Brano> listaBrani = new ArrayList<Brano>();
	
	public CD (String titolo, String autore){
		this.titolo = titolo;
		this.autore = autore;
	}
	
	public void addBrano(Brano brano){
		
		listaBrani.add(brano);
	}
	
	public Brano estraiBrano(){
		
		return listaBrani.get(randomInt(0, listaBrani.size()-1));
	}
	
	public Brano ricercaBrano(int i){
		return listaBrani.get(i);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autore: ");
		builder.append(autore + ";");
		builder.append("Titolo: ");
		builder.append(titolo + ";");
		for(Brano b: listaBrani){
			b.toString();
		}
		return builder.toString();
	}

	
	
}
