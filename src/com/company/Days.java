package com.company;

public enum Days {
    MONDAY("Дуйшомбу куну жава окуйм"),
    TUESDAY("Шейшемби куну англис тили сабагын окуйм"),
    WEDNESDAY("Шаршемби куну машыгууга барам"),
    THURSDAY("Бейшемби куну майман тосом"),
    FRIDAY("Жума куну уй-булом менен тамактанууга барам"),
    SATURDAY("Ишемби куну уй жумуштары менен алектенемин"),
    SUNDAY("Жекшемби куну тоого эс алганы барам");

    String day;

    Days(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return
                super.toString()+"=" +"{"+ day +
                "} " ;
    }
}
