
import ing.unibs.esercitazioni.mylib.myUtil;

public class CDMain {

	public static final String SALUTO = "Ciao e Benvenuto nel tuo Archivio CD!\n";
	public static final String CONFERMA_USCITA = "Vuoi davvero uscire?";
	public static final String ARRIVEDERCI = "Grazie e arrivederci!";
	public static final String TITOLO = "Elenco funzioni:";
	public static final String ERRORE_SCELTA = "Attenzione: e' stata scelta un'opzione inesistente!";
	public static final String MESS_AUTORE = "Inserisci il nome dell'autore del nuovo CD:";
	public static final String MESS_TITOLO = "Inserisci il titolo del nuovo CD:";
	public static final String MESS_ELIMINARE = "Inserisci il titolo del disco da eliminare:";
	public static final String ERRORE_CD_NON_TROVATO = "Attenzione: disco non presente in archivio!";
	public static final String MESS_BRANO_TITOLO = "Brano %d, inserisci il titolo:%n";
	public static final String MESS_BRANO_MINUTI = "Brano %d, inserisci i minuti:%n";
	public static final String MESS_BRANO_SECONDI = "Brano %d, inserisci i secondi:%n";
	public static final String MESS_ALTRO_BRANO = "Vuoi inserire un altro brano al disco?";
	public static final String ERRORE_DOPPIO = "Attenzione: il CD inserito è già in archivio!";
	public static final String MESS_MOSTRA_CD = "Inserisci il titolo del CD da mostrare:";
	public static final String ERRORE_ARCHIVIO_VUOTO = "Attenzione: l'archivio è vuoto!";
	public static final int MIN_MINUTI = 0;
	public static final int MAX_MINUTI = 200;
	public static final int MIN_SECONDI = 0;
	public static final int MAX_SECONDI = 60;
	
	public static final String[] VOCI = {"Esci", "Aggiungi CD", "Rimuovi CD", "Mostra CD", "Mostra collezione", "Selezione casuale"};
	
	public static void main(String[] args) {
		
		System.out.println(SALUTO);
		MyMenu menu = new MyMenu (TITOLO, VOCI);
		ArchivioCd mioArchivio = new ArchivioCd();
		int scelta = 0;
		
		do {
			
			scelta = menu.scegliVoce();
			if (scelta != 0) eseguiScelta(mioArchivio, scelta);
		
		} while (scelta != 0);
		
		System.out.println(ARRIVEDERCI);
		
	}
	
	private static void eseguiScelta(ArchivioCd archivio, int scelta) {
		
		switch (scelta) {
		
		case 1: addCd(archivio); break;
		
		case 2: removeCd(archivio); break;
		
		case 3: showCd(archivio); break;
		
		case 4: System.out.println(archivio.toString()); break;
		
		case 5: selezioneCasuale(archivio); break;
		
		default: System.out.println(ERRORE_SCELTA);
		
		}
		
	}
	
	private static void addCd(ArchivioCd archivio) {
		
		System.out.println(MESS_AUTORE);
		String autore = myUtil.leggiStringaConSpazi();
		System.out.println(MESS_TITOLO);
		String titolo = myUtil.leggiStringaConSpazi();
		
		if (archivio.contiene(titolo)) System.out.println(ERRORE_DOPPIO);
		else {
			
			Cd nuovoCD = new Cd(titolo, autore);
			addBrani(nuovoCD);
			archivio.aggiungiCd(nuovoCD);
		
		}
		
	}
	
	private static void addBrani(Cd nuovoCD) {
		
		boolean finito = false;
		int n = 1;
		
		do {
			
			System.out.printf(MESS_BRANO_TITOLO, n);
			String titoloBrano = myUtil.leggiStringaConSpazi();
			System.out.printf(MESS_BRANO_MINUTI, n);
			int minutiBrano = myUtil.leggiInt(MIN_MINUTI, MAX_MINUTI);
			System.out.printf(MESS_BRANO_SECONDI, n);
			int secondiBrano = myUtil.leggiInt(MIN_SECONDI, MAX_SECONDI);
			
			Brano nuovoBrano = new Brano(titoloBrano, minutiBrano, secondiBrano);
			nuovoCD.aggiungiBrano(nuovoBrano);
			n++;
			finito = myUtil.yesOrNo(MESS_ALTRO_BRANO);
			
		} while (!finito);
		
	}
	
	private static void removeCd(ArchivioCd archivio) {
		
		System.out.println(MESS_ELIMINARE);
		String titolo = myUtil.leggiStringaConSpazi();
		if(!archivio.eliminaCd(titolo)) System.out.println(ERRORE_CD_NON_TROVATO);
		
	}
	
	private static void showCd(ArchivioCd archivio) {
		
		System.out.println(MESS_MOSTRA_CD);
		String titoloCercato = myUtil.leggiStringaConSpazi();
		Cd discoCercato = archivio.findCd(titoloCercato);
		if (discoCercato == null) System.out.println(ERRORE_CD_NON_TROVATO);
		else System.out.println(discoCercato.toString());
		
	}
	
	private static void selezioneCasuale(ArchivioCd archivio) {
		
		if (archivio.getNumeroCd() == 0) System.out.println(ERRORE_ARCHIVIO_VUOTO);
		else System.out.println(archivio.estraiCD().branoCasuale().toString());
		
	}

}
