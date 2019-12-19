package org.launchcode.spaday.data;

import org.launchcode.spaday.models.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserData {
    private static final Map<Integer, User> events = new HashMap<>();

    public static Collection<User> getAll() {
        return events.values();
    }

    public static User getById(int id) {
        return events.get(id);
    }

    public static void add(User user) {
        events.put(user.getId(), user);
    }

    public static void remove(int id) {
        events.remove(id);
    }
}
