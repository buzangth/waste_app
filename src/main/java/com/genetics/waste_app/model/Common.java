package com.genetics.waste_app.model;

import org.springframework.data.annotation.Id;

public abstract class Common {

    @Id
    public String id;

    public String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
