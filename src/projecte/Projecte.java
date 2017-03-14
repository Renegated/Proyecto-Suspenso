package projecte;
import java.util.Scanner;
/**
 * Menú principal i execució dels mètodes
 * 
 * @author Albert i Enric
 */
public class Projecte extends metodes {
    //Scanner global
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcio, iEnd;
        Projecte persona [] = new Projecte [20];
        for(int x = 0; x < persona.length; x++){
            persona[x] = new Projecte();
        }
        
        do{
          /****************************
          ****** Menú principal ******
          ****************************/
            menuprincipal();
            opcio = sc.nextInt();
        
        switch(opcio){
            
            /****************************
            ** Pressupost assegurança ***
            ****************************/
            
            case 1:
                menupressupost();
     
                int tipus = sc.nextInt();
                
                switch(tipus){
                    case 1:
                        //Assegurança Familiar
                        calculFamiliar();
                        desitja();
                                iEnd = sc.nextInt();
                                if(iEnd == 1)break;
                                else if(iEnd == 2){
                                    tancar();
                                    opcio = 4;
                                    break;
                                }
                    case 2:
                        //Assegurança Vida
                        calculVida();
                            desitja();
                                iEnd = sc.nextInt();
                                if(iEnd == 1)break;
                                else if(iEnd == 2){
                                    tancar();
                                    opcio = 4;
                                    break;
                                }
                        break;
                        
                    case 3:
                        //Assegurança Accident
                        calculAccident();
                            desitja();
                                iEnd = sc.nextInt();
                                if(iEnd == 1)break;
                                else if(iEnd == 2){
                                    opcio = 4;
                                    break;
                                }
                        break;
                        
                    case 4:
                        //Assegurança Incapacitat temporal
                        calculIncapacitatTemporal();
                        desitja();
                                iEnd = sc.nextInt();
                                if(iEnd == 1)break;
                                else if(iEnd == 2){
                                    tancar();
                                    opcio = 4;
                                    break;
                                }
                        break;
                    case 5:
                        //Assegurança Llar
                        calculLlar();
                        desitja();
                        iEnd = sc.nextInt();
                        if(iEnd == 1)break;
                        else if(iEnd == 2){
                            tancar();
                            opcio = 4;
                            break;
                        }
                        
                    case 6:
                        //Assegurança Comunitats
                        calculComunitats();
                        desitja();
                                iEnd = sc.nextInt();
                                if(iEnd == 1)break;
                                else if(iEnd == 2){
                                    tancar();
                                    opcio = 4;
                                    break;
                                }
                        break;
                        
                    case 7:
                        //Assegurança Estalvis
                        calculEstalvis();
                        desitja();
                                iEnd = sc.nextInt();
                                if(iEnd == 1)break;
                                else if(iEnd == 2){
                                    tancar();
                                    opcio = 4;
                                    break;
                                }
                        break;
                }
                break;
               
            //Alta client
            case 2:
                AltaClient();
                desitja();
                iEnd = sc.nextInt();
                if(iEnd == 1)break;
                else if(iEnd == 2){
                    tancar();
                    break;
                }
                
            //Informació assegurances
            case 3:
                Informacio();
                break;
                
            //Sortir programa
            case 4:
                System.out.println("Has sortit del programa");
                break;
        }
        }while(opcio <= 3 && opcio >= -1);
    }
}
