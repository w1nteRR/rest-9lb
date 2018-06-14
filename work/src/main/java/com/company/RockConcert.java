package com.company;

public class RockConcert extends Performance {

    private int guitarist;
    private int pianist;
    private int drummer;

    public RockConcert(final int price, final int employees, final int duration,
                       final int guitarist, final int pianist, final int drummer ) {
        super(price, employees, duration);
        setGuitarist(guitarist);
        setPianist(pianist);
        setDrummer(drummer);
    }


    public final int getGuitarist() {
        return guitarist;
    }

    public final void setGuitarist(final int guitarist) {
        this.guitarist = guitarist;
    }

    public final int getPianist() {
        return pianist;
    }

    public final void setPianist(final int pianist) {
        this.pianist = pianist;
    }

    public final int getDrummer() {
        return drummer;
    }

    public final void setDrummer(final int drummer) {
        this.drummer = drummer;
    }

    @Override
    public String toString() {
        return "RockConcert{" + super.toString() +
                "guitarist = " + getGuitarist() +
                ", pianist = " + getPianist() +
                ", drummer = " + getDrummer() +
                '}';
    }
}