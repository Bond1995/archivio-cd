
public class MyMenu {
	
	private String titolo;
	private String voci[];
	public static final String VOCE_USCITA = "0\tEsci";
	
	public MyMenu (String titolo, String voci []){
		this.titolo = titolo;
		this.voci = voci;
	}
	
	public int scegliVoce(){
		
		stampaMenu();
		return nextInt(0, voci.length-1);
	}
	
	public  void stampaMenu (){
		
		System.out.println(titolo);
		for(int i = 0; i < voci.length; i++){
			System.out.println((i+1) + "\t" + voci[i] + "\n" );
		}
		System.out.println(VOCE_USCITA);
	}
}
