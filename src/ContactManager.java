import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    private static final List<Contact> contacts = new ArrayList<>();

    PrintWriter printWriter;
    public ContactManager() throws FileNotFoundException {
        File file = new File("LContactByFile");
        printWriter = new PrintWriter(file);
    }

    public void addContact(String name, String sureName, String phoneNumber, String email) {
        int MAX_CONTACTS = 100;
        if (name.isEmpty()|| sureName.isEmpty()||phoneNumber.isEmpty()||email.isEmpty()){
            System.out.println("Введено пусто поле ");
        }else {
            Contact contact = new Contact();
            contact.setName(name);
            contact.setPhoneNumber(phoneNumber);
            contact.setSureName(sureName);
            contact.setEmail(email);

            contacts.add(contact);

            System.out.println("\nКонтакт добавлен");
        }
        if (contacts.size() >= MAX_CONTACTS) {
            System.out.println("Телефонная книга заполнена");
        }
    }

    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("\nТелефонная книга пуста");
        } else {
            System.out.println("\nСписок контактов в телефонной книге:");
            for (int i = 0; i < contacts.size(); i++) {
                Contact contact = contacts.get(i);
                System.out.println("Индекс: " + i + ", Имя: " + contact.getName() + " " +
                        contact.getSureName() + ", Номер: " + contact.getPhoneNumber() + " Email: " + contact.getEmail());
            }
        }
    }

    public void updateContact(int index, String name, String sureName, String phoneNumber, String email) {
        if (index < 0 || index >= contacts.size()) {
            System.out.println("\nНедопустимый индекс");
        } else {
            Contact contact = contacts.get(index);
            contact.setName(name);
            contact.setSureName(sureName);
            contact.setPhoneNumber(phoneNumber);
            contact.setEmail(email);
            System.out.println("\nКонтакт обновлен");
        }
    }

    public void deleteContact(int index) {
        if (index < 0 || index >= contacts.size()) {
            System.out.println("\nНедопустимый индекс");
        } else {
            contacts.remove(index);
            System.out.println("\nКонтакт удален");
        }
    }

    public void searchContact(String searchContact) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (searchContact.equals(contact.getName())) {
                System.out.print(" Контакт найден: " + "\n Имя: " + contact.getName() + " " + contact.getSureName());
                System.out.print(" Номер телефона: " + contact.getPhoneNumber());
                System.out.print(" Email: " + contact.getEmail());
                return;
            }
        }
        System.out.println("Контакт не найден");
    }
    public void interFace() {
        System.out.println("\n===============================");
        System.out.println("        Contact Manager        ");
        System.out.println("===============================");
        System.out.println("1. Создать контакт ");
        System.out.println("2. Просмотреть контакты ");
        System.out.println("3. Удалить контакт ");
        System.out.println("4. Обновить контакт ");
        System.out.println("5. Поиск контакта ");
        System.out.println("6. Выйти из программы  ");
        System.out.println("7. Загрузить контакты из файла ");
        System.out.println("8. Сохранить контакты в файл  ");
        System.out.println("9. Поиск по номеру ");
        System.out.println("10.Поиск по имени ");


        System.out.print("Выберите действие:  ");
    }

    public static void loadContactsFromFile() {
        try (
                FileReader fileReader = new FileReader("loadContactFromFile.txt");
                BufferedReader reader = new BufferedReader(fileReader)
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    Contact contact = new Contact();
                    contact.setName(parts[0].trim());
                    contact.setSureName(parts[1].trim());
                    contact.setPhoneNumber(parts[2].trim());
                    contact.setEmail(parts[3].trim());
                    contacts.add(contact);
                }
            }
            System.out.println("Контакты успешно загружены из файла ");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка при загрузке контактов из файла");
        }
    }


    public static void saveContactToContact() {
        try (
                FileWriter fileWriter = new FileWriter("saveContactByFile.txt");
                BufferedWriter writer = new BufferedWriter(fileWriter)
        ) {
            for (Contact contact : contacts) {
                writer.write(contact.getName() + "," + contact.getSureName() + "," + contact.getPhoneNumber() + "," + contact.getEmail());
                writer.newLine();
            }
            System.out.println("Контакты Сохранены в файл ");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка при Сохранении контактов в файл ");
        }
    }




    public static void searchContactsByPhoneNumber(String searchByPhoneNumber) {
        try {
            File file = new File("saveContactByFile.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                if (line.contains(searchByPhoneNumber)) {
                    System.out.println("Контакт найдек: "+line);
                }
                else System.out.println("Контакт не неайден ");
                line = reader.readLine();
            }
        } catch (NullPointerException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void searchContactsByName(String searchByName) {
        try {
            File file = new File("saveContactByFile.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4 && parts[0].trim().equals(searchByName)) {
                    System.out.println("Контакт найден: " + line);
                }
                else System.out.println("Контакт не найден ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





