import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
<<<<<<< HEAD
        System.out.println("Hello, World!");
        System.out.println("Añadiendo código de prueba");
        System.out.println("Añadiendo código desde la rama Arkaitz");
        System.out.println("Merge de las dos ramas");
        System.out.println("Hola buenas");
        System.out.println("Aqui estoy modificando el codigo en ramaJokin");
        mostrarArray();
        ramaMaster();
=======
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
>>>>>>> ramaJokin
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
    public static void ramaMaster(){
        int num=0;
        if (num==0){
            System.out.println("He descargado de la ramaJokin");
        }
        if (num==1){//Una última moodificación
            System.out.println("Y vuelvo a subir el proyecto");
        }        
    }
}
