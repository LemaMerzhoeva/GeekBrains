package globalPackage.bank;

public class Main {
    public static void main(String[] args) {
        Entity entity1 = new Entity("ООО Рога и копыта", "12345");
        Person person1 = new Person("Клиент1", "32568");
        DebetAccount<Entity> debetAccount1 = new DebetAccount<>(entity1, 1500000);
        CreditAccount<Person> creditAccount1 = new CreditAccount<>(person1, 300);

        Transaction<Account> transaction = new Transaction<>(debetAccount1, creditAccount1, 35000);
        transaction.execute();
        System.out.println();
        transaction.execute();
    }
}
