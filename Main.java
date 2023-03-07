import java.util.Scanner;
public class Main {
    static void asalSayı() {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı:");
        int sayi = input.nextInt();
        if (sayi % 2 == 0 || sayi % 3 == 0 || sayi % 5 == 0) {
            if(sayi==2 ||sayi==3||sayi==5){
                System.out.println("Asal Sayıdır");
            }
            else{
                System.out.println("Asal Sayı Değildir");
            }

        }
        else{
            System.out.println("Asal Sayıdır");
        }

    }





    public static void main(String[] args) {
        asalSayı();




    }


}


            






