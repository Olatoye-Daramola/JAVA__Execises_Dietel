import java.util.Scanner;

public class Xmas {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of day:");
		int day = sc.nextInt();
		
        String song = "";
        String dayOfChristmas = "";

        switch(day){
            case 12:
                dayOfChristmas = "Twelfth";
                break;
            case 11:
                dayOfChristmas = "Eleventh";
                break;
            case 10:
                dayOfChristmas = "Tenth";
                break;
            case 9:
                dayOfChristmas = "Ninth";
                break;
            case 8:
                dayOfChristmas = "Eight";
                break;
            case 7:
                dayOfChristmas = "Seventh";
                break;
            case 6:
                dayOfChristmas = "Sixth";
                break;
            case 5:
                dayOfChristmas = "Fifth";
                break;
            case 4:
                dayOfChristmas = "Fourth";
                break;
            case 3:
                dayOfChristmas = "Third";
                break;
            case 2:
                dayOfChristmas = "Second";
                break;
            case 1:
                dayOfChristmas = "First";
        }

		        song = "On the " + dayOfChristmas + " day of Christmas, my true love said to me...\n";
        System.out.println(song);

        switch(day){
            case 12:
                 System.out.println("Twelve drummers drumming");
            case 11:
                 System.out.println("Eleven pipers piping");
            case 10:
                 System.out.println("Ten lords a-leaping");
            case 9:
                 System.out.println("Nine ladies dancing");
            case 8:
                 System.out.println("Eight maids a-milking");
            case 7:
                 System.out.println("Seven swans a-swimming");
            case 6:
                 System.out.println("Six geese a-laying");
            case 5:
                 System.out.println("Five golden rings");
            case 4:
                 System.out.println("Four calling birds");
            case 3:
                 System.out.println("Three french hens");
            case 2:
                 System.out.println("Two turtle doves, and");
            case 1:
                 System.out.println("A partridge in a pear tree");
        }

    }
}
