package Character;

import Character.Job.Job;
import Character.Race.Race;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;

public class Character implements IDamage{

    private String name;
    private Race race;
    private Job job;
    private Strength strength;
    private Dexterity dexterity;
    private Constitution constitution;
    private Intelligence intelligence;


    public Character(String name, Race race, Job job, Strength strength, Dexterity dexterity, Constitution constitution, Intelligence intelligence){
        this.name = name;
        this.race = race;
        this.job = job;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;

    }

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }

    public Job getJob() {
        return job;
    }

    public double velocity(){
        return ((dexterity.getValue()+race.modifier(dexterity)+ job.modifier(dexterity)) * 2);
    }

    public double power(){
        return ((strength.getValue()+ race.modifier(strength)+ job.modifier(strength)) * 2);
    }

    public double magic(){
        return  ((intelligence.getValue()+ race.modifier(intelligence)+ job.modifier(intelligence)) * 2);
    }

    @Override
    public String toString() {
        return "My name is " + name +
                ". I'm an " + race + job +
                ". My stats are: Strength: " + strength +
                ", Dexterity: " + dexterity +
                ", Constitution: " + constitution +
                ", Intelligence: " + intelligence +
                ", Velocity: " + velocity() + ", Power: " + power()
                + ", Magic: " + magic() + ", Health: ";
    }

    @Override
    public double maxHealth() {
        return (constitution.getValue()+ race.modifier(constitution)+ job.modifier(constitution)) * 25;
    }

    @Override
    public double health() {
        return 0;
    }

    @Override
    public boolean isDead() {
        return false;
    }

    @Override
    public void recivesDamage(double amount) {

    }

    @Override
    public void heals(double amount) {

    }
}

