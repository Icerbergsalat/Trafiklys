import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);

        System.out.println("Tid på Dagen: 'Dag' 'Aften' 'nat' \nTid:" );
        String tid = myobj.nextLine();

        System.out.println("Trafikmængde: 'Høj' 'Lav'\nTrafik:" );
        String trafik = myobj.nextLine();

        System.out.println("Områdets type: 'Bolig' 'Erhverv' 'blandet'\nType:" );
        String type = myobj.nextLine();

        System.out.println("Nødsituation: 'ja' 'nej'\nNød:" );
        String nød = myobj.nextLine();

        if ((tid.equals("Dag") && trafik.equals("lav")) || nød.equals("ja")){
            System.out.println("Lyset er Grønt");
        } else if (tid.equals("aften")|| (tid.equals("nat") && trafik.equals("lav"))) {
            System.out.println("lyset er Gult");
        } else if ((tid.equals("nat") && trafik.equals("høj")) || (trafik.equals("høj") && type.equals("Bolig"))) {
            System.out.println("lyset er Rødt");
        }
        if (type.equals("Erhverv") || (type.equals("blandet") && trafik.equals("lav"))){
            System.out.println("adgang tilladt");
        } else if ((type.equals("bolig") && tid.equals("nat"))) {
            System.out.println("adgang forbudt");
        }
    }
}
