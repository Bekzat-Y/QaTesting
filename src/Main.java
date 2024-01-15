import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
Functions functions = new Functions();


        System.out.println("\n===============================");
        System.out.println("        Contact Manager        ");
        System.out.println("===============================");
        System.out.println("1. Add Contact");
        System.out.println("2. View Contacts");
        System.out.println("3. Delete Contact");
        System.out.println("4. Update Contact");
        System.out.println("5. Search Contact");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");



int choose;
do {

    choose = scanner.nextInt();
    scanner.nextLine();

    switch (choose) {
        case 1: {

            System.out.println("Введите Имя: ");
            String scanName = scanner.nextLine();

            System.out.println("Введите Фамилию: ");
            String scanSureName = scanner.nextLine();

            System.out.println("Введите Номер Телефона: ");
            String scanPhoneNumber = scanner.nextLine();

            System.out.println("Введите Email: ");
            String scanEmail = scanner.nextLine();

            functions.addContact(new Contact(scanName, scanSureName, scanPhoneNumber, scanEmail));
        }

        case 2: {

            functions.readContact();

        }

        case 3: {

        }

        case 4: {

        }
        case 5: {

        }
        case 6:{
            System.out.println("Exiting");
            break;
    } default:
            System.out.println("Введите существующий номер: ");
    }
}while (choose!=6);


}
}