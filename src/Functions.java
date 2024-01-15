import java.util.ArrayList;

public class Functions {

    private final int MAX_CONTACTS = 100;
    private final String[] names = new String[MAX_CONTACTS];
    private final String[] sureNameMas = new String[MAX_CONTACTS];
    private final String[] phoneNumbers = new String[MAX_CONTACTS];

    private final String[] emailMas = new String[MAX_CONTACTS];

    private int numContacts = 0;





    public void addContact(String name, String sureName,String phoneNumber , String email) {
        if (numContacts >= MAX_CONTACTS) {
            System.out.println("Телефонная книга заполнена");
        } else {
            names[numContacts] = name;
            phoneNumbers[numContacts] = phoneNumber;
             sureNameMas[numContacts] = sureName;
             emailMas[numContacts] = email;

            numContacts++;
            System.out.println("Контакт добавлен.");

            System.out.println();
        }
    }

    public void viewContacts() {
        if (numContacts == 0) {
            System.out.println("Телефонная книга пуста.");
        } else {
            System.out.println("Список контактов в телефонной книге:");
            for (int i = 0; i < numContacts; i++) {
                System.out.println("Индекс: " + i + ", Имя: " + names[i] +" "+ sureNameMas[i]+ ", Номер: " + phoneNumbers[i]+" Email: "+emailMas[i]);
            }
        }
    }

    public void updateContact(int index, String name, String sureName , String phoneNumber, String email) {
        if (index < 0 || index >= numContacts) {
            System.out.println("Недопустимый индекс.");
        } else {
            names[index] = name;
            sureNameMas[index] = sureName;
            phoneNumbers[index] = phoneNumber;
            emailMas[index] = email;
            System.out.println("Контакт обновлен.");
        }
    }

    public void deleteContact(int index) {
        if (index < 0 || index >= numContacts) {
            System.out.println("Недопустимый индекс.");
        } else {
            for (int i = index; i < numContacts - 1; i++) {
                names[i] = names[i + 1];
                sureNameMas[i] = sureNameMas[i + 1];
                phoneNumbers[i] = phoneNumbers[i + 1];
                emailMas[i] = emailMas[i + 1];
            }
            numContacts--;
            System.out.println("Контакт удален.");
        }
    }

public void interFace (){
    System.out.println("1. Создать контакт ");
    System.out.println("2. Просмотреть контакты ");
    System.out.println("3. Удалить контакт ");
    System.out.println("4. Обновить контакт ");
    System.out.println("5. Поиск контакта ");
    System.out.println("6. Выйти ");
    System.out.print("Выберите действие: ");
}

public void searchContact(String name,String sureName){


    boolean isFound = false;
    for (  : ) {
        if (user.name.equals(name) && user.surname.equals(surname)) {
            isFound = true;
            System.out.println("Найден " + user.name + " " + user.surname);
        }
    }

    if(!isFound) System.out.println("Не найдено.");
}
}
}










