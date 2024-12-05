import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
       System.out.println("Contabiliza cuantas veces sale cada número en el arrayRandom en un nuevo arrayContador:");
        mostrarArray();


        sc.close();
    }
    public static void mostrarArray(){
        int arrayRandom[]=new int[10];
        System.out.println("Array Random:");
        for(int i=0;i<arrayRandom.length;i++){
            arrayRandom[i]=(int)(Math.random()*(20+1-1)+1);
            System.out.print(arrayRandom[i]+" ");
        }
    }
    public static void arrayContador(int [] arrayRandom){
        int arrayContador[]=new int [20];
        for(int num:arrayRandom){
            arrayContador[num-1]++;
        }
        for(int i=0;i<arrayContador.length;i++){
            System.out.println("El número "+(i+1)+"aparece "+arrayContador[i]+" veces.");
        }
    }
}
