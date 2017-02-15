package projecte;
import java.sql.*;
import java.util.Scanner;
public class Projecte {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int opcio, infor, capital, contingut, edat, construccio, nplantes, jubi, difedat;
        String professio, accidents, pagament;
        boolean hosp, assistencia, instal, gaigua;
        float comp = 0f;
        client persona [] = new client [20];
        
        for(int x = 0; x < persona.length; x++){
            persona[x] = new client();
        }
        
        do{
          /****************************
          ****** Menú principal ******
          ****************************/
        System.out.println("Menú: \n"+
                "1. Pressupost assegurança\n"+
                "2. Tarificador\n"+
                "3. Informació\n"+
                "4. Sortir\n");
        int iEnd;
        opcio = sc.nextInt();
        
        switch(opcio){
            
            /****************************
            ****** Pressupostador *******
            ****************************/
            case 1:
                System.out.println("Introdueix el tipus d'assegurança: \n"+
                "1. Familiar\n"+
                "2. Vida\n"+
                "3. Accident\n"+
                "4. Incapacitat temporal\n"+
                "5. Llar\n"+
                "6. Comunitats\n"+
                "7. Estalvis\n");
     
                int tipus = sc.nextInt();
                
                switch(tipus){
                    case 1:
                        familiar();
                        System.out.println("Desitja fer alguna cosa mes? (1:Si 2:No)");
                                iEnd = sc.nextInt();
                                if(iEnd == 1)break;
                                else if(iEnd == 2){
                                    System.out.println("Gracies per confiar en nosaltres.");
                                    opcio = 4; 
                                    break;
                                }
                    case 2:
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
                        }else{
                            comp = comp + (comp*15/100);
                        }
                        System.out.println(comp);
                        break;
                        
                    case 3:
                        System.out.println("Introdueix edat: ");
                        edat = sc.nextInt();
                        System.out.println("Tipus d'assegurança?\n"+
                                "24/professio/privada");
                        accidents = sc.next();
                        if(edat >= 0 && edat <= 30)
                            comp += 7.51;
                        if(edat >= 31 && edat <= 50)
                            comp += 10.51;
                        if(edat >= 51 && edat <= 69)
                            comp += 25.51;
                        if(edat == 70)
                            comp += 50.51;
                        if(accidents == "24")
                            comp = comp + (comp*15/100);
                        if(accidents == "professio")
                            comp = comp + (comp*10/100);
                        if(accidents == "privada");
                            comp = comp + (comp*7/100);
                        System.out.println(comp);
                        break;
                        
                    case 4:
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
                        break;
                    case 5:
                        
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
                System.out.println("Desitja fer alguna cosa mes? (1:Si 2:No)");
                        iEnd = sc.nextInt();
                        if(iEnd == 1)break;
                        else if(iEnd == 2){
                            System.out.println("Gracies per confiar en nosaltres.");
                            opcio = 4; 
                            break;
                        }
                        
                    case 6:
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
                        break;
                        
                    case 7:
                        System.out.println("Capital a estalviar: ");
                        comp = sc.nextInt();
                        System.out.println("Edat: ");
                        edat = sc.nextInt();
                        System.out.println("Edat de jubilacio: ");
                        jubi = sc.nextInt();
                        difedat = jubi-edat;
                        System.out.println("Forma de pagament: ");
                        pagament = sc.next();
                        if("24".equals(pagament)){
                            comp = comp*3;
                        }
                        System.out.println(comp*difedat);
                        break;
                }
                break;
               
            /****************************
            ******** Tarificador ********
            ****************************/
            case 2:
                tarificador();
                System.out.println("Desitja fer alguna cosa mes? (1:Si 2:No)");
                iEnd = sc.nextInt();
                if(iEnd == 1)break;
                else if(iEnd == 2){
                    System.out.println("Gracies per confiar en nosaltres.");
                    opcio = 4; 
                    break;
                }                
            case 3:
                informacio();
                break;
            case 4:
                System.out.println("Has sortit del programa");
                break;
            case -1:
                db_connect();
                break;
        }
        }while(opcio <= 4 && opcio >= -1);
        
    }


    /****************************************
    ****** Classe composta tarificador ******
    ****************************************/
    static class client{
        String nom;
        String cognoms;
        String dni;
        String data_naix;
        String direccio;
        char sexe;
        int telefon;
        long cc;
        int prima;
    }

    
            /****************************
            ********  DATABASE  *********
            ****************************/
    
public static void db_connect(){
    try{
        Class.forName("org.postgresql.Driver");
    }catch(ClassNotFoundException e){
        e.printStackTrace();
    }
    Connection connection = null;
        Scanner sc = new Scanner(System.in);
        try {
                connection = DriverManager.getConnection("jdbc:postgresql://192.168.252.146:5432/daxterneitor", "postgres","");
        } catch (SQLException e) {
                System.out.println("Connection Failed! Check output console");
                e.printStackTrace();
                return;
        }
        if (connection != null) {
            try{
                    System.out.println("Introdueix el que vols fer:");
                    System.out.println("1.Executar comanda SQL.\n2.Sortir.");
                    int exe = sc.nextInt();
                    do{
                    System.out.println("...");
                    sc.next();
                    String SQLCommand = sc.nextLine();
                    Statement stmt = connection.createStatement();
                    stmt.executeQuery(SQLCommand);
                    if(SQLCommand.contains("SELECT")){
                        ResultSet rs = stmt.executeQuery(SQLCommand);
                            while (rs.next())
                            {
                               System.out.println(rs.getString(1));
                            } rs.close();
                        }
                    else{
                    }
                    System.out.println("Something else?");
                    exe=sc.nextInt();
                    }while(exe == 1);
            }catch(SQLException sql){
            }
               
            } 
        else{
                System.out.println("Failed to make connection!");
        }
}



            /****************************
            ******** Informació *********
            ****************************/
public static void informacio(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el tipus d'assegurança: \n"+
    "1. Familiar\n"+
    "2. Vida\n"+
    "3. Accident\n"+
    "4. Incapacitat temporal\n"+
    "5. Llar\n"+
    "6. Comunitats\n"+
    "7. Estalvis\n");
    int tipus = sc.nextInt();
        switch(tipus){
            case 1:
                System.out.println("Sector: \n"+
                "1. Servei funerari\n"+
                "2. Nínxol\n"+
                "3. Trasllat\n"+
                "4. Assessoria jurídica telèfonica\n"+
                "5. Servei d'orientació mèdica telèfonica\n"+
                "6. AvantSalud\n"+
                "7. Testament online"+
                "8. Borrat digital\n"+
                "9. El meu llegat\n"+
                "10. Servei gestoría\n");

        int infor = sc.nextInt();
            switch(infor){
                case 1:
                    System.out.println("Servei personalitzat d'enterrament"
                            + "\no incineració per a cadascun dels assegurats.\n");
                    break;
                case 2:
                    System.out.println("Possibilitat d'obtenir un nínxol "
                            + "\nen propietat o lloguer.\n");
                    break;
                case 3:
                    System.out.println("Cobertura de trasllat, "
                            + "\nnacional i internacional, "
                            + "\namb lliure elecció de cementiri "
                            + "\ndins del territori nacional.\n");
                    break;
                case 4:
                    System.out.println("Un equip d'abogats atendrà "
                            + "\nqualsevol consulta jurídica "
                            + "\ntant personal com familiar.\n");
                    break;
                case 5:
                    System.out.println("Un equip de metges que "
                            + "\norientarà en consultes de salut "
                            + "\nles 24 horas, també a través "
                            + "\nde videoconferència.\n");
                    break;
                case 6:
                    System.out.println("Accés a la medicina privada "
                            + "\ni a tot un conjunt de serveis de salut"
                            + "\namb descompes especials i "
                            + "\nmúltiples serveis gratuïts amb "
                            + "\nserveis mèdics, dentals, "
                            + "\nde benestar i assistencials.\n");
                    break;
                case 7:
                    System.out.println("Garantitza assessorament "
                            + "\nper a la redacció del testament "
                            + "\nhereditari, vital o solidari, "
                            + "\ncomodament des de la llar.\n");
                    break;
                case 8:
                    System.out.println("Gestió final de la vida digital.\n");
                    break;
                case 9:
                    System.out.println("Ofereix un servei per "
                            + "\na cuidar la imatge i la reputació "
                            + "\nonline un cop s'hagi produït l'òbit.\n");
                    break;
                case 10:
                    System.out.println("Ofereix la tramitació i "
                            + "\nobtenció dels diversos documents "
                            + "\nque es requeriran.\n");
                    break;
                }
                break;
            case 2:
                System.out.println("Un capital contractat en pòlissa "
                        + "\nals beneficiaris designats, després de "
                        + "\nla mort de l'assegurat,"
                        + "\nsi aquesta ocurreix abans de la data "
                        + "\nde venciment de la seva cobertura. Està "
                        + "\nespecialment indicat per a persones "
                        + "\nel cas pugui tenir conseqüències "
                        + "\neconòmiques no desitjades"
                        + "\nper a altres persones (familia)."
                        + "\nPer a persones amb cargues familiars (hipoteques)."
                        + "\nPer a persones que desitjen que "
                        + "\nels seus hereditaris disposin de "
                        + "\nliquidació suficient per a fer front"
                        + "\na l'impost sobre successions i donacions.\n");
                break;
            case 3:
                System.out.println("En cas de mort o invalidesa "
                        + "\nper accident, rapidesa en la cobertura "
                        + "\npara poder pagar els gastos inicials.\n"
                        + "\nSense controls mèdics ni extensos tràmits.\n"
                        + "\nGaranties cobertes: mort per accident, "
                        + "\ninvalidesa permanent parcial o absoluta, "
                        + "\navantsalud i hospitalització.\n");
                break;
            case 4:
                System.out.println("Sector: \n"+
                "1. Màximes garanties en base a barem\n"+
                "2. Amplia cobertura a diferents perfils\n"+
                "3. Ampliació garanties per incapacitat temporal\n"+
                "4. Sense reconeixement mèdic previ\n"+
                "5. Atenció mèdica telèfonica 24hrs\n"+
                "6. Compatibilitat amb altres assegurançes\n"+
                "7. Flexibilitat"+
                "8. Avantsalud\n");
                infor = sc.nextInt();
                switch(infor){
                    case 1:
                        System.out.println("Pòlissa mitjançant "
                                + "\n'barem d'indemnitzacions' establert "
                                + "\nsegons tipologia enfermetat."
                                + "\nPel qual s'abona la indemnització "
                                + "\nsegons el diagnostic, "
                                + "\ni pel periode de dies establerts.");
                        break;
                    case 2:
                        System.out.println("Dirigit a un ampli colectiu "
                                + "\nde persones, especialment autònoms, "
                                + "\ni també altres persones"
                                + "\nque treballent per compte aliè, "
                                + "\ncom les persones amb altres perfils "
                                + "\n(ames de casa, estudiants, parats)");
                        break;
                    case 3:
                        System.out.println("La indemnització serà efectiva "
                                + "\ndes del primer dia.");
                        break;
                    case 4:
                        System.out.println("No es necessita reconeixement "
                                + "\nprevi para la contractació "
                                + "\nde la pòlissa.");
                        break;
                    case 5:
                        System.out.println("Disponibilitat telèfonica 24hrs "
                                + "\nd'un equip de metges per oferir assesorament "
                                + "\nmèdic en casos d'urgencia, "
                                + "\nenfermetat, accident o davant "
                                + "\nqualsevol situació mèdica, "
                                + "\npsicològica o social.");
                        break;
                    case 6:
                        System.out.println("Compatibilitat amb altres assegurançes");
                        break;
                    case 7:
                        System.out.println("Tant en la possibilitat d'escollir "
                                + "\nde capital de contractació "
                                + "\ncom en la forma de pagament.");
                        break;
                    case 8:
                        System.out.println("Total atenció i accés "
                                + "\na medicina privada i a tot un "
                                + "\nconjunt de serveis de salut "
                                + "\namb descomptes especials.");
                    }
                    break;
            case 5:
                System.out.println("Cobertures: \n"+
                        "Incendis, explosió, fum i caiguda de llamps.\n"+
                        "Despeses de salvament.\n"+
                        "Robatori i desperfectes per robatori o intent.\n"+
                        "Pèrdua de lloguers i inhabilitat de la llar.\n"+
                        "Esdeveniments extraòrdinaris com pluja, pedrada o neu.\n"+
                        "Danys produïts per l'aigua (inclou localització i reparació de l'averia.\n"+
                        "Responsabilitat civil familiar extracontractual.\n"+
                        "Trencament de cristalls, màrmols i sanitari.\n");
                break;
            case 6:
                System.out.println("Cobertures: \n"+
                        "Incendi, explosió, fum i caiguda de llamps.\n"+
                        "Despeses de salvament.\n"+
                        "Robatori i expoliació.\n"+
                        "Actes de vandalisme o malintencionats.\n"+
                        "Pèrdua de lloguers i desallotjament forçós.\n"+
                        "Danys estètics.\n"+
                        "Trencament de llunes,cristalls i miralls.\n"+
                        "Pluja, vent, pedrada o neu.\n"+
                        "Vessament, fuga o escapament accidental "
                      + "\nde les instal·lacions automàtiques "
                      + "\nd'extinció d'incendis.\n"+
                        "Responsabilitat civil extracontractual, "
                      + "\nfiança, defensa i reclamació.\n");
                break;
            case 7:
                System.out.println("Avantatges: \n"+
                        "Flexibilitat d'aportament d'estalvis\n"+
                        "Liquidesa de l'assegurança universal estalvi\n"+
                        "Màxima rentabilitat\n"+
                        "Garanties 2x1 en cas de vida i mort\n");
                break;
        }
    }

/*
*******************
*   TARIFICADOR   *
*******************/
public static void tarificador(){
    for(int x = 0; x < 1; x++){
        Scanner sc = new Scanner(System.in);
        client persona [] = new client [20];
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
        persona[x].cc = sc.nextLong();
        System.out.print("Prima total: ");
        persona[x].prima = sc.nextInt();
        sc.nextLine();
    }
}

public static void familiar(){
    Scanner sc = new Scanner(System.in);
    int edats [] = new int [6];
    float comp = 0f;
    System.out.print("Nombre de persones: ");
    int persones = sc.nextInt();
    System.out.print("Capital: (2000-10000)");
    int capital = sc.nextInt();
    for(int i = 2000; i<=10000; i=i + 500){
    if(capital == i){
        for(int x = 1; x < persones+1; x++){
            System.out.print("Edat"+x+": ");
            edats[x] = sc.nextInt();
            if(edats[x] >= 0 && edats[x] <= 30)
                comp += 6.04f;
            if(edats[x] >= 31 && edats[x] <= 50)
                comp += 10.06f;
            if(edats[x] >= 51 && edats[x] <= 69)
                comp += 20.42f;
            if(edats[x] == 70)
                comp += 32.96f;
            }
        }
    }

    System.out.print("Complementari hospital: (1:Si 0:No");
    int chosp = sc.nextInt();
    if(chosp == 1)
        comp += 0.45f;

    System.out.println("Total: "+comp + "\n");
                        
}
}