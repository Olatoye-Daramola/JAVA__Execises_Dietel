import java.util.Scanner;

public class Xmas {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of day:");
		int day = sc.nextInt();

        String song = "";
        String dayOfChristmas = "";

        dayOfChristmas = getDay(day, dayOfChristmas);
        song = "On the " + dayOfChristmas + " day of Christmas, my true love said to me...\n";
        System.out.println(song);

        getLyrics(day);
    }

    private static String getDay(int day, String dayOfChristmas) {
        switch (day) {
            case 12 -> dayOfChristmas = "Twelfth";
            case 11 -> dayOfChristmas = "Eleventh";
            case 10 -> dayOfChristmas = "Tenth";
            case 9 -> dayOfChristmas = "Ninth";
            case 8 -> dayOfChristmas = "Eight";
            case 7 -> dayOfChristmas = "Seventh";
            case 6 -> dayOfChristmas = "Sixth";
            case 5 -> dayOfChristmas = "Fifth";
            case 4 -> dayOfChristmas = "Fourth";
            case 3 -> dayOfChristmas = "Third";
            case 2 -> dayOfChristmas = "Second";
            case 1 -> dayOfChristmas = "First";
        }
        return dayOfChristmas;
    }

    private static void getLyrics(int day) {
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
