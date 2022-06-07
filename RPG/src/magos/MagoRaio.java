package magos;

import interfaces.Necromante;

public class MagoRaio extends Mago implements Necromante{
	
	@Override
	public String necromancia() {
		return "Mão do titã caído";
	}
	
	public String magiaRaio() {
		return "Lança do trovão eterno";
	}
	
}
