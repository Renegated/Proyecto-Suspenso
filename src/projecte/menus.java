package projecte;

public class menus{

    public static void menuprincipal(){
        System.out.println("Menú: \n"+
            "1. Pressupost assegurança\n"+
            "2. Alta client\n"+
            "3. Informació\n"+
            "4. Sortir\n");
    }
    
    public static void menupressupost(){
        System.out.println("Introdueix el tipus d'assegurança: \n"+
            "1. Familiar\n"+
            "2. Vida\n"+
            "3. Accident\n"+
            "4. Incapacitat temporal\n"+
            "5. Llar\n"+
            "6. Comunitats\n"+
            "7. Estalvis\n");
    }
    
    public static void menuinformacio(){
        System.out.println("Introdueix el tipus d'assegurança: \n"+
            "1. Familiar\n"+
            "2. Vida\n"+
            "3. Accident\n"+
            "4. Incapacitat temporal\n"+
            "5. Llar\n"+
            "6. Comunitats\n"+
            "7. Estalvis\n");
    }
    
    public static void menufamiliar(){
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
    }
    
    public static void menuincapacitat(){
        System.out.println("Sector: \n"+
            "1. Màximes garanties en base a barem\n"+
            "2. Amplia cobertura a diferents perfils\n"+
            "3. Ampliació garanties per incapacitat temporal\n"+
            "4. Sense reconeixement mèdic previ\n"+
            "5. Atenció mèdica telèfonica 24hrs\n"+
            "6. Compatibilitat amb altres assegurançes\n"+
            "7. Flexibilitat"+
            "8. Avantsalud\n");
    }
    
    public static void desitja(){
        System.out.println("Desitja fer alguna cosa mes? (1:Si 2:No)");
    }
    
    public static void tancar(){
        System.out.println("Gracies per confiar en nosaltres.");
    }
}