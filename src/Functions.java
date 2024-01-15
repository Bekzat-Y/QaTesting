import java.util.ArrayList;

public class Functions {

    private  int MAX_CONTACTS = 10;
    private String[] names = new String[MAX_CONTACTS];
    private String[] phoneNumbers = new String[MAX_CONTACTS];
    private int numContacts = 0;





    public void addContact(String name, String phoneNumber) {
        if (numContacts >= MAX_CONTACTS) {
            System.out.println("Телефонная книга заполнена");
        } else {
            names[numContacts] = name;
            phoneNumbers[numContacts] = phoneNumber;
            numContacts++;
            System.out.println("Контакт добавлен.");
        }
    }

    public void viewContacts() {
        if (numContacts == 0) {
            System.out.println("Телефонная книга пуста.");
        } else {
            System.out.println("Список контактов в телефонной книге:");
            for (int i = 0; i < numContacts; i++) {
                System.out.println("Индекс: " + i + ", Имя: " + names[i] + ", Номер: " + phoneNumbers[i]);
            }
        }
    }

    public void updateContact(int index, String name, String phoneNumber) {
        if (index < 0 || index >= numContacts) {
            System.out.println("Недопустимый индекс.");
        } else {
            names[index] = name;
            phoneNumbers[index] = phoneNumber;
            System.out.println("Контакт обновлен.");
        }
    }

    public void deleteContact(int index) {
        if (index < 0 || index >= numContacts) {
            System.out.println("Недопустимый индекс.");
        } else {
            for (int i = index; i < numContacts - 1; i++) {
                names[i] = names[i + 1];
                phoneNumbers[i] = phoneNumbers[i + 1];
            }
            numContacts--;
            System.out.println("Контакт удален.");
        }
    }


}










