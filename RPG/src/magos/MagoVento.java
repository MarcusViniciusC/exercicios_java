package magos;

import interfaces.Necromante;

public class MagoVento extends Mago implements Necromante {

	@Override
	public String necromancia() {
		return "Ex�rcito do imperador esqueleto";
	}
	
	public String magiaVento() {
		return "Vendaval da colina";
	}

}
