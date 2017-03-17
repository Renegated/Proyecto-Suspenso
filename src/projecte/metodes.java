package projecte;

import java.sql.*;
import static projecte.Projecte.sc;
/**
 * Conté tots els calculs de les assegurances.
 * 
 * @author Albert i Enric
 */
public class metodes extends clients{
    
    public static void calculFamiliar(){
        int edats [] = new int [6];
        float comp = 0f;
        
        System.out.print("Nombre de persones: ");
        int persones = sc.nextInt();
        System.out.print("Capital entre 2000 i 10000: ");
        int capital = sc.nextInt();
        
        for(int i = 2000; i<=10000; i+= 500){
            
            if(capital == i){
                
                for(int x = 1; x < persones+1; x++){
                    System.out.print("Edat"+x+": ");
                    edats[x] = sc.nextInt();
                        
                    if(edats[x] >= 0 && edats[x] <= 30) comp += 6.04f;
                    if(edats[x] >= 31 && edats[x] <= 50) comp += 10.06f;
                    if(edats[x] >= 51 && edats[x] <= 69) comp += 20.42f;
                    if(edats[x] == 70) comp += 32.96f;
                }
        }
    }

        System.out.print("(1:Si 0:No) Complementari hospital: ");
        int chosp = sc.nextInt();
        if(chosp == 1) comp += 0.45f;

        System.out.println("Total: "+comp + "\n");
                        
}
    
    public static void calculVida(){
        int edat;
        float comp = 0.0f;
        String professio;
        System.out.println("Introdueix l'edat: ");
        edat = sc.nextInt();
        System.out.println("Introdueix tipus de professió: \n"
        +"(Senzilla/Perillosa?)");
        professio = sc.next();
        if(edat >= 0 && edat <= 30)
            comp += 72.89f;
        if(edat >= 31 && edat <= 50)
            comp += 204.48f;
        if(edat >= 51 && edat <= 69)
            comp += 379.82f;
        if(edat == 70)
            comp += 634.50f;
        if(professio.contains("Senzilla")){
            comp = comp + (comp*5/100);
        }else{ comp = comp + (comp*15/100);
        }
        System.out.println(comp);
    }
    
    public static void calculAccident(){
        int edat;
        float comp = 0.0f;
        String accidents;
        System.out.println("Introdueix edat: ");
        edat = sc.nextInt();
        System.out.println("Tipus d'assegurança?\n"+"24/professio/privada");
        accidents = sc.next();
        if(edat >= 0 && edat <= 30) comp += 7.51;
        if(edat >= 31 && edat <= 50) comp += 10.51;
        if(edat >= 51 && edat <= 69) comp += 25.51;
        if(edat == 70) comp += 50.51;
        if(accidents == "24") comp = comp + (comp*15/100);
        if(accidents == "professio") comp = comp + (comp*10/100);
        if(accidents == "privada"); comp = comp + (comp*7/100);
        System.out.println(comp);
    }
    
    public static void calculIncapacitatTemporal(){
        int capital;
        float comp = 0.0f;
        boolean hosp, assistencia;
        System.out.println("Quantitat a assegurar: ");
        capital = sc.nextInt();
        System.out.println("Dies a assegurar: ");
        int dies = sc.nextInt();
        comp += comp + (capital * dies)/2;
                        
        System.out.println("Assegurança d'hospitalitzacio?");
        hosp = sc.nextBoolean();
        if(hosp == true) comp+= comp * 0.5;
        else comp = comp - (comp * 0.05f);
                        
        System.out.println("Cobertura d'assistència mèdica?");
        assistencia = sc.nextBoolean();
        if(assistencia == true) comp += comp * 0.3;
        else comp = comp - (comp * 0.03f);
        System.out.println("El total es de: "+comp);
    }
    
    public static void calculLlar(){
        int capital, contingut;
        float comp = 0.0f;
        System.out.println("Insereix el continent: (60000-210000");
        capital = sc.nextInt();
        System.out.println("Insereix el contingut: (21000-50000");
        contingut = sc.nextInt();
            if(capital >= 60000 && capital <= 90000 && contingut >= 21000 && contingut <= 30000)
                comp += 116.75f;
            if(capital >= 91000 && capital <= 120000 && contingut >= 21000 && contingut <= 30000)
                comp += 146.75f;
            if(capital >= 121000 && capital <= 150000 && contingut >= 21000 && contingut <= 30000)
                comp += 176.75f;
            if(capital >= 151000 && capital <= 180000 && contingut >= 21000 && contingut <= 30000)
                comp += 206.75f;
            if(capital >= 181000 && capital <= 210000 && contingut >= 21000 && contingut <= 30000)
                comp += 236.75f;
                        
            if(capital >= 60000 && capital <= 90000 && contingut >= 31000 && contingut <= 40000)
                comp += 168.25f;
            if(capital >= 91000 && capital <= 120000 && contingut >= 31000 && contingut <= 40000)
                 comp += 218.25f;
            if(capital >= 121000 && capital <= 15000 && contingut >= 31000 && contingut <= 40000)
                comp += 268.25f;
            if(capital >= 151000 && capital <= 180000 && contingut >= 31000 && contingut <= 40000)
                comp += 318.25f;
            if(capital >= 181000 && capital <= 210000 && contingut >= 31000 && contingut <= 40000)
                comp += 368.25f;
                        
            if(capital >= 60000 && capital <= 90000 && contingut >= 41000 && contingut <= 50000)
                comp += 219.68f;
            if(capital >= 91000 && capital <= 120000 && contingut >= 41000 && contingut <= 50000)
                comp += 289.68f;
            if(capital >= 121000 && capital <= 150000 && contingut >= 41000 && contingut <= 50000)
                comp += 359.68f;
            if(capital >= 151000 && capital <= 180000 && contingut >= 41000 && contingut <= 50000)
                comp += 429.68f;
            if(capital >= 181000 && capital <= 210000 && contingut >= 21000 && contingut <= 50000)
                comp += 499.68f;
            System.out.println(comp + "\n");
    }
    
    public static void calculComunitats(){
        int construccio, nplantes;
        float comp = 0.0f;
        boolean instal, gaigua;
        System.out.println("Indica any de construccio: ");
            construccio = sc.nextInt();
            if(construccio < 1935) comp += 1200;
            if(construccio > 1936 && construccio < 1950) comp += 900;
            if(construccio > 1951 && construccio < 1979) comp += 600;
            if(construccio > 1980 && construccio < 2011) comp += 300;
        System.out.println("S'han reformat les instal·lacions");
            instal = sc.nextBoolean();
            if(instal == true) comp = comp - (comp*0.3f);
            else comp = comp + (comp*0.1f);
        System.out.println("Garantia d'aigua?");
            gaigua = sc.nextBoolean();
            if(gaigua == true) comp = comp + (comp*0.3f);
        System.out.println("Numero de plantes: ");
            nplantes = sc.nextInt();
            if(nplantes < 3) comp = comp - (comp*0.15f);
            else if(nplantes > 3 && nplantes < 6) comp = comp + (comp*0.2f);
            else if(nplantes > 6) comp = comp + (comp*0.4f);
        System.out.println("El total es de: "+comp);
    }
    
    public static void calculEstalvis(){
        float comp, rendibilitat;
        String pagament;
        System.out.println("Capital a estalviar: ");
            comp = sc.nextInt();
            comp = comp*3;
            rendibilitat = comp/10000;
        System.out.println("Hi ha una rendibilitat del: "+rendibilitat);
    }
    
    public static boolean tableAlreadyExists(SQLException e) {
        boolean exists;
        if(e.getSQLState().equals("X0Y32")) {
            exists = true;
        } else {
            exists = false;
        }
        return exists;
    }
    
    public static void CT(){
        String driver = "org.apache.derby.jdbc.EmbeddedDriver";
        String connectString = "jdbc:derby://localhost:1527/sample";
        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(connectString, "app" , "app");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("CREATE TABLE clients("
                    + "nom varchar(20),cognom varchar(20),"
                    + "data_naix varchar(20), sexe varchar(20),"
                    + "dni varchar(20), direccio varchar(20),"
                    + "tlfn varchar(20),cc varchar(20))");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException a){
            if(tableAlreadyExists(a)){
                return;
            }
        }
    }
    
    
}