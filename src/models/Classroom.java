package models;
//name,room_no,ac,tv,capacity
public class Classroom {
    public String name;
    public int capacity,roomNo;
    public boolean ac,tv;

    public Classroom(String name, int capacity, int roomNo, boolean ac, boolean tv) {
        this.name = name;
        this.capacity = capacity;
        this.roomNo = roomNo;
        this.ac = ac;
        this.tv = tv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }
}