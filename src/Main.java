import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main (String[] args) {

        Queue<Person> list = new ArrayDeque<>(generateClients());

        while (!list.isEmpty()) {
            Person nextClient = list.poll();
            System.out.println(nextClient.getName());
            nextClient.setTicketsAmount(nextClient.getNumberTickets() - 1);

            if (nextClient.getNumberTickets()!= 0) {
                list.offer(nextClient);
            }
        }
        System.out.println("Клиентов в очереди больше нет");

    }
    public static List<Person> generateClients() {
        List<Person> queue = new LinkedList<>();
        queue.add(new Person ("Dmitrii", "Prosolov", 3));
        queue.add(new Person ("Julia", "Karpovo", 2));
        queue.add( new Person ("Andry", "Nikiforov", 1));
        queue.add(new Person ("Vitalii", "Maslukov", 4));
        queue.add(new Person ("Ekaterina", "Zvyaginzeva", 2));
        return queue;
    }


}