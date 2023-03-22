import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a altura da sua pirâmide");

        try {
            int number = input.nextInt();

            for(int i=1; i <= number; i++){
                for(int j=1; j <= i; j++){
                    System.out.print(i);
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Esse não é um valor válido, informe um número inteiro!");
        }
    }
}
