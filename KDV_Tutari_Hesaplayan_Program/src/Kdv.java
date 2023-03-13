import java.util.Scanner;
public class Kdv {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double a;
        System.out.println("Please enter price; ");
        a = inp.nextInt();
        System.out.println((a<=1000)?"KDV'li tutar:"+(a+(a*0.18))+'\n'+"KDV tutarı: "+(a*0.18):
                "KDV'li tutar:"+(a+(a*0.08))+'\n'+"KDV tutarı: "+(a*0.08));

    }
}