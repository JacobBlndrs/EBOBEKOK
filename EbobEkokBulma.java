import java.util.Scanner;

public class EbobEkokBulma {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("n1 Sayısını Giriniz : ");

        int n1 = inp.nextInt();

        System.out.print("n2 Sayısını Giriniz :");
        int n2 = inp.nextInt();

        int i = 1;
        int ebob = 1;

        if (n1>=0 && n2 >=0){
            if (n1>n2){
                while (i<=n2){
                    i++;
                    if (n1%i==0 && n2%i==0){
                        ebob=i;
                    }
                }

            }else{
                while (i<=n1){
                    i++;
                    if(n1%i==0 && n2%i==0){
                        ebob=i;
                    }
                }

            }

        }else{
            System.out.println("Geçersiz sayı girdiniz.Lütfen tekrar deneyiniz...");
        }
        int ekok=((n1*n2)/ebob);

        System.out.println("n1 ve n2 Sayısının EBOB'u : "+""+ebob);
        System.out.println("n1 ve n2 Sayısının EKOK'u : "+""+ekok);


       }

    }





