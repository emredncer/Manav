import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
        int elma, armut, domates, muz, patlican;
        double pElma=3.67, pArmut=2.14 , pDomates=1.11 , pMuz=0.95 , pPatlican=5.0 ;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç kg elma: ");
        elma = input.nextInt();
        System.out.print("Kaç kg armut: ");
        armut = input.nextInt();
        System.out.print("Kaç kg domates: ");
        domates = input.nextInt();
        System.out.print("Kaç kg muz: ");
        muz = input.nextInt();
        System.out.print("Kaç kg patlican: ");
        patlican = input.nextInt();
        double total = (elma*pElma)+(armut*pArmut)+(domates*pDomates)+(muz*pMuz)+(patlican*pPatlican);
        System.out.print("Ödenecek tutar: "+total);
    }
}
