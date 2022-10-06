package Task2;

import java.util.ArrayList;

public class Building {
    private final ArrayList<Room> rooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private int isOfficeBuilding;

    public Building(ArrayList<Room> rooms,int numberOfBathrooms, int numberOfFloors, int isOfficeBuilding) {
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;


    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public int isOfficeBuilding() {
        return isOfficeBuilding;
    }
}
