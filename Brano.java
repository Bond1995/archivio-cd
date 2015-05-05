package unibs.ing.aut.java.claduio;

public class Brano {
	
private String titolo;
private String durata;

public Brano(String titolo, String durata){
	
	this.titolo = titolo;
	this.durata= durata;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Titolo: ");
	builder.append(titolo + ";" );
	builder.append("durata: ");
	builder.append(durata + ".\n");

	return builder.toString();
}


}
