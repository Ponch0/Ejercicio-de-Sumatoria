package ejerciciodesumatoria;
import java.util.*;
public class Ejerciciodesumatoria {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int sumatoria=0,i,suma = 0, w=0;
        do{
        suma=0;
        System.out.print("Digita el valor que deseas saber su sumatoria: ");
        sumatoria=entrada.nextInt();
        for(i=1;i<=sumatoria;i++){
            suma+=i;
            System.out.println(i+" + "+suma);
        }//Llave de ciclo For
        System.out.println("La sumatoria de "+sumatoria+" es: "+suma);
        System.out.print("¿Desea volver? 1.-Si 2.-No: ");
        w=entrada.nextInt();
            System.out.println();
        }while(w==1);
        System.out.println("Ok");
    }
}
