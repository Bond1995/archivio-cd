
import ing.unibs.esercitazioni.mylib.*;

public class MyMenu {
	
	private String titolo;
	private String voci[];
	
	public MyMenu (String titolo, String voci []){
		this.titolo = titolo;
		this.voci = voci;
	}
	
	public int scegliVoce(){
		
		stampaMenu();
		return (myUtil.leggiInt(1, voci.length) - 1);
		
	}
	
	public  void stampaMenu (){
		
		System.out.println(titolo);
		for(int i = 0; i < voci.length; i++) 
			System.out.println((i+1) + "\t" + voci[i] + "\n" );
		
	}

}
