package magos;

import interfaces.Necromante;

public class MagoRaio extends Mago implements Necromante{
	
	@Override
	public String necromancia() {
		return "M�o do tit� ca�do";
	}
	
	public String magiaRaio() {
		return "Lan�a do trov�o eterno";
	}
	
}
