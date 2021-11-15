
import java.util.Scanner;
public class Proje6 {

    public static void main(String[] args){

        double armut = 2.14 ;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlıcan = 5;
        double mMiktr, aTut, eTut, dTut, mTut, pTut;

        Scanner miktar = new Scanner(System.in);

        System.out.print("Armut miktarını giriniz: ");
        mMiktr = miktar.nextDouble();
        aTut = mMiktr * armut;
        System.out.println("Armut tutarı: " + aTut + "TL");

        System.out.print("Elma miktarını giriniz: ");
        mMiktr = miktar.nextDouble();
        eTut = mMiktr * elma;
        System.out.println("Elma tutarı: " + eTut + "TL");

        System.out.print("Domates miktarın giriniz: ");
        mMiktr = miktar.nextDouble();
        dTut = mMiktr * domates;
        System.out.println("Domates tutarı: " + dTut + "TL");

        System.out.print("Muz miktarını giriniz: ");
        mMiktr = miktar.nextDouble();
        mTut = mMiktr * muz;
        System.out.println("Muz tutarı: " + mTut + "TL");

        System.out.print("Patlıcan miktarını giriniz: ");
        mMiktr = miktar.nextDouble();
        pTut = mMiktr * patlıcan;
        System.out.println("Patlıcan tutarı: " + pTut + "TL");

        System.out.print("Toplam Tutar: " + (aTut + eTut + dTut + mTut + pTut) + "TL");






    }

}
