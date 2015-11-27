package ru.javawebinar.topjava.model;

import java.time.LocalDateTime;

/**
 * GKislin
 * 11.01.2015.
 */
public class UserMealWithExceed extends UserMeal{

    protected final boolean exceed;

    public UserMealWithExceed(LocalDateTime dateTime, String description, int calories, boolean exceed) {
        super(dateTime, description, calories);
        this.exceed = exceed;
    }

    public UserMealWithExceed(UserMeal m, boolean exceed) {
        super(m.dateTime, m.description, m.calories);
        this.exceed = exceed;
    }

    @Override
    public String toString() {
        return "UserMealWithExceed{" +
                "exceed=" + exceed +
                "} " + super.toString();
    }
}
