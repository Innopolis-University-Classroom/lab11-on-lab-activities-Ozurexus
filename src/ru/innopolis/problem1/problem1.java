import java.util.Locale;
import java.util.Scanner;
interface Operation{
    default void operate(String s){

    }
}
class Workshop implements Operation {
    private Operation workshop;
    public void setWorkshop(String message){
        System.out.println(message);
    }
    //workshop;
}
public class Main {
    public static void main(String[] args) {
        Workshop carWorkshop = new Workshop();
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        if (next.toUpperCase().equals("A")){
            carWorkshop.setWorkshop("we Should assembles it");
        }
        else if (next.toUpperCase().equals("D")){
            carWorkshop.setWorkshop("we Should disassembles it");
        }
    }
}
