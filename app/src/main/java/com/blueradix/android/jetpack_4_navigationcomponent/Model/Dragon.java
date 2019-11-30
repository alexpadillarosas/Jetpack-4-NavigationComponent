package com.blueradix.android.jetpack_4_navigationcomponent.Model;

import java.io.Serializable;

public class Dragon implements Serializable {
    public static final String DRAGON_KEY="DRAGON_KEY";

    private String name;
    private DragonType type;
    private String description;
    private Integer resId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DragonType getType() {
        return type;
    }

    public void setType(DragonType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getResId() {
        return resId;
    }

    public void setResId(Integer resId) {
        this.resId = resId;
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", description='" + description + '\'' +
                ", resId=" + resId +
                '}';
    }
}
