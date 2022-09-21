import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        String[] weekdays={"hétfő","kedd","szerda","csütörtök","péntek","szombat","vasárnap"};
        System.out.println("Írjon be egy számot 1 és 7 között!");
        Scanner scanner=new Scanner(System.in);
        int szam= scanner.nextInt();
        scanner.close();
        switch (szam){
            case 1:
                System.out.println(weekdays[0]);
                break;
            case 2:
                System.out.println(weekdays[1]);
                break;
            case 3:
                System.out.println(weekdays[2]);
                break;
            case 4:
                System.out.println(weekdays[3]);
                break;
            case 5:
                System.out.println(weekdays[4]);
                break;
            case 6:
                System.out.println(weekdays[5]);
                break;
            case 7:
                System.out.println(weekdays[6]);
                break;
            default:
                System.out.println("Ez nem 1 és 7 között van!");
        }
    }
}
