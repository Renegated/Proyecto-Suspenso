package projecte;
import java.util.Scanner;

public class Projecte extends metodes {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcio, iEnd;
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
                "2. Alta client\n"+
                "3. Informació\n"+
                "4. Sortir\n");
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
                        calculFamiliar();
                        System.out.println("Desitja fer alguna cosa mes? (1:Si 2:No)");
                                iEnd = sc.nextInt();
                                if(iEnd == 1)break;
                                else if(iEnd == 2){
                                    System.out.println("Gracies per confiar en nosaltres.");
                                    opcio = 4; 
                                    break;
                                }
                    case 2:
                        calculVida();
                        System.out.println("Desitja fer alguna cosa mes? (1:Si 2:No)");
                                iEnd = sc.nextInt();
                                if(iEnd == 1)break;
                                else if(iEnd == 2){
                                    System.out.println("Gracies per confiar en nosaltres.");
                                    opcio = 4; 
                                    break;
                                }
                        break;
                        
                    case 3:
                        calculAccident();
                        System.out.println("Desitja fer alguna cosa mes? (1:Si 2:No)");
                                iEnd = sc.nextInt();
                                if(iEnd == 1)break;
                                else if(iEnd == 2){
                                    System.out.println("Gracies per confiar en nosaltres.");
                                    opcio = 4; 
                                    break;
                                }
                        break;
                        
                    case 4:
                        calculIncapacitatTemporal();
                        System.out.println("Desitja fer alguna cosa mes? (1:Si 2:No)");
                                iEnd = sc.nextInt();
                                if(iEnd == 1)break;
                                else if(iEnd == 2){
                                    System.out.println("Gracies per confiar en nosaltres.");
                                    opcio = 4; 
                                    break;
                                }
                        break;
                    case 5:
                        calculLlar();
                System.out.println("Desitja fer alguna cosa mes? (1:Si 2:No)");
                        iEnd = sc.nextInt();
                        if(iEnd == 1)break;
                        else if(iEnd == 2){
                            System.out.println("Gracies per confiar en nosaltres.");
                            opcio = 4; 
                            break;
                        }
                        
                    case 6:
                        calculComunitats();
                        System.out.println("Desitja fer alguna cosa mes? (1:Si 2:No)");
                                iEnd = sc.nextInt();
                                if(iEnd == 1)break;
                                else if(iEnd == 2){
                                    System.out.println("Gracies per confiar en nosaltres.");
                                    opcio = 4; 
                                    break;
                                }
                        break;
                        
                    case 7:
                        calculEstalvis();
                        System.out.println("Desitja fer alguna cosa mes? (1:Si 2:No)");
                                iEnd = sc.nextInt();
                                if(iEnd == 1)break;
                                else if(iEnd == 2){
                                    System.out.println("Gracies per confiar en nosaltres.");
                                    opcio = 4; 
                                    break;
                                }
                        break;
                }
                break;
               
            /****************************
            ******** Alta client ********
            ****************************/
                
            case 2:
                AltaClient();
                System.out.println("Desitja fer alguna cosa mes? (1:Si 2:No)");
                iEnd = sc.nextInt();
                if(iEnd == 1)break;
                else if(iEnd == 2){
                    System.out.println("Gracies per confiar en nosaltres.");
                    opcio = 4; 
                    break;
                }
                
            /**************************************
            ******** Informació assegurances ******
            ***************************************/
            case 3:
                Informacio();
                break;
                
            /*****************************
            ******* Sortir programa ******
            ******************************/
                
            case 4:
                System.out.println("Has sortit del programa");
                break;
        }
        }while(opcio <= 3 && opcio >= -1);
    }
}