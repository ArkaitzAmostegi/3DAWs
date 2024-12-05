import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        System.out.println("Define el tamaño del Array Random:");
        int tamaño=sc.nextInt();
        System.out.println("Define el valor mínimo del Array Random:");
        int valorMin=sc.nextInt();
        System.out.println("Define el valor máximo del Array Random:");
        int valorMax=sc.nextInt();
        int[] arrayRandom=mostrarArray(tamaño, valorMin, valorMax);
        System.out.println("Contabiliza cuantas veces aparece cada número en un nuevo arrayContador:");
        mostrarArrayContador(arrayRandom, valorMax);


        sc.close();
    }
        public static int [] mostrarArray(int tamaño, int valorMin, int valorMax){
        int arrayRandom[]=new int[tamaño];
        System.out.println("Array Random:");
        for(int i=0;i<arrayRandom.length;i++){
            arrayRandom[i]=(int)(Math.random()*(valorMax-valorMin+1)+valorMin);
            System.out.print(arrayRandom[i]+" ");
        }
        System.out.println();
        return arrayRandom;
    }
    public static void mostrarArrayContador(int []arrayRandom, int valorMax){
        int arrayContador[]=new int [valorMax];
        for(int num:arrayRandom){
            arrayContador[num-1]++;
        }
        for(int i=0;i<arrayContador.length;i++){
            System.out.println("El número "+(i+1)+" aparece "+arrayContador[i]+" veces.");
        }
    }
}
