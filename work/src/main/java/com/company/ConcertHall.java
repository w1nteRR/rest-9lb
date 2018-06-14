package com.company;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public final class ConcertHall {

    private String name;
    private String surname;
    private String address;
    private String workingHours;

    private List<Performance> performanceList = new LinkedList<>();

    public ConcertHall() {

    }

    public ConcertHall(final String name, final String surname, final String address, final String workingHours) {
        setName(name);
        setSurname(surname);
        setAddress(address);
        setWorkingHours(workingHours);
    }

    public List<Performance> sortByPrice(final List<Performance> result) {
        result.sort(Comparator.comparingDouble(Performance::getPrice));
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(final String workingHours) {
        this.workingHours = workingHours;
    }

    public List<Performance> getPerformanceList() {
        return performanceList;
    }

    public void addPerformance(final Performance performance) {
        this.performanceList.add(performance);
    }

    public void printList(final List<Performance> list) {
        System.out.println(list);
    }

    @Override
    public String toString() {
        return "ConcertHall{" +
                "name = '" + getName() + '\'' +
                ", surname = '" + getSurname() + '\'' +
                ", address = '" + getAddress() + '\'' +
                ", workingHours = " + getWorkingHours() +
                '}';
    }
}
