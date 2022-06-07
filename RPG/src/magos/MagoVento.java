package magos;

import interfaces.Necromante;

public class MagoVento extends Mago implements Necromante {

	@Override
	public String necromancia() {
		return "Exército do imperador esqueleto";
	}
	
	public String magiaVento() {
		return "Vendaval da colina";
	}

}
