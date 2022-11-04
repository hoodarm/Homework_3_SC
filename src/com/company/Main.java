package com.company;

public class Main {

    public static void main(String[] args) {
        Newspaper HS = new Newspaper("Helsingin Sanomat", 2022, 11, 4, true);
        System.out.println(HS);
    }
}

class Newspaper
{
    public Newspaper(String name, int year, int month, int dayOfMonth, Boolean isFinnish)
    {
        this.dayOfMonth=dayOfMonth;
        this.isFinnish=isFinnish;
        this.year=year;
        this.month=month;
        this.name=name;
    }

    public String getName()
    {
        return name;
    }

    public void setDate(int year, int month, int dayOfMonth)
    {
        this.month=month;
        this.year=year;
        this.dayOfMonth=dayOfMonth;
    }

    public int getYear()
    {
        return year;
    }

    public int getDayOfMonth()
    {
        return dayOfMonth;
    }

    public boolean getIsFinnish()
    {
        return isFinnish;
    }

    public String toString()
    {
        return (name + ": " + dayOfMonth + "/" + month + "/" + year);
    }

    private String name;
    private int year;
    private int month;
    private int dayOfMonth;
    private boolean isFinnish;
}
