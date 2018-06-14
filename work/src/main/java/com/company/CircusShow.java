package com.company;

public class CircusShow extends Performance {

    private String director;
    private String acrobats;
    private int participants;
    private int lions;

    public CircusShow(final int price, final int employees, final int duration,
                      final String director, final String acrobats, final int participants, final int lions) {
        super(price, employees, duration );
        setDirector(director);
        setAcrobats(acrobats);
        setParticipants(participants);
        setLions(lions);
    }

    public final String getDirector() {
        return director;
    }

    public final void setDirector(final String director) {
        this.director = director;
    }

    public final String getAcrobats() {
        return acrobats;
    }

    public final void setAcrobats(final String acrobats) {
        this.acrobats = acrobats;
    }

    public final int getParticipants() {
        return participants;
    }

    public final void setParticipants(final int participants) {
        this.participants = participants;
    }

    public final int getLions() {
        return lions;
    }

    public final void setLions(final int lions) {
        this.lions = lions;
    }

    @Override
    public final String toString() {
        return "CircusShow{" + super.toString() +
                "director = '" + getDirector() + '\'' +
                ", acrobats = '" + getAcrobats() + '\'' +
                ", participants = " + getParticipants() +
                ", lions = " + getLions() + '}';
    }

}
