package computandoPatentes;

public class Main {
	
	
	public static void main(String[] args) {
		Patente p = new Patente("ABC151");
		p.getPatenteSiguiente(10);
		System.out.println(p);
	}
}
