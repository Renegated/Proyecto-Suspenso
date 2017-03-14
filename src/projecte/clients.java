package projecte;
import static projecte.Projecte.sc;
import java.sql.*;
/**
 * Classe composta i alta de nou client
 * 
 * @author Albert i Enric
 */
    //Classe composta variables clients
    public class clients extends informacio{
        String nom, cognoms, dni, data_naix, direccio, cc;
        char sexe;
        int telefon, prima;
    
        //Mètode Alta Clients
    public static void AltaClient(){
            
            Projecte persona [] = new Projecte [20];
            for(int x = 0; x < persona.length; x++){
                persona[x] = new Projecte();
            }

            for(int x = 0; x < 1; x++){
            System.out.print("Introdueix nom del client: ");
            persona[x].nom = sc.next();
            System.out.print("Cognoms: ");
            sc.skip("\n");
            persona[x].cognoms = sc.nextLine();
            System.out.print("Data naixement: ");
            persona[x].data_naix = sc.next();
            System.out.print("Sexe: ");
            persona[x].sexe = sc.next().charAt(0);
            System.out.print("Dni: ");
            persona[x].dni = sc.next();
            System.out.print("Direccio: ");
            persona[x].direccio = sc.nextLine();
            sc.nextLine();
            System.out.print("Telèfon: ");
            persona[x].telefon = sc.nextInt();
            System.out.print("Compte corrent: ");
            persona[x].cc = sc.next();
            
            
        }
        String driver = "org.apache.derby.jdbc.EmbeddedDriver";
        String connectString = "jdbc:derby://localhost:1527/sample";
        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(connectString, "app" , "app");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO CLIENTS VALUES('"
                    + persona[0].nom + "','" + persona[0].cognoms
                    + "','" + persona[0].data_naix + "','" + persona[0].sexe
                    + "','" + persona[0].dni + "','" + persona[0].direccio
                    + "','" + persona[0].telefon + "','" + persona[0].cc + "')");
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
}