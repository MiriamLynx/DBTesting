package main;

import java.util.List;

import domain.Pokemon;
import logic.DBConnection;
import logic.DBRequest;

public class Main {
	
	private static DBConnection con = new DBConnection();
	private static DBRequest request = new DBRequest();

	public static void main(String[] args) {
		try {
			con.crearConexion();
			List<Pokemon> p = request.getAll();
			System.out.println(p);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
