package com.dgjw.acc;

import android.graphics.Picture;

/**
 * Created by Ducks on 7/3/2015.
 */
public class Item implements Displayable, Checkable{

    private String type;
    private String name;
    private boolean collected;
    private Picture picture;

    public String getType() {
        return type;
    }

    public boolean isCollected() {
        return collected;
    }

    public void display(){
        //display item
    }

    public String getName() {
        return name;
    }

    public boolean isChecked() {
        //is this identical to isCollected??
        return collected;
    }
}
