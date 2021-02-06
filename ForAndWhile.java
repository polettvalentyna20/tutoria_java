
/**
 * Write a description of class Mainn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ForAndWhile{
    public static void main(String[] args){
        
        for(int numero = 0; numero <= 10; numero++){
            //System.out.println("numerito: " + numero);
        }
        
        boolean condicion = true;
        int numeroWhile = 0;
        while(condicion){
            numeroWhile = numeroWhile + 1;
            System.out.println("numerito: " + numeroWhile);
            if(numeroWhile >= 5){
                condicion = false;
                System.out.println("Se termino la condicion :(");
            }
        }
    }
}
