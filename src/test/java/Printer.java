import java.util.Scanner;

class PrinterPower {

    private static int amountOfPapers;
    private static int inksInsert;

    public static void main(String[] args) {
        printerSetUp();
        printing();
    }

    private static void printing() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many papers you want to print?");
        int papers = scanner.nextInt();
        for (int i = 1; i <= papers; i++) {
            System.out.println("Printing..." + i + " paper.");
            if (amountOfPapers == 0) {
                System.out.println("No papers");
                insertPaper();
                if (amountOfPapers == 0) {
                    insertPaper();
                }
                if (inksInsert == 0) {
                    printerInk();
                }
            }
            amountOfPapers--;
            inksInsert--;
        }

    }

    private static void printerSetUp() {
        printerPower();
        insertPaper();
        printerInk();
    }


    private static void insertPaper() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 3; i > 0; i--) {
            System.out.println("PAPER!!!!!!!!");
            amountOfPapers = scanner.nextInt();
            if (amountOfPapers > 0 && amountOfPapers <= 100) {
                System.out.println("Printer with papers");
                break;
            } else {
                System.out.println("You put a lot of papers or empty slot");
            }
        }
    }

    private static void printerPower() {
        if (printerOn()) {
            System.out.println("Printer on...");
        } else {
            System.out.println("..............");
        }
    }

    private static boolean printerOn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("On or off");
        String printerOn = scanner.nextLine();
        return printerOn.contains("on");
    }

    private static void printerInk() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert ink, put INK");
        inksInsert = scanner.nextInt();
        System.out.println("ink inserted");
    }
}
