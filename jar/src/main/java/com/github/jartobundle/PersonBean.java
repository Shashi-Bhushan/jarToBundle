package com.github.jartobundle;

/**
 * Created by Shashi on 12/22/2016.
 */
public class PersonBean {

    private String name;

    public PersonBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
