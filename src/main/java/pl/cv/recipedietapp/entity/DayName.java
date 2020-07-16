package pl.cv.recipedietapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DayName {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int displayOrder;

    public DayName() {
    }

    public int getId() {
        return id;
    }

    public DayName setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public DayName setName(String name) {
        this.name = name;
        return this;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public DayName setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
        return this;
    }
}
