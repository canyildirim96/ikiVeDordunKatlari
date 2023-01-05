import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a;
        int total = 0;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Lütfen Değer Giriniz: ");
            a = inp.nextInt();
            if (a % 2 == 0 && a % 4 == 0){
                total +=a;
            }
        }while (a>=0 && a%2==0);
        System.out.println("Toplam: " + total);

    }
}