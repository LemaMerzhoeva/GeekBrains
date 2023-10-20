import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.toMap;

public class PhoneBook {
    private Map<People, LinkedList<Telephone>> phoneBookMap;

    public PhoneBook() {
        this.phoneBookMap = new HashMap<>();
    }

    public void addNote(People people, Telephone telephone) {
        for (Map.Entry<People, LinkedList<Telephone>> item : phoneBookMap.entrySet()) {
            if (item.getKey().getName().equals(people.getName()) && item.getKey().getSurName().equals(people.getSurName())) {
                for (Telephone curTelephone: item.getValue()){
                    if (curTelephone.getNumber().equals(telephone.getNumber())){
                        System.out.printf("У данного контакта [%s] уже существует этот номер:\n\t[%s]\n", people, telephone);
                        return;
                    }
                }
                LinkedList<Telephone> newTelephones = item.getValue();
                newTelephones.add(telephone);
                phoneBookMap.put(people, newTelephones);
                System.out.printf("Список номеров телефонов у контакта [%s] обновлен и теперь вглядит так:\n\t%s\n", people, newTelephones);
                return;
            }
        }
        LinkedList<Telephone> newTelephones = new LinkedList<>();
        newTelephones.add(telephone);
        phoneBookMap.put(people, newTelephones);
        System.out.printf("Контакт [%s] добавлен в телефонную книгу и теперь вглядит так:\n\t%s\n", people, newTelephones);
    }

    public void sort(){
        TreeMap<Integer, List<People>> sortedMap = new TreeMap<>(Comparator.reverseOrder());

        for (Map.Entry<People, LinkedList<Telephone>> entry : phoneBookMap.entrySet()) {
            Integer length = entry.getValue().size();
            List<People> newList;
            if (sortedMap.containsKey(length)){
                newList = sortedMap.get(length);
            }
            else{
                newList = new ArrayList<>();
            }
            newList.add(entry.getKey());
            sortedMap.put(length, newList);
        }

        Map<People, LinkedList<Telephone>> sortedPhoneBookMap = new LinkedHashMap<>();

        for (Map.Entry<Integer, List<People>> entry : sortedMap.entrySet()) {
            for (People people: entry.getValue()){
                sortedPhoneBookMap.put(people, phoneBookMap.get(people));
            }
        }

        this.phoneBookMap = sortedPhoneBookMap;
    }

    public void display() {
        this.sort();
        System.out.println("Телефонная книга:");
        for (Map.Entry<People, LinkedList<Telephone>> items: phoneBookMap.entrySet()) {
            System.out.printf("Контакт: [%s]\n", items.getKey());
            System.out.printf("\tСписок номеров: %s\n", items.getValue());
        }
    }
}
