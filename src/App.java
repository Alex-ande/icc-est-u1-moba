import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
      // MetodoOrdenamiento mO = new MetodoOrdenamiento();
        //int [] arr = {5,8,9,3,0};
        //mO.sortBubbleAva(arr);
        //mO.printArreglo(arr);

        Scanner scanner= new Scanner(System.in);
        System.out.println("ingese el tamaño del arreglo");
        int tamaño = scanner.nextInt();

        if (tamaño <=0) {
            System.out.println("ingreso invalido");
            return;
            
        }
        int [] arreglo = new int [tamaño];

       
        do{
            System.out.println("ingese que sea entero positivo");
            while (!scanner.hasNextInt()) {
                System.out.println("te pedi un entero valido");
                scanner.next();
                
            }
            tamaño=scanner.nextInt();
            if (tamaño<=0) {
                System.out.println("el tamaño debe ser entero positivo");
                
            }
        } while (tamaño<=0);

        //int [] arreglo = new int [tamaño];


        scanner.close();
    }
}
