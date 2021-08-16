package TryOuts;

import java.util.Scanner;

public class Nokia3310 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        NokiaLogo.main();
        mainMenu();
    }

    public static void mainMenu() {
        String mainMenuPrompt = """
                Press the corresponding menu number to access the menu:
                
                1  -> Phonebook
                2  -> Messages
                3  -> Chat
                4  -> Call Register
                5  -> Tones
                6  -> Settings
                7  -> Call Divert
                8  -> Games
                9  -> Calculator
                10 -> Reminder
                11 -> Clock
                12 -> Profiles
                13 -> SIM Services
                """;
        System.out.println(mainMenuPrompt);
        int mainMenu = sc.nextInt();

        switch (mainMenu) {
            case 1 -> {
                phoneBook();
            }
            case 2 -> {
                messages();
            }
            case 3 -> System.out.println("Chat");
            case 4 -> {
                callRegister();
            }
            case 5 -> {
                displayMessage("Tones", """
                        1 -> Ringing Tone
                        2 -> Ringing Volume
                        3 -> Incoming Call Alert
                        4 -> Composer
                        5 -> Message Alert Tone
                        6 -> Keypad Tones
                        7 -> Warning and Game Tone
                        8 -> Vibrating Alert
                        9 -> Screen Saver
                        """);
            }
            case 6 -> {
                settings();
            }
            case 7 -> System.out.println("Call Divert");
            case 8 -> System.out.println("Games");
            case 9 -> System.out.println("Calculator");
            case 10 -> System.out.println("Reminder");
            case 11 -> {
                clock();
            }
            case 12 -> System.out.println("Profiles");
            case 13 -> System.out.println("SIM Services");
        }
        mainMenu();
    }


    private static void displayMessage(String title, String prompt) {
        System.out.println(title);
        System.out.println(prompt);
    }

    private static void clock() {
        displayMessage("Clock", """
                1 -> Alarm Clock
                2 -> Clock Setting
                3 -> Date Setting
                4 -> Stopwatch
                5 -> Countdown Timer
                6 -> Auto-update of Date and Time
                
                0 -> Main Menu
                """);
        int clock = sc.nextInt();
        switch (clock) {
            case 0 -> mainMenu();
            case 1 -> System.out.println("Alarm Clock");
            case 2 -> System.out.println("Clock Setting");
            case 3 -> System.out.println("Date Setting");
            case 4 -> System.out.println("Stopwatch");
            case 5 -> System.out.println("Countdown Timer");
            case 6 -> System.out.println("Auto-update of Date and Time");
        }
    }

    private static void settings() {
        displayMessage("Settings", """
                1 -> Call Settings
                2 -> Phone Settings
                3 -> Security Settings
                4 -> Restore Factory Settings
                
                0 -> mainMenu();
                """);
        int settings = sc.nextInt();
        switch (settings) {
            case 0 -> mainMenu();
            case 1 -> {
                callSettings();
            }
            case 2 -> {
                phoneSettings();
            }
            case 3 -> {
                securitySettings();
            }
            case 4 -> System.out.println("Restore Factory Settings");
        }
    }

    private static void securitySettings() {
        displayMessage("Security Settings", """
                        1 -> Pin Code Request
                        2 -> Call Barring Service
                        3 -> Fixed Dialling
                        4 -> Closed User Group
                        5 -> Phone Security
                        6 -> Change Access Codes
                        
                        11-> Previous Menu
                        0 -> Main Menu
                        """);
        int securitySettingsInput = sc.nextInt();

        switch (securitySettingsInput) {
            case 0 -> mainMenu();
            case 11 -> settings();
            case 1 -> {
                System.out.println("Pin Code Request");
            }
            case 2 -> {
                System.out.println("Call Barring Service");
            }
            case 3 -> {
                System.out.println("Fixed Dialling");
            }
            case 4 -> {
                System.out.println("Closed User Group");

            }
            case 5 -> {
                System.out.println("Phone Security");

            }
            case 6 -> {
                System.out.println("Change Access Codes");
            }
        }
    }

    private static void phoneSettings() {
        displayMessage("Phone Settings", """
                1 -> Language
                2 -> Cell Info Display
                3 -> Welcome Note
                4 -> Network Selection
                5 -> Lights
                6 -> Confirm SIM Service Options
                
                11-> Previous Menu
                0 -> Main Menu
                """);
        int phoneSettingsInput = sc.nextInt();

        switch (phoneSettingsInput) {
            case 0 -> mainMenu();
            case 11 -> settings();
            case 1 -> {
                System.out.println("Language");
            }
            case 2 -> {
                System.out.println("Cell Info Display");
            }
            case 3 -> {
                System.out.println("Welcome Note");
            }
            case 4 -> {
                System.out.println("Network Selection");

            }
            case 5 -> {
                System.out.println("Lights");

            }
            case 6 -> {
                System.out.println("Confirm SIM Service Options");
            }
        }
    }

    private static void callSettings() {
        displayMessage("Call settings", """
                1 -> Automatic Redial
                2 -> Speed Dialling
                3 -> Call Waiting Options
                4 -> Own Number Sending
                5 -> Phone Line in Use
                6 -> Automatic Answer
                
                11-> Previous Menu
                0 -> Main Menu
                """);
        int callSettingsInput = sc.nextInt();

        switch (callSettingsInput){
            case 0 -> mainMenu();
            case 11 -> settings();
            case 1 -> {
                System.out.println("Automatic Redial");
            }
            case 2 -> {
                System.out.println("Speed Dialling");
            }
            case 3 -> {
                System.out.println("Call Waiting Options");
            }
            case 4 -> {
                System.out.println("Own Number Sending");

            }
            case 5 -> {
                System.out.println("Phone Line in Use");

            }
            case 6 -> {
                System.out.println("Automatic Answer");
            }
        }
    }

    private static void callRegister() {
        displayMessage("Call Register", """
                1 -> Missed Calls
                2 -> Received Calls
                3 -> Dialled Numbers
                4 -> Erase Recent Call Lists
                5 -> Show Call Duration
                6 -> Show Call Costs
                7 -> Call Cost Settings
                8 -> Prepaid Credit
                
                0 -> Main Menu
                """);
        int callRegister = sc.nextInt();
        switch (callRegister) {
            case 0 -> mainMenu();
            case 1 -> System.out.println("Missed Calls");
            case 2 -> System.out.println("Received Calls");
            case 3 -> System.out.println("Dialled Calls");
            case 4 -> System.out.println("Erase Recent Call Lists");
            case 5 -> {
                displayMessage("Show Call Duration", """
                        1 -> Last Call Duration
                        2 -> All Calls' Duration
                        3 -> Received Calls' Duration
                        4 -> Dialled Calls' Duration
                        5 -> Clear Timers
                        
                        11-> Previous Menu
                        0 -> Main Menu
                        """);
                int callDuration = sc.nextInt();
                switch (callDuration) {
                    case 0 -> mainMenu();
                    case 11 -> callRegister();
                    case 1 -> System.out.println("Last Call Duration");
                    case 2 -> System.out.println("All Calls' Duration");
                    case 3 -> System.out.println("Received Calls' Duration");
                    case 4 -> System.out.println("Dialled Calls' Duration");
                    case 5 -> System.out.println("Clear Timers");
                }
            }
            case 6 -> {
                displayMessage("Show Call Costs", """
                        1 -> Last Call Cost
                        2 -> All Calls' Cost
                        3 -> Clear Counters
                        
                        11-> Previous Menu
                        0 -> Main Menu
                        """);
                int callCost = sc.nextInt();
                switch (callCost) {
                    case 0 -> mainMenu();
                    case 11 -> callRegister();
                    case 1 -> System.out.println("Last Call Cost");
                    case 2 -> System.out.println("All Calls Cost");
                    case 3 -> System.out.println("Clear Counters");
                }
            }
            case 7 -> {
                displayMessage("Call Cost Settings", """
                        1 -> Call Cost Limit
                        2 -> Show Costs in
                        
                        11-> Previous Menu
                        0 -> Main Menu
                        """);
                int callCostSettings = sc.nextInt();
                switch (callCostSettings) {
                    case 0 -> mainMenu();
                    case 11 -> callRegister();
                    case 1 -> System.out.println("Call Cost Limit");
                    case 2 -> System.out.println("Show Costs in");
                }
            }
            case 8 -> System.out.println("Prepaid Credit");
        }
    }

    private static void messages() {
        displayMessage("Messages", """
                1  -> Write Messages
                2  -> Inbox
                3  -> Outbox
                4  -> Picture Messages
                5  -> Templates
                6  -> Smileys
                7  -> Message Settings
                8  -> Info Services
                9  -> Voice Mailbox Number
                10 -> Service Command Editor
                
                0  -> Main menu
                """);
        int messages = sc.nextInt();
        switch (messages) {
            case 0 -> mainMenu();
            case 1 -> System.out.println("Messages");
            case 2 -> System.out.println("Inbox");
            case 3 -> System.out.println("Outbox");
            case 4 -> System.out.println("Picture Messages");
            case 5 -> System.out.println("Templates");
            case 6 -> System.out.println("Smileys");
            case 7 -> {
                messageSettings();
            }
            case 8 -> System.out.println("Info Service");
            case 9 -> System.out.println("Voice Mailbox Number");
            case 10 -> System.out.println("Service Command Editor");
        }
    }

    private static void messageSettings() {
        displayMessage("Message Settings", """
                1 -> Set
                2 -> Common
                
                11-> Previous Menu
                0 -> Main Menu
                """);
        int messageSettings = sc.nextInt();
        switch (messageSettings) {
            case 0 -> mainMenu();
            case 11-> messages();
            case 1 -> {
                setMessages();
            }
            case 2 -> {
                commonMessages();
            }
        }
    }


    private static void commonMessages() {
        displayMessage("Common", """
                1 -> Delivery Report
                2 -> Reply via same Centre
                3 -> Character Support
                
                11-> Previous Menu
                0 -> Main Menu
                """);
        int common = sc.nextInt();
        switch (common) {
            case 0 -> mainMenu();
            case 11-> messageSettings();
            case 1 -> System.out.println("Delivery Report");
            case 2 -> System.out.println("Reply via same Centre");
            case 3 -> System.out.println("Character Support");
        }
    }

    private static void setMessages() {
        displayMessage("Set", """
                1 -> Message Centre Number
                2 -> Message Sent As
                3 -> Message Validity
                
                11-> Previous Menu
                0 -> Main Menu
                """);
        int set = sc.nextInt();
        switch (set) {
            case 0 -> mainMenu();
            case 11 -> messageSettings();
            case 1 -> System.out.println("Message Centre Number");
            case 2 -> System.out.println("Message Sent As");
            case 3 -> System.out.println("Message Validity");
        }
    }

    private static void phoneBook() {
        displayMessage("Phonebook", """
                1  -> Search
                2  -> Service Numbers
                3  -> Add Name
                4  -> Erase
                5  -> Edit
                6  -> Assign Tone
                7  -> Send B'card
                8  -> Options
                9  -> Speed Dials
                10 -> Voice Tags
                
                0  -> Main Menu
                """);
        int phonebook = sc.nextInt();
        switch (phonebook) {
            case 0 -> mainMenu();
            case 1 -> System.out.println("Search");
            case 2 -> System.out.println("Service Number");
            case 3 -> System.out.println("Add Name");
            case 4 -> System.out.println("Erase");
            case 5 -> System.out.println("Edit");
            case 6 -> System.out.println("Assign Tone");
            case 7 -> System.out.println("Send B'card");
            case 8 -> {
                displayMessage("Options", """
                        1 -> Type of View
                        2 -> Memory Status
                        
                        11-> Previous Menu
                        0 -> Main Menu
                        """);
                int options = sc.nextInt();
                switch (options) {
                    case 0 -> mainMenu();
                    case 11-> phoneBook();
                    case 1 -> System.out.println("Type of View");
                    case 2 -> System.out.println("Memory Status");
                }
            }
            case 9 -> System.out.println("Speed Dials");
            case 10 -> System.out.println("Voice Tags");
        }
    }
}
