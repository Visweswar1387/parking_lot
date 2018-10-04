package com.parkingSlot;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
class App {
    public static Car parkingSlot[];
    public static int noOfSlots;
    public static void main(String[] args) throws IOException {

        String temp;
        // read input file
        FileReader fr = new FileReader("input.txt");
        BufferedReader br = new BufferedReader(fr);

        //For slot creation
        String[] slotCreate = br.readLine().split(" ");
        noOfSlots = (int) slotCreate[1].charAt(0) - 48;
        parkingSlot = new Car[noOfSlots];
        System.out.println("Created a parking lot with " + noOfSlots + " slots");
        Operations op = new Operations();

        while ( (temp = br.readLine()) != null ) {
            String[] parts = temp.split(" ");
            switch(parts[0]) {
                case "park" : op.park(parts[1],parts[2]);
                                break;
                case "status" : op.status();
                                break;
                case "leave" : int slotNo = (int) parts[1].charAt(0) - 48;
                                op.leave(slotNo);
                                break;
                case "slot_numbers_for_cars_with_colour" : op.find_Slot_numbers_for_cars_with_colour(parts[1]);
                                                            break;
                case "slot_number_for_registration_number" :op.find_Slot_number_for_registration_number(parts[1]);
                                                            break;
                case "registration_numbers_for_cars_with_colour" : op.find_Registration_numbers_for_cars_with_colour(parts[1]);
                                                            break;
            }
        }

    }
}