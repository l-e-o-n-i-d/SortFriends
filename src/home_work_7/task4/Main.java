package home_work_7.task4;

/**
 * Використовуючи Intelij IDEA, створити клас Friends. За допомогою методів ArrayList додати масив імена друзів.
 * Вивести список друзів, після вивести список друзів, відсортувавши в алфавітному порядку.
 */
public class Main {
    public static void main(String[] args) {
        Friends friends = new Friends();
        friends.addFriend("Сергій");
        friends.addFriend("Ярослав");
        friends.addFriend("Дмитро");
        friends.addFriend("Олег");
        System.out.println(friends.getFriends());
        friends.sort();
        for (String friend : friends.getFriends()) {
            System.out.println(friend);
        }

    }
}
