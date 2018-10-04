package com.parkingSlot;
public class Operations extends App {

    public void park(String reg_no, String colour) {
        int tem=0;
        for(int i=0;i<parkingSlot.length;i++) {
            if(parkingSlot[i]!=null) {
                tem++;
            }
        }
        if(tem==noOfSlots) {
            System.out.println("Sorry, parking lot is full");
        }
        else {
            Car car = new Car();
            car.setReg_no(reg_no);
            car.setColour(colour);
            for(int i=0;i<parkingSlot.length;i++) {
                if(parkingSlot[i]==null) {
                    parkingSlot[i]=car;
                    System.out.println("Allocated slot number:"+(i+1));
                    break;
                }
            }
        }
    }
    public void status() {
        System.out.println("Slot No.\t Registration No \tColour");
        for(int i=0;i<parkingSlot.length;i++) {
            if(parkingSlot[i]!=null) {
                System.out.print(i+1+"\t");
                System.out.print("\t\t"+parkingSlot[i].getReg_no()+"\t");
                System.out.print("\t"+parkingSlot[i].getColour()+"\n");
            }
        }
    }

    public void leave(int slotNo) {
        if(parkingSlot[slotNo-1]==null) {
            System.out.println("Slot is already free");
        }
        if(parkingSlot[slotNo-1]!=null) {
            parkingSlot[slotNo-1]=null;
            System.out.println("Slot number "+ slotNo +" is free");
        }
    }

    public void find_Slot_numbers_for_cars_with_colour(String part) {
        int check=0;
        for(int i=0;i<parkingSlot.length;i++) {
            if(parkingSlot[i]!=null) {
                if(parkingSlot[i].getColour().equals(part)) {
                    check=1;
                    System.out.print(i+1+"\t");
                }
            }
        }
        if(check==0) {
            System.out.println("Not found");
        }
        System.out.println();
    }

    public void find_Slot_number_for_registration_number( String part) {
        int check=0;
        for(int i=0;i<parkingSlot.length;i++) {
            if(parkingSlot[i]!=null) {
                if(parkingSlot[i].getReg_no().equals(part)) {
                    check=1;
                    System.out.print(i+1+"\t");
                }
            }
        }
        if(check==0) {
            System.out.println("Not found");
        }
        System.out.println();
    }

    public void find_Registration_numbers_for_cars_with_colour(String part) {
        int check=0;
        for(int i=0;i<parkingSlot.length;i++) {
            if(parkingSlot[i]!=null) {
                if(parkingSlot[i].getColour().equals(part)) {
                    check=1;
                    System.out.print(parkingSlot[i].getReg_no()+"\t");
                }
            }
        }
        if(check==0) {
            System.out.println("Not found");
        }
        System.out.println();
    }
}
