package com.company;

public class Orchestra extends Performance {

    private int conductor;
    private int costumer;
    private int violinist;

    public Orchestra(final int price, final int employees, final int duration,
                     final int conductor, final int costumer, final int violinist ) {
        super(price, employees, duration );
        setConductor(conductor);
        setCostumer(costumer);
        setViolinist(violinist);
    }


    public int getConductor() {
        return conductor;
    }

    public void setConductor(final int conductor) {
        this.conductor = conductor;
    }

    public int getCostumer() {
        return costumer;
    }

    public void setCostumer(final int costumer) {
        this.costumer = costumer;
    }

    public int getViolinist() {
        return violinist;
    }

    public void setViolinist(final int violinist) {
        this.violinist = violinist;
    }

    @Override
    public final String toString() {
        return "Orchestra{" + super.toString() +
                "conductor=" + getConductor() +
                ", costumer=" + getCostumer() +
                ", violinist=" + getViolinist() +
                '}';
    }
}
