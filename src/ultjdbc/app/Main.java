package ultjdbc.app;
import java.sql.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws SQLException {
		 System.out.println("HELLO JDBC from JAVA");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ultjdbc","root","");
		// System.out.println(con);
		 
		// Statement stmt= con.createStatement ();
		// int result = stmt.executeUpdate("insert into etudiant (nom,classe) value ('omar', '3ieme')");
		// System.out.println (result);

		// sc = new Scanner(System.in);
		
		// System.out.println("Donner un nom");
		// String nom = sc.nextLine();
		
		// System.out.println("Donner la classe");
		// String classe = sc.nextLine();
		
		 Statement stmt = con.createStatement();
		// int result = stmt.executeUpdate("insert into etudiant(nom,classe) values('"+nom+"', '"+classe+"')");
		// System.out.println("Fin du programme");
		// ResultSet rs = stmt.executeQuery("select id, nom, classe from etudiant");

		 ResultSet rs = stmt.executeQuery("select id, nom, classe from etudiant");
	 		while(rs.next()) {

	 		int id = rs.getInt("id");
	 		String nom = rs.getString("nom");
	 		String classe = rs.getString("classe");
	 		System.out.println(id+ " "+nom +" "+classe);
	 		}
	}}
	
