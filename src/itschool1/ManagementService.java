package itschool1;

public class ManagementService {
    public static void main(String[] args) {
        LivingRoom livingRoom = new LivingRoom();
        System.out.println(livingRoom.getColour());//null

        //setColour receive a parameter of type String, and it will be the value of 'colour' variables, from the class LivingRoom
        livingRoom.setColour("Green");
        System.out.println(livingRoom.getColour());//green

        livingRoom.setLengthRoom(2.5);
        livingRoom.setWidthRoom(3.1);
        livingRoom.setWindowsLength(1.5);
        livingRoom.setWindowsWidth(3.5);
        //ctrl+p - show parameter type and number of parameter
        livingRoom.setWindowsPosition("On the right side of the building");

        livingRoom.setAc(true);
        livingRoom.setTv(true);
        livingRoom.setWifi(true);
        livingRoom.setCoach(true);
        livingRoom.setWindows(true);

        boolean isAcRoom = livingRoom.isAc();
        boolean isTvRoom = livingRoom.isTv();
        boolean isWifiRoom = livingRoom.isWifi();
        boolean isCouchRoom = livingRoom.isCoach();
        boolean isWindowsRoom = livingRoom.isWindows();


//to move some line code from top or bottom you need to press ctrl+shift adn arrow up or down
        //For use this the class at the bottom need to be static.
        double feeForRoomSize = getFeeForRoomSize(livingRoom.getLengthRoom(), livingRoom.getWidthRoom());
        double feeForUtilities = getFeeForUtilities(isCouchRoom, isTvRoom, isAcRoom, isWifiRoom, isWindowsRoom);
        double totalLivingRoomFee = feeForRoomSize + feeForUtilities;
        System.out.println("Total fee for living room: " + totalLivingRoomFee);
    }

    public static double getFeeForRoomSize(double length, double width) {
        double priceForSquareMeter = 10;
        double roomSize = length * width;
        //double fee = roomSize * priceForSquareMeter;
        return roomSize * priceForSquareMeter;
    }

    public static double getFeeForUtilities(boolean ac, boolean tv, boolean couch, boolean wifi, boolean windows) {
        double fee = 0;                       //to this
        double feePerUnit = 5;                //add this
        if (ac) {                     // if ac is true
            fee += feePerUnit; // it means if ac is true add double fee = 0  one  double feePerUnit
        } else if (tv) {
            fee += feePerUnit;
        } else if (couch) {
            fee += feePerUnit;
        } else if (wifi) {
            fee += feePerUnit;
        } else if (windows) {
            fee += feePerUnit;
        }
        return fee;
    }
}