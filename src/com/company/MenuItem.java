package com.company;

import java.util.Objects;

public class MenuItem {
    private String name;
    private Double price;
    private String description;
    private Category category;
    private Boolean isNew;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public MenuItem(String name, Double price, String description, Category category, Boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    @Override public String toString() {
        String isNewString = "";
        if (this.isNew) {
            isNewString = "NEW!!";
        }
        return String.format("%s\n%s: %s\n%.2f %s\n\n",
                category, name, description, price, isNewString);
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(name, menuItem.name);
    }
}
