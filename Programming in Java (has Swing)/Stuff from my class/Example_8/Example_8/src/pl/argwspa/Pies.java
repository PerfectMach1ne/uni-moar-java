package pl.argwspa;

public class Pies {

	public void ruszaDoAtaku(String text) {
		this.skacze();
		this.warczy();
		this.szczeka(text);
	}
	
	private void skacze() {
		System.out.println("Psisko wykonuje skok ...");
		
	}
	
	private void warczy() {
		System.out.println("ostrzegawcze warknięcie");
		
	}
	
	private void szczeka(String szczekanie) {
		System.out.println(szczekanie + " ..waw, waw, waw ....");
	}
 }
