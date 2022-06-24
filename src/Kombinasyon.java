import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int nhesap=1, rhesap=1, nrhesap=1, n, r, nrfark;

        System.out.println("n değeri : ");
        n = girdi.nextInt();
        System.out.print("r değeri : ");
        r = girdi.nextInt();

        nrfark = n-r;

        for (int i = 1; i <= r; i++){
            rhesap = rhesap * i;
        }

        for(int i = 1; i <= n; i++){
            nhesap = nhesap * i;
        }

        for (int i = 1; i <= nrfark; i++){
            nrhesap = nrhesap * i;
        }

        double sonuc = nhesap / (rhesap * nrhesap);
        System.out.println(sonuc);



    }
}
