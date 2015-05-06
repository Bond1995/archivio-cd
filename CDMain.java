
public class CDMain {

	public static final String SALUTO = "Ciao e Benvenuto nel tuo ArchivioCD!\n\n";
	public static final String CONFERMA_USCITA = "Vuoi davvero uscire?";
	public static final String TITOLO = "Elenco funzioni";
	
	public static final String[] VOCI = {"Inserisci CD", "Visualizza CD", "Rimuovi CD", "Visualizza collezione", "Selezione casuale"};
	
	public static void main(String[] args) {
		
		System.out.println(SALUTO);
		MyMenu menu = new MyMenu (TITOLO, VOCI);
		ArchivioCD mioArchivio = new ArchivioCD();
		
		do {
			int scelta = menu.scegliVoce();
			switch (scelta){
				
			case 1: mioArchivio.addCD(nuovo);
			}
		}
	}
	
}
