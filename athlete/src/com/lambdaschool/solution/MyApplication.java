package com.lambdaschool.initial;

public class MyApplication implements Processor
{
    private AthleteService athlete;

    public MyApplication(AthleteService athlete)
    {
        this.athlete = athelte;
    }

    public void display(String sport, String name)
    {
        System.out.println("***");
        athlete.display(sport,name);
        System.out.println("***");
    }
}