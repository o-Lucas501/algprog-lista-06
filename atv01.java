import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       
       int [] num = new int[5];

        for(int i = 0; i < 5; i++){

            System.out.println("Digite o" + ( i + 1) + " numero");
            num[i] = sc.nextInt();
        }

        System.out.println("Os numeros informados: ");
         for(int i = 0; i < 5; i++){
            System.out.println(num[i]);
         }
        
       sc.close();
       
       
    }
}
