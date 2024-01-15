import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Functions functions = new Functions();


        System.out.println("\n===============================");
        System.out.println("        Contact Manager        ");
        System.out.println("===============================");
        System.out.println("1. Создать контакт ");
        System.out.println("2. Просмотреть контакты ");
        System.out.println("3. Удалить контакт ");
        System.out.println("4. Обновить контакт ");
        System.out.println("5. Поиск контакта ");
        System.out.println("6. Выйти ");
        System.out.print("Выберите действие: ");



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

functions.addContact(scanName,scanSureName,scanPhoneNumber,scanEmail);

functions.interFace();

        }break;

        case 2: {

            functions.viewContacts();

            functions.interFace();
        }break;

        case 3: {
            System.out.println("Выберите индекс который хотите удалить ");
            int delete = scanner.nextInt();

            System.out.println("Введите Имя: ");
            String scanName = scanner.nextLine();

            System.out.println("Введите Фамилию: ");
            String scanSureName = scanner.nextLine();

            System.out.println("Введите Номер Телефона: ");
            String scanPhoneNumber = scanner.nextLine();

            System.out.println("Введите Email: ");
            String scanEmail = scanner.nextLine();

            functions.updateContact(delete,scanName,scanSureName,scanPhoneNumber,scanEmail);
            functions.interFace();

        }break;

        case 4: {
            functions.viewContacts();
            System.out.print("Введите: ");
            int deleteIndex = scanner.nextByte();
functions.deleteContact(deleteIndex);

            functions.interFace();

        }break;
        case 5: {

            System.out.print("Введите Имя : ");
            String name = scanner.next();

            System.out.print("Введите Фамилию : ");
            String surname  = scanner.next();


        }break;
        case 6:{
            break;
    } default:
            System.out.println("Введите существующий номер: ");
    }
}while (choose!=6);


    }
}