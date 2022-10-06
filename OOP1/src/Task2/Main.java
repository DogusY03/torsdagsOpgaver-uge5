package Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Room room = new Room(4, 6, 8);
        Room room2 = new Room(3, 2, 2);
        Room office = new Room(1, 3, 4);


        ArrayList<Room> rooms = new ArrayList<>();

        rooms.add(room);
        rooms.add(room2);
        rooms.add(office);

        Building building = new Building(rooms, 3, 1, 3);

        System.out.println(countLampsInBuilding(building));
        System.out.println(isNormal(building));

    }

    public static int countLampsInBuilding(Building b) {
        int count = 0;
        for (int i = 0; i < b.getRooms().size();i++){
            count += b.getRooms().get(i).getNumberOfLamps();
        }
        return count;
    }

    public static boolean isNormal(Building b) {
        if(b.getNumberOfFloors()> b.getRooms().size()){
            return true;
        } else{
            System.out.println("This is an ood building");
            return false;
        }


    }
    }


