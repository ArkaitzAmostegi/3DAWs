public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Añadiendo código de prueba");
        System.out.println("Añadiendo código desde la rama Arkaitz");
        System.out.println("Merge de las dos ramas");
        System.out.println("Hola buenas");
        System.out.println("Aqui estoy modificando el codigo en ramaJokin");
        mostrarArray();
    }
    public static void mostrarArray(){
        int arrayRandom[]=new int[10];
        System.out.println("Array Random:");
        for(int i=0;i<arrayRandom.length;i++){
            arrayRandom[i]=(int)(Math.random()*(100+1-1)+1);
            System.out.print(arrayRandom[i]+" ");
        }
    }
}
