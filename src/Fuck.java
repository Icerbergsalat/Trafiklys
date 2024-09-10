import java.util.Scanner;
public class Fuck {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);

        System.out.println("år: ");
        int år = myobj.nextInt();

        if (år % 4 == 0 || (år % 100 == 0 && år % 400 == 0)){
            System.out.println("det er et skudår");
        }else {
            System.out.println("det er ikke et skudår");
        }
        }
    }
