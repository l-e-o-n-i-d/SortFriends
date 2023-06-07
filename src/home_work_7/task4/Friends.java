package home_work_7.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Friends {
    private List<String> friends = new ArrayList<>();

    public void addFriend(String friend){
        friends.add(friend);
    }

    public void sort(){
        Collections.sort(friends);
    }

    public List<String> getFriends() {
        return friends;
    }

}
