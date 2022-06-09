package app;

import java.sql.Connection;
import java.util.List;

import dao.DAO;
import dao.UsuarioDAO;
import model.Usuario;

public class App {

	public static void main(String[] args) {
		/*Connection conexao = null;

		conexao = DAO.createConnection();

		if (conexao != null) {
			System.out.println("Banco conectado com sucesso!");
		} else {
			System.out.println("foi nao");
		}*/
		
		List<Usuario> lista;
		
		UsuarioDAO dao = new UsuarioDAO();
		
		lista = dao.listar();
		
		for(Usuario u: lista) {
			System.out.println(u);
		}
	}

}
