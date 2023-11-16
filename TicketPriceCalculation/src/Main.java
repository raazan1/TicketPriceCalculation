import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Mesafeyi Km Cinsinden Giriniz: ");
        Double M = input.nextDouble();

        System.out.printf("Yaşınızı Giriniz: ");
        int Yas = input.nextInt();

        System.out.printf("Yolculuk Tipini Giriniz: 1 =>Tek Yön , 2 => Gidiş Dönüş ");
        int Y = input.nextInt();

        if((Y == 1 || Y == 2) && (M>0 && 0<=Yas)){
            Calc(M,Yas,Y);
        }
        else{
            System.out.printf("Hatalı Veri Girdiniz !!!");
        }
    }
    public static void Calc(Double M,int Yas,int Y){
        Double NormalTutar = M*0.10;
        if(Yas<12){
            if (Y == 1) {
                System.out.printf("Tutar: " +((NormalTutar)-(NormalTutar*0.5)));
            }
            else {
                System.out.printf("Tutar: " + (NormalTutar-(NormalTutar*0.2)*0.2));

            }
        }
        else if(Yas>12 && Yas<24){
            if(Y==1){
                System.out.printf("Tutar: " + ((NormalTutar)-(NormalTutar*0.10)));
            }
            else{
                System.out.printf("Tutar: " + ((NormalTutar)-((NormalTutar*0.10)*0.2)));

            }
        }
        else if (Yas>65) {
            if(Y==1){
                System.out.printf("Tutar: " + (NormalTutar-(NormalTutar*0.30)));

            }
            else {
                System.out.printf("Tutar: " + ((NormalTutar)-((NormalTutar*0.30)*0.2)));

            }
        }
        else{
            if(Y==1){
                System.out.printf("Tutar: " + NormalTutar);
            }
            else{
                System.out.printf("Tutar: " + NormalTutar*0.2);
            }
        }
    }
}