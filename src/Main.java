import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        ContactManager functions = new ContactManager();




int choose;
do {
functions.interFace();

    choose = scanner.nextInt();
    scanner.nextLine();

    switch (choose) {
        case 1: {
            System.out.println("Создание контакта \n");

            System.out.print("Введите Имя: ");
            String scanName = scanner.nextLine();

            System.out.print("Введите Фамилию: ");
            String scanSureName = scanner.nextLine();

            System.out.print("Введите Номер Телефона: ");
            String scanPhoneNumber = scanner.nextLine();

            System.out.print("Введите Email: ");
            String scanEmail = scanner.nextLine();

                    functions.addContact(scanName,scanSureName,scanPhoneNumber,scanEmail);


        }break;

        case 2: {

            functions.viewContacts();

        }break;

        case 3: {
            System.out.println("Удаление контакта");
            functions.viewContacts();
            System.out.print("Введите: ");
            int deleteIndex = scanner.nextByte();
            functions.deleteContact(deleteIndex);

        }break;

        case 4: {System.out.println("Обновление контакта \n");

            functions.viewContacts();

            System.out.print("Выберите индекс который хотите обновить ");
            int delete = scanner.nextInt();

            System.out.print("Введите Имя: ");
            String scanName = scanner.nextLine();

            System.out.print("Введите Фамилию: ");
            String scanSureName = scanner.nextLine();

            System.out.print("Введите Номер Телефона: ");
            String scanPhoneNumber = scanner.nextLine();

            System.out.print("Введите Email: ");
            String scanEmail = scanner.nextLine();

            functions.updateContact(delete,scanName,scanSureName,scanPhoneNumber,scanEmail);




        }break;
        case 5: {
            System.out.println("Поиск: ");
            System.out.print("Введите Имя : ");
            String name = scanner.next();
            functions.searchContact(name);

        }break;
        case 6:{
            break;

        }case 7: {
             ContactManager.loadContactsFromFile();
        }break;
        case 8:{
            ContactManager.saveContactToContact();
        }break;
        case 9:{
            System.out.println("Введите Номер Контакта для его поиска ");
            String scanSearchContactByNumber = scanner.nextLine();
           ContactManager.searchContactsByPhoneNumber(scanSearchContactByNumber);
        }break;
        case 10:{
            System.out.println("Введите Имя Контакта для его поиска ");
            String scanSearchContactByName = scanner.nextLine();
            ContactManager.searchContactsByName(scanSearchContactByName);
        }

    }

}while (choose!=6);

        System.out.println("hello");
    }

}