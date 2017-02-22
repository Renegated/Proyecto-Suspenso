package projecte;

import static projecte.Projecte.sc;

public class metodes{
    
            /****************************
            ******** Informació *********
            ****************************/
    
    public static void Informacio(){
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
                        System.out.println("Servei personalitzat d'enterrament o incineració per a cadascun dels assegurats.\n");
                        break;
                    case 2:
                        System.out.println("Possibilitat d'obtenir un nínxol en propietat o lloguer.\n");
                        break;
                    case 3:
                        System.out.println("Cobertura de trasllat, nacional i internacional, amb lliure elecció de cementiri dins del territori nacional.\n");
                        break;
                    case 4:
                        System.out.println("Un equip d'abogats atendrà qualsevol consulta jurídica tant personal com familiar.\n");
                        break;
                    case 5:
                        System.out.println("Un equip de metges que orientarà en consultes de salut les 24 horas, també a través de videoconferència.\n");
                        break;
                    case 6:
                        System.out.println("Accés a la medicina privada i a tot un conjunt de serveis de salut"
                                + "\namb descompes especials i múltiples serveis gratuïts amb serveis mèdics, dentals, de benestar i assistencials.\n");
                        break;
                    case 7:
                        System.out.println("Garantitza assessorament per a la redacció del testament hereditari, vital o solidari, comodament des de la llar.\n");
                        break;
                    case 8:
                        System.out.println("Gestió final de la vida digital.\n");
                        break;
                    case 9:
                        System.out.println("Ofereix un servei per a cuidar la imatge i la reputació online un cop s'hagi produït l'òbit.\n");
                        break;
                    case 10:
                        System.out.println("Ofereix la tramitació i obtenció dels diversos documents que es requeriran.\n");
                        break;
                    }
                    break;
                case 2:
                    System.out.println("Un capital contractat en pòlissa als beneficiaris designats, després de la mort de l'assegurat,"
                            + "\nsi aquesta ocurreix abans de la data de venciment de la seva cobertura. Està especialment indicat per a persones "
                            + "\nel cas pugui tenir conseqüències econòmiques no desitjades per a altres persones (familia)."
                            + "\nPer a persones amb cargues familiars (hipoteques)."
                            + "\nPer a persones que desitjen que els seus hereditaris disposin de liquidació suficient per a fer front a l'impost sobre successions i donacions.\n");
                    break;
                case 3:
                    System.out.println("En cas de mort o invalidesa per accident, rapidesa en la cobertura para poder pagar els gastos inicials.\n"
                            + "\nSense controls mèdics ni extensos tràmits.\n"
                            + "\nGaranties cobertes: mort per accident, invalidesa permanent parcial o absoluta, avantsalud i hospitalització.\n");
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
                            System.out.println("Pòlissa mitjançant 'barem d'indemnitzacions' establert segons tipologia enfermetat."
                                    + "\nPel qual s'abona la indemnització segons el diagnostic, i pel periode de dies establerts.");
                            break;
                        case 2:
                            System.out.println("Dirigit a un ampli colectiu de persones, especialment autònoms, i també altres persones que treballent per compte aliè, "
                                    + "\ncom les persones amb altres perfils (ames de casa, estudiants, parats)");
                            break;
                        case 3:
                            System.out.println("La indemnització serà efectiva des del primer dia.");
                            break;
                        case 4:
                            System.out.println("No es necessita reconeixement previ para la contractació de la pòlissa.");
                            break;
                        case 5:
                            System.out.println("Disponibilitat telèfonica 24hrs d'un equip de metges per oferir assesorament mèdic en casos d'urgencia, "
                                    + "\nenfermetat, accident o davant qualsevol situació mèdica, psicològica o social.");
                            break;
                        case 6:
                            System.out.println("Compatibilitat amb altres assegurançes");
                            break;
                        case 7:
                            System.out.println("Tant en la possibilitat d'escollir de capital de contractació com en la forma de pagament.");
                            break;
                        case 8:
                            System.out.println("Total atenció i accés a medicina privada i a tot un conjunt de serveis de salut amb descomptes especials.");
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
                            "Vessament, fuga o escapament accidental de les instal·lacions automàtiques d'extinció d'incendis.\n"+
                            "Responsabilitat civil extracontractual, fiança, defensa i reclamació.\n");
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
    
    
    /****************************************
    ****** Classe composta alta client ******
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

            /******************
            *   ALTA CLIENT   *
            *******************/
    
    public static void AltaClient(){
            Projecte.client persona [] = new Projecte.client [20];
            for(int x = 0; x < persona.length; x++){
                persona[x] = new Projecte.client();
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
            persona[x].cc = sc.nextLong();
            System.out.print("Prima total: ");
            persona[x].prima = sc.nextInt();
            sc.nextLine();
        }
    }

            /******************
            *   ASSEGURANCES  *
            *******************/
    
    public static void calculFamiliar(){
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
        float comp = 0.0f;
        int edat, jubi, difedat;
        String pagament;
        System.out.println("Capital a estalviar: ");
            comp = sc.nextInt();
        System.out.println("Edat: ");
            edat = sc.nextInt();
        System.out.println("Edat de jubilacio: ");
            jubi = sc.nextInt();
            difedat = jubi-edat;
        System.out.println("Forma de pagament: ");
            pagament = sc.next();
            if("24".equals(pagament))
                comp = comp*3;
    }
}