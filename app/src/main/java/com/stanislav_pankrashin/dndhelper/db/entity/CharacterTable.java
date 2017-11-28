package com.stanislav_pankrashin.dndhelper.db.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.stanislav_pankrashin.dndhelper.model.Character;

/**
 * Created by stase on 28/11/2017.
 * An entity table which holds basic info for a character entry
 */


@Entity
public class CharacterTable implements Character{

    @PrimaryKey // readonly
    private int cid;

    @ColumnInfo(name = "character_name")
    private String character_name;

    @ColumnInfo(name = "background_color")
    private int background_color;

    @Override
    public int getCid() {
        return cid;
    }

    @Override
    public String getName() {
        return this.character_name;
    }

    public void setName(String newName){
        this.character_name = newName;
    }

    @Override
    public int getBackgroundColor() {
        return background_color;
    }

    public void setBackgroundColor(int newColor){
        this.background_color = newColor;
    }
}
