import java.util.ArrayList;

public class Functions {

    ArrayList<Contact> contacts;



    public Functions() {
        // Инициализация списка контактов при создании объекта Functions
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        // Теперь список контактов точно не является null
        this.contacts.add(contact);
    }
public void readContact(){
    System.out.println(contacts);

}


}