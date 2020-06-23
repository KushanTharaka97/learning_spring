package com.kushanTharaka.selfLearnSpring.learningspring.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "ROOM")
public class Room {
    //creating roomID coloumn
    @Id
    @Column(name = "ROOM_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long roomID;


    //creating the Name of the Room
    @Column(name = "NAME")
    private String roomName;

    //Creating room number coloumn
    @Column(name = "ROOM_NUMBER")
    private String roomNumber;

    //Bed info coloumn
    @Column(name = "BED_INFO")
    private String bedInfo;

    //auto generated getters and setters are here

    public Long getRoomID() {
        return roomID;
    }

    public void setRoomID(Long roomID) {
        this.roomID = roomID;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBedInfo() {
        return bedInfo;
    }

    public void setBedInfo(String bedInfo) {
        this.bedInfo = bedInfo;
    }
}
