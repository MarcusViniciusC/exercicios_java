package game;

import magos.MagoFogo;
import magos.MagoGelo;
import magos.MagoRaio;
import magos.MagoVento;

public class App {

	public static void main(String[] args) {
		String fala1 = "O poder de ";
		String fala2 = " é de ";
		String acao = ": ";
		MagoFogo magoFogo = new MagoFogo();
		MagoGelo magoGelo = new MagoGelo();
		MagoRaio magoRaio = new MagoRaio();
		MagoVento magoVento = new MagoVento();
		
		magoFogo.setNome("Magno");
		magoFogo.setPoder(70);
		///////////////////////////
		magoGelo.setNome("Frost");
		magoGelo.setPoder(60);
		///////////////////////////
		magoRaio.setNome("Raiden");
		magoRaio.setPoder(90);
		///////////////////////////
		magoVento.setNome("Vector");
		magoVento.setPoder(70);
		//////////////////////////
		
		System.out.println(fala1 + magoFogo.getNome()+ fala2 +magoFogo.getPoder());
		
		System.out.println(fala1 + magoRaio.getNome()+ fala2 +magoRaio.getPoder());
		
		System.out.println(magoRaio.getNome()+acao+ magoRaio.magiaRaio());
		System.out.println(magoFogo.getNome()+acao+magoFogo.magiaFogo());
		System.out.println(magoFogo.getNome()+acao+magoFogo.recarregarMagia()+" e "+magoFogo.curar());
		System.out.println(magoRaio.getNome()+acao+ magoRaio.necromancia());
		
		
	}

}
