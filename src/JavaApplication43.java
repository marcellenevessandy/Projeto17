import java.util.Scanner;

public class JavaApplication43 {

    public static void main(String[] args) {

        int n, i;

        i = 1;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um valor para a tabuada: ");
        n = ler.nextInt();
        
        while (i <= 10) {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        }
        
    }
}

