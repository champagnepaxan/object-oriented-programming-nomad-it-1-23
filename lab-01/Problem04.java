// 4 задача синхронизация контактов
import java.util.ArrayList;
import java.util.Collections;

public class Problem04 {
    public static void main(String[] args) {
        ArrayList<String> contactsInPhone = new ArrayList<>();
        contactsInPhone.add("Ислам");
        contactsInPhone.add("Альбина");
        contactsInPhone.add("Сабина");

        ArrayList<String> contactsInSim = new ArrayList<>();
        contactsInSim.add("Тахмина");
        contactsInSim.add("Сабина");
        contactsInSim.add("Альбина");

        ArrayList<String> allContacts = new ArrayList<>(contactsInPhone);

        for (String name : contactsInSim) {
            if (!allContacts.contains(name)) {
                allContacts.add(name);
            }
        }

        Collections.sort(allContacts);

        System.out.println("Список контактов: " + allContacts);
    }
}
