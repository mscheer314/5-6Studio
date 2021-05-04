package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Menu {
    private String menuName;
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> menuItems;

    public Menu(String menuName, LocalDate lastUpdated, ArrayList<MenuItem> menuItems) {
        this.menuName = menuName;
        this.lastUpdated = lastUpdated;
        this.menuItems = menuItems;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void addMenuItem(MenuItem item) {
        this.menuItems.add(item);
    }

    public void removeMenuItem(MenuItem item) {
        this.menuItems.remove(item);
    }

    @Override public String toString() {
        StringBuilder menuItemsStringBuilder = new StringBuilder();
        for(MenuItem item : menuItems) {
            menuItemsStringBuilder.append(item.toString());
        }
        String dateStr = this.lastUpdated.format(DateTimeFormatter.ISO_DATE);
        return String.format("%s\nLast updated: %s\n%s", this.menuName, dateStr,menuItemsStringBuilder);
    }
}
