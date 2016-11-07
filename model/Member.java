package model;


import view.StartApp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Member implements Serializable{

    private static final long serialVersionUID = 1L;

    private String name;
    private String personalNumber;
    private Long memberId;
    private List<Boat> boats = new ArrayList<Boat>();



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Boat getBoat(Integer index) {
        return boats.get(index);
    }

    public void addBoat(Boat boat) {
        this.boats.add(boat);
    }

    public void removeBoat(Boat boat) {
        this.boats.remove(boat);
    }

    public java.util.Iterator<Boat> getBoats() {
        return boats.iterator();
    }
    public Integer getBoatsSize() {
        return boats.size();
    }


}
