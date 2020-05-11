package computandoPatentes;

public class Patente {
	private String patente;

	public Patente(String patente) {
		this.patente = patente;
	}

	public void getPatenteSiguiente(int k) {
		char[] p = patente.toCharArray();
		for (int i = p.length - 1; i > 0 && k != 0; i--) {
			char l = p[i];
			if (esLetra(p[i])) {
				p[i] = (char) ('A' + (l - 'A' + k) % 26);
				k = (l - 'A' + k) / 26;
			} else if (esDigito(p[i])) {
				p[i] = (char) ('0' + (l - '0' + k) % 10);
				k = (l - '0' + k) / 10;
			}
		}
		pasarCharString(p);
	}

	private void pasarCharString(char[] p) {
		String pp = "";
		for (char c : p)
			pp += c;
		this.patente = pp;
	}

	private boolean esDigito(char c) {
		return c >= '0' && c <= '9';
	}

	private boolean esLetra(char p) {
		return p >= 'A' && p <= 'Z';
	}

	@Override
	public String toString() {
		return "Patente [patente=" + patente + "]";
	}

}
