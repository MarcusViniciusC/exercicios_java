package serviços;

public class Validacao {
	public boolean verificarLogin(String usuario, String senha) {
		if(usuario.equals("Marcus")&& senha.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
}
