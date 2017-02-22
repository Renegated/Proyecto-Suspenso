package projecte;

import static projecte.Projecte.sc;
/**
 * Conté tota la informació de les assegurances, tal com garanties o cobertures.
 * 
 * @author Albert i Enric
 */
public class informacio{

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
        
            //Menú assegurança Familiar
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
                        //Servei funerari
                    case 1:
                        System.out.println("Servei personalitzat d'enterrament o incineració per a cadascun dels assegurats.\n");
                        break;
                        
                        //Nínxol
                    case 2:
                        System.out.println("Possibilitat d'obtenir un nínxol en propietat o lloguer.\n");
                        break;
                        
                        //Trasllat
                    case 3:
                        System.out.println("Cobertura de trasllat, nacional i internacional, amb lliure elecció de cementiri dins del territori nacional.\n");
                        break;
                        
                        //Assessoria jurídica telèfonica
                    case 4:
                        System.out.println("Un equip d'abogats atendrà qualsevol consulta jurídica tant personal com familiar.\n");
                        break;
                        
                        //Servei d'orientació mèdica telèfonica
                    case 5:
                        System.out.println("Un equip de metges que orientarà en consultes de salut les 24 horas, també a través de videoconferència.\n");
                        break;
                        
                        //Avantsalut
                    case 6:
                        System.out.println("Accés a la medicina privada i a tot un conjunt de serveis de salut"
                                + "\namb descompes especials i múltiples serveis gratuïts amb serveis mèdics, dentals, de benestar i assistencials.\n");
                        break;
                        
                        //Testament online
                    case 7:
                        System.out.println("Garantitza assessorament per a la redacció del testament hereditari, vital o solidari, comodament des de la llar.\n");
                        break;
                        
                        //Borrat digital
                    case 8:
                        System.out.println("Gestió final de la vida digital.\n");
                        break;
                        
                        //El meu llegat
                    case 9:
                        System.out.println("Ofereix un servei per a cuidar la imatge i la reputació online un cop s'hagi produït l'òbit.\n");
                        break;
                        
                        //Servei gestoria
                    case 10:
                        System.out.println("Ofereix la tramitació i obtenció dels diversos documents que es requeriran.\n");
                        break;
                    }
                    break;
                    
                    //Informació vida
                case 2:
                    System.out.println("Un capital contractat en pòlissa als beneficiaris designats, després de la mort de l'assegurat,"
                            + "\nsi aquesta ocurreix abans de la data de venciment de la seva cobertura. Està especialment indicat per a persones "
                            + "\nel cas pugui tenir conseqüències econòmiques no desitjades per a altres persones (familia)."
                            + "\nPer a persones amb cargues familiars (hipoteques)."
                            + "\nPer a persones que desitjen que els seus hereditaris disposin de liquidació suficient per a fer front a l'impost sobre successions i donacions.\n");
                    break;
                    
                    //Informació Accident
                case 3:
                    System.out.println("En cas de mort o invalidesa per accident, rapidesa en la cobertura para poder pagar els gastos inicials.\n"
                            + "\nSense controls mèdics ni extensos tràmits.\n"
                            + "\nGaranties cobertes: mort per accident, invalidesa permanent parcial o absoluta, avantsalud i hospitalització.\n");
                    break;
                    
                    //Informació Incapacitat temporal
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
                    
                    //Menú informació Incapacitat temporal
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
                        
                    //Informació Llar
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
                    
                    //Informació Comunitats
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
                    
                    //Informació estalvis
                case 7:
                    System.out.println("Avantatges: \n"+
                            "Flexibilitat d'aportament d'estalvis\n"+
                            "Liquidesa de l'assegurança universal estalvi\n"+
                            "Màxima rentabilitat\n"+
                            "Garanties 2x1 en cas de vida i mort\n");
                    break;
            }
        }
}