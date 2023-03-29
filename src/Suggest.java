import java.util.Scanner;
public class Suggest{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int heat;
        System.out.print("Please enter heat:");
        heat=in.nextInt();

        if(heat < 5){
            System.out.println("you can go to skiing");
        } else if (heat>= 5 && heat < 15) {
            System.out.println("you can go to cinema");
        } else if (heat >= 15 && heat < 25) {
            System.out.println("you can go to picnic");
        }else{
            System.out.println("you can go to swimming");
        }

    }
}
