package com.dgjw.acc;

import java.util.Calendar;

/**
 * Created by Ducks on 7/3/2015.
 */
public class ACCompanion {

    private ToDoList toDoList;
    private Villager[] villagers;
    private Item[] items;
    private Calendar calendar;

    private Displayable[] loadData(Parser parser) {
        Displayable[] result = new Displayable[0];

        return result;
    }

    public ToDoList getToDoList() {
        return toDoList;
    }

    public Item[] getItems() {
        return items;
    }

    public Villager[] getVillagers() {
        return villagers;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    //public Displayable search(String string) {}
}
