import java.util.LinkedList;
import java.util.Queue;

        public class Main {
            public static void main (String[] args) {
                Person dmitrii = new Person ("Dmitrii", "Prosolov", 3);
                Person julia = new Person ("Julia", "Karpovo", 2);
                Person andrey = new Person ("Andry", "Nikiforov", 1);
                Person vitalii = new Person ("Vitalii", "Maslukov", 4);
                Person ekaterina = new Person ("Ekaterina", "Zvyaginzeva", 2);

                Queue<Person> list = generateClients( dmitrii, julia, andrey, vitalii, ekaterina);

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
            public static Queue<Person> generateClients(Person first, Person second, Person third, Person fourth, Person fifth) {
                Queue<Person> queue = new LinkedList<>();
                queue.offer(first);
                queue.offer(second);
                queue.offer(third);
                queue.offer(fourth);
                queue.offer(fifth);
                return queue;
            }


        }
