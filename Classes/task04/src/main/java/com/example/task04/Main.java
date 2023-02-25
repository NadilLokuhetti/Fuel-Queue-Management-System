package com.example.task04;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static passenger[] pump1 = new passenger[6];
    public static passenger[] pump2 = new passenger[6];
    public static passenger[] pump3 = new passenger[6];
    public static passenger[] pump4 = new passenger[6];
    public static passenger[] pump5 = new passenger[6];
    public static void main(String[] args) {
        for (int i = 0; i < pump1.length; i++) {
            pump1[i] = new passenger();
            pump2[i] = new passenger();
            pump3[i] = new passenger();
            pump4[i] = new passenger();
            pump5[i] = new passenger();

        }
        int[] fuelStock = new int[1];
        fuelStock[0]=6600;

        Loop:
        while (true) {
            System.out.println("--------------Menu---------------");
            System.out.println("100 or VFQ: View all fuel Queues");
            System.out.println("101 or VEQ: View all Empty Queues");
            System.out.println("102 or ACQ: Add customer to a Queue");
            System.out.println("103 or RCQ: Remove a customer from a Queue");
            System.out.println("104 or PCQ: Remove a served customer");
            System.out.println("105 or VCS: View customers sorted in alphabetical order");
            System.out.println("106 or SPD: Store program data into file");
            System.out.println("107 or LPD: Load program Data from the file");
            System.out.println("108 or STK: View Remaining Fuel stock");
            System.out.println("109 or AFS: Add Fuel stock");
            System.out.println("110 or IFQ: income of each fuel Queue");
            System.out.println("111 or QWE: To check the Queues in GUI");
            System.out.println("999 or EXT: Exit the program");
            System.out.println("----------------------------------");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your option :");
            String option = sc.next();

            switch (option) {
                case "100":
                case "VFQ":
                    System.out.println("all the fuel queues :");
                    allQueues();
                    break;
                case "101":
                case "VEQ":
                    System.out.println("Empty Queues:");
                    emptyQueues();
                    break;
                case "102":
                case "ACQ":
                    System.out.println("Add customer to the Queue");
                    FuelQueue.addToQueue(pump1,pump2,pump3,pump4,pump5,fuelStock);
                    break;
                case "103":
                case "RCQ":
                    System.out.println("Remove a customer from the Queue");
                    FuelQueue.RemoveCustomer(pump1,pump2,pump3,pump4,pump5,fuelStock);
                    break;
                case "104":
                case "PCQ":
                    System.out.println("Remove served customer from the Queue");
                    severedCustomer(fuelStock);
                    break;
                case "105":
                case "VCS":
                    System.out.println("sorted list in alphabetical order");
                    alphabetical_order();
                    break;
                case "106":
                case "SPD":
                    System.out.println("You have successfully stored data into a file");
                    storeTOFile(fuelStock);
                    break;
                case "107":
                case "LPD":
                    System.out.println("Data from the stored file");
                    loadData();
                    break;
                case "108":
                case "STK":
                    System.out.println("Remaining fuel stock is " + fuelStock[0] + " Liters");
                    if (fuelStock[0] <= 500) {
                        System.out.println("Warning!! Your stock is less than 500 liters");
                    }
                    break;
                case "109":
                case "AFS":
                    System.out.println("Add fuel stock");
                    addFuel(fuelStock);
                    break;
                case "110":
                case "IFQ":
                    System.out.println("Total income from Queues");
                    FuelQueue.income(pump1,pump2,pump3,pump4,pump5);
                    break;
                case "111":
                case "QWE":
                    System.out.println("The GUI for the Queue information");
                    task_4Application.main(args);
                    break;
                case "999":
                case "EXT":
                    System.out.println("You have Exit the program");
                    break Loop;
                default:
                    System.out.println("Invalid Input!!,Please enter again");

            }
        }
    }
    public static void allQueues(){
        System.out.println("------------ Queue 1 --------------");
        for(int i=0;i<pump1.length;i++){
            if(!Objects.equals(pump1[i].firstName[0], "empty")){
                System.out.println("(" + (i + 1) + ") position details :");
                System.out.println("   ->First name : " + pump1[i].firstName[0]);
                System.out.println("    ->Last name : " + pump1[i].surname[0]);
                System.out.println("   ->vehicle No : " + pump1[i].vehicle_no[0]);
                System.out.println("   ->Number of liters : " + pump1[i].NO_liters[0]);
                System.out.println();
            } else {
                System.out.println("(" + (i + 1) + ") position  is empty");
            }
        }
        System.out.println("------------ Queue 2 --------------");
        for(int l=0;l<pump2.length;l++){
            if(!Objects.equals(pump2[l].firstName[0], "empty")){
                System.out.println("(" + (l + 1) + ") position details :");
                System.out.println("   ->First name : " + pump2[l].firstName[0]);
                System.out.println("    ->Last name : " + pump2[l].surname[0]);
                System.out.println("   ->vehicle No : " + pump2[l].vehicle_no[0]);
                System.out.println("   ->Number of liters : " + pump2[l].NO_liters[0]);
                System.out.println();
            } else {
                System.out.println("(" + (l + 1) + ") position  is empty");
            }
        }
        System.out.println("------------ Queue 3 --------------");
        for(int l=0;l<pump3.length;l++){
            if(!Objects.equals(pump3[l].firstName[0], "empty")){
                System.out.println("(" + (l + 1) + ") position details :");
                System.out.println("  ->First name : " + pump3[l].firstName[0]);
                System.out.println("   ->Last name : " + pump3[l].surname[0]);
                System.out.println("  ->vehicle No : " + pump3[l].vehicle_no[0]);
                System.out.println("   ->Number of liters : " + pump3[l].NO_liters[0]);
                System.out.println();
            } else {
                System.out.println("(" + (l + 1) + ") position  is empty");
            }
        }
        System.out.println("------------ Queue 4 --------------");
        for(int l=0;l<pump4.length;l++){
            if(!Objects.equals(pump4[l].firstName[0], "empty")){
                System.out.println("(" + (l + 1) + ") position details :");
                System.out.println("  ->First name : " + pump4[l].firstName[0]);
                System.out.println("   ->Last name : " + pump4[l].surname[0]);
                System.out.println("  ->vehicle No : " + pump4[l].vehicle_no[0]);
                System.out.println("   ->Number of liters : " + pump4[l].NO_liters[0]);
                System.out.println();
            } else {
                System.out.println("(" + (l + 1) + ") position  is empty");
            }
        }
        System.out.println("------------ Queue 5 --------------");
        for(int l=0;l<pump5.length;l++){
            if(!Objects.equals(pump5[l].firstName[0], "empty")){
                System.out.println("(" + (l + 1) + ") position details :");
                System.out.println("  ->First name : " + pump5[l].firstName[0]);
                System.out.println("   ->Last name : " + pump5[l].surname[0]);
                System.out.println("  ->vehicle No : " + pump5[l].vehicle_no[0]);
                System.out.println("   ->Number of liters : " + pump5[l].NO_liters[0]);
                System.out.println();
            } else {
                System.out.println("(" + (l + 1) + ") position  is empty");
            }
        }
    }
    private static void emptyQueues(){
        System.out.println("------------ Queue 1 --------------");
        for(int i=0;i<pump1.length;i++){
            if(pump1[i].firstName[0].equals("empty")){
                System.out.println("("+(i+1)+") is empty");
            }
        }
        System.out.println("------------ Queue 2 --------------");
        for(int i=0;i<pump2.length;i++){
            if(pump2[i].firstName[0].equals("empty")){
                System.out.println("("+(i+1)+") is empty");
            }
        }
        System.out.println("------------ Queue 3 --------------");
        for(int i=0;i<pump3.length;i++){
            if(pump3[i].firstName[0].equals("empty")){
                System.out.println("("+(i+1)+") is empty");
            }
        }
        System.out.println("------------ Queue 4 --------------");
        for(int i=0;i<pump4.length;i++){
            if(pump4[i].firstName[0].equals("empty")){
                System.out.println("("+(i+1)+") is empty");
            }
        }
        System.out.println("------------ Queue 5 --------------");
        for(int i=0;i<pump5.length;i++){
            if(pump5[i].firstName[0].equals("empty")){
                System.out.println("("+(i+1)+") is empty");
            }
        }
    }
    private static void severedCustomer(int[] fuelStock){
        //Removing a served customer by using the customer name
        Scanner input = new Scanner(System.in);
        System.out.println("->press 1 for Queue 1 in pump 1");
        System.out.println("->press 2 for Queue 2 in pump 2");
        System.out.println("->press 3 for Queue 3 in pump 3");
        System.out.println("->press 4 for Queue 4 in pump 4");
        System.out.println("->press 5 for Queue 5 in pump 5");
        System.out.print("Enter the Queue Number:");
        int Queue_no= input.nextInt();
        if(Queue_no==1) {
            int position = 0;
            if (Objects.equals(pump1[0].firstName[0], "empty")){
                System.out.println("The Queue is empty");
            }else {System.out.println(pump1[0].firstName[0]+" Has been removed from Queue");}
            for (int i = 0; i < 6; i++) {
                if ((position + i + 1) == 5) {
                    pump1[4].firstName[0] = pump1[5].firstName[0];
                    pump1[4].surname[0] = pump1[5].surname[0];
                    pump1[4].vehicle_no[0] = pump1[5].vehicle_no[0];
                    pump1[4].NO_liters[0] = pump1[5].NO_liters[0];
                    if(!FuelQueue.waitingList.isEmpty()){
                        passenger fromWaitingList = FuelQueue.waitingList.deQueue();
                        pump1[5]=fromWaitingList;
                        System.out.println(fromWaitingList.firstName[0]+" has been added to the Queue 1");
                        fuelStock[0]= fuelStock[0]-pump1[5].NO_liters[0];
                    }else {
                        pump1[5].firstName[0] = "empty";
                        pump1[5].surname[0] = "empty";
                        pump1[5].vehicle_no[0] = "empty";
                        pump1[5].NO_liters[0] = 0;
                    }
                    break;
                } else {
                    pump1[position + i].firstName[0] = pump1[position + i + 1].firstName[0];
                    pump1[position + i].surname[0] = pump1[position + i + 1].surname[0];
                    pump1[position + i].vehicle_no[0] = pump1[position + i + 1].vehicle_no[0];
                    pump1[position + i].NO_liters[0] = pump1[position + i + 1].NO_liters[0];
                }
            }
        } else if (Queue_no==2) {
            int position = 0;
            if (Objects.equals(pump2[0].firstName[0], "empty")){
                System.out.println("The Queue is empty");
            }else {System.out.println(pump2[0].firstName[0]+" Has been removed from Queue");}
            for (int i = 0; i < 6; i++) {
                if ((position + i + 1) == 5) {
                    pump2[4].firstName[0] = pump2[5].firstName[0];
                    pump2[4].surname[0] = pump2[5].surname[0];
                    pump2[4].vehicle_no[0] = pump2[5].vehicle_no[0];
                    pump2[4].NO_liters[0] = pump2[5].NO_liters[0];
                    if(!FuelQueue.waitingList.isEmpty()){
                        passenger fromWaitingList = FuelQueue.waitingList.deQueue();
                        pump2[5]=fromWaitingList;
                        System.out.println(fromWaitingList.firstName[0]+" has been added to the Queue 2");
                        fuelStock[0]= fuelStock[0]-pump2[5].NO_liters[0];
                    }else {
                        pump2[5].firstName[0] = "empty";
                        pump2[5].surname[0] = "empty";
                        pump2[5].vehicle_no[0] = "empty";
                        pump2[5].NO_liters[0] = 0;
                    }
                    break;
                } else {
                    pump2[position + i].firstName[0] = pump2[position + i + 1].firstName[0];
                    pump2[position + i].surname[0] = pump2[position + i + 1].surname[0];
                    pump2[position + i].vehicle_no[0] = pump2[position + i + 1].vehicle_no[0];
                    pump2[position + i].NO_liters[0] = pump2[position + i + 1].NO_liters[0];
                }
            }
        } else if (Queue_no==3) {
            int position = 0;
            if (Objects.equals(pump3[0].firstName[0], "empty")){
                System.out.println("The Queue is empty");
            }else {System.out.println(pump3[0].firstName[0]+" Has been removed from Queue");}
            for (int i = 0; i < 6; i++) {
                if ((position + i + 1) == 5) {
                    pump3[4].firstName[0] = pump3[5].firstName[0];
                    pump3[4].surname[0] = pump3[5].surname[0];
                    pump3[4].vehicle_no[0] = pump3[5].vehicle_no[0];
                    pump3[4].NO_liters[0] = pump3[5].NO_liters[0];
                    if(!FuelQueue.waitingList.isEmpty()){
                        passenger fromWaitingList = FuelQueue.waitingList.deQueue();
                        pump3[5]=fromWaitingList;
                        System.out.println(fromWaitingList.firstName[0]+" has been added to the Queue 3");
                        fuelStock[0]= fuelStock[0]-pump3[5].NO_liters[0];
                    }else {
                        pump3[5].firstName[0] = "empty";
                        pump3[5].surname[0] = "empty";
                        pump3[5].vehicle_no[0] = "empty";
                        pump3[5].NO_liters[0] = 0;
                    }
                    break;
                } else {
                    pump3[position + i].firstName[0] = pump3[position + i + 1].firstName[0];
                    pump3[position + i].surname[0] = pump3[position + i + 1].surname[0];
                    pump3[position + i].vehicle_no[0] = pump3[position + i + 1].vehicle_no[0];
                    pump3[position + i].NO_liters[0] = pump3[position + i + 1].NO_liters[0];
                }
            }
        } else if (Queue_no==4) {
            int position = 0;
            if (Objects.equals(pump4[0].firstName[0], "empty")){
                System.out.println("The Queue is empty");
            }else {System.out.println(pump4[0].firstName[0]+" Has been removed from Queue");}
            for (int i = 0; i < 6; i++) {
                if ((position + i + 1) == 5) {
                    pump4[4].firstName[0] = pump4[5].firstName[0];
                    pump4[4].surname[0] = pump4[5].surname[0];
                    pump4[4].vehicle_no[0] = pump4[5].vehicle_no[0];
                    pump4[4].NO_liters[0] = pump4[5].NO_liters[0];
                    if(!FuelQueue.waitingList.isEmpty()){
                        passenger fromWaitingList = FuelQueue.waitingList.deQueue();
                        pump4[5]=fromWaitingList;
                        System.out.println(fromWaitingList.firstName[0]+" has been added to the Queue 4");
                        fuelStock[0]= fuelStock[0]-pump4[5].NO_liters[0];
                    }else {
                        pump4[5].firstName[0] = "empty";
                        pump4[5].surname[0] = "empty";
                        pump4[5].vehicle_no[0] = "empty";
                        pump4[5].NO_liters[0] = 0;
                    }
                    break;
                } else {
                    pump4[position + i].firstName[0] = pump4[position + i + 1].firstName[0];
                    pump4[position + i].surname[0] = pump4[position + i + 1].surname[0];
                    pump4[position + i].vehicle_no[0] = pump4[position + i + 1].vehicle_no[0];
                    pump4[position + i].NO_liters[0] = pump4[position + i + 1].NO_liters[0];
                }
            }
        }else if (Queue_no==5) {
            int position = 0;
            if (Objects.equals(pump5[0].firstName[0], "empty")){
                System.out.println("The Queue is empty");
            }else {System.out.println(pump5[0].firstName[0]+" Has been removed from Queue");}
            for (int i = 0; i < 6; i++) {
                if ((position + i + 1) == 5) {
                    pump5[4].firstName[0] = pump5[5].firstName[0];
                    pump5[4].surname[0] = pump5[5].surname[0];
                    pump5[4].vehicle_no[0] = pump5[5].vehicle_no[0];
                    pump5[4].NO_liters[0] = pump5[5].NO_liters[0];
                    if(!FuelQueue.waitingList.isEmpty()){
                        passenger fromWaitingList = FuelQueue.waitingList.deQueue();
                        pump5[5]=fromWaitingList;
                        System.out.println(fromWaitingList.firstName[0]+" has been added to the Queue 5");
                        fuelStock[0]= fuelStock[0]-pump5[5].NO_liters[0];
                    }else {
                        pump5[5].firstName[0] = "empty";
                        pump5[5].surname[0] = "empty";
                        pump5[5].vehicle_no[0] = "empty";
                        pump5[5].NO_liters[0] = 0;
                    }
                    break;
                } else {
                    pump5[position + i].firstName[0] = pump5[position + i + 1].firstName[0];
                    pump5[position + i].surname[0] = pump5[position + i + 1].surname[0];
                    pump5[position + i].vehicle_no[0] = pump5[position + i + 1].vehicle_no[0];
                    pump5[position + i].NO_liters[0] = pump5[position + i + 1].NO_liters[0];
                }
            }
        }
    }
    private static void alphabetical_order() { //method to display customer name in alphabetical oder
        String[] Queue1 =new String[6];
        String[] Queue2 =new String[6];
        String[] Queue3 =new String[6];
        String[] Queue4 =new String[6];
        String[] Queue5 =new String[6];
        int Queue_1 =0;
        int Queue_2 =0;
        int Queue_3 =0;
        int Queue_4 =0;
        int Queue_5 =0;

        for(int i=0;i<6;i++){
            Queue1[Queue_1++]=pump1[i].firstName[0];
            Queue2[Queue_2++]=pump2[i].firstName[0];
            Queue3[Queue_3++]=pump3[i].firstName[0];
            Queue4[Queue_4++]=pump4[i].firstName[0];
            Queue5[Queue_5++]=pump5[i].firstName[0];
        }
        String letter;
        for (int i = 0; i < 6; i++) {
            for (int l = i + 1; l < 6; l++) {
                if (Queue1[i].compareTo(Queue1[l]) > 0) {
                    letter = Queue1[l];
                    Queue1[l] = Queue1[i];
                    Queue1[i] = letter;
                }
            }
            for (int l = i + 1; l < 6; l++) {
                if (Queue2[i].compareTo(Queue2[l]) > 0) {
                    letter = Queue2[l];
                    Queue2[l] = Queue2[i];
                    Queue2[i] = letter;
                }
            }
            for (int l = i + 1; l < 6; l++) {
                if (Queue3[i].compareTo(Queue3[l]) > 0) {
                    letter = Queue3[l];
                    Queue3[l] = Queue3[i];
                    Queue3[i] = letter;
                }
            }
            for (int l = i + 1; l < 6; l++) {
                if (Queue4[i].compareTo(Queue4[l]) > 0) {
                    letter = Queue4[l];
                    Queue4[l] = Queue4[i];
                    Queue4[i] = letter;
                }
            }
            for (int l = i + 1; l < 6; l++) {
                if (Queue5[i].compareTo(Queue5[l]) > 0) {
                    letter = Queue5[l];
                    Queue5[l] = Queue5[i];
                    Queue5[i] = letter;
                }
            }
        }
        System.out.println("    Queue 1   ");
        for (int z=0;z<6;z++){
            if(!(Queue1[z].equals("empty"))) {
                System.out.println(Queue1[z]);
            }
        }
        System.out.println("    Queue 2   ");
        for (int z=0;z<6;z++){
            if(!(Queue2[z].equals("empty"))) {
                System.out.println(Queue2[z]);
            }
        }
        System.out.println("    Queue 3   ");
        for (int z=0;z<6;z++){
            if(!(Queue3[z].equals("empty"))) {
                System.out.println(Queue3[z]);
            }
        }
        System.out.println("    Queue 4   ");
        for (int z=0;z<6;z++){
            if(!(Queue4[z].equals("empty"))) {
                System.out.println(Queue4[z]);
            }
        }
        System.out.println("    Queue 5   ");
        for (int z=0;z<6;z++){
            if(!(Queue5[z].equals("empty"))) {
                System.out.println(Queue5[z]);
            }
        }
    }

    public static void storeTOFile(int[] fuelStock){
        try{
            BufferedWriter writer=new BufferedWriter((new FileWriter("Data_file.txt")));
            writer.write("\nQueue 1: ");
            for (int i=0;i<6;i++) {
                if (!Objects.equals(pump1[i].firstName[0], "empty")) {
                    writer.write("\n" + (i + 1) + ") position details :");
                    writer.write("\n   -> First name : " + pump1[i].firstName[0]);
                    writer.write("\n   -> Last name : " + pump1[i].surname[0]);
                    writer.write("\n   -> vehicle No : " + pump1[i].vehicle_no[0]);
                    writer.write("\n   -> Number of litres : " + pump1[i].NO_liters[0]+"\n");
                } else {
                    writer.write("\n" + (i + 1) + ") position  is empty");
                }
            }
            writer.write("\n\nQueue 2: ");
            for (int i=0;i<6;i++) {
                if (!Objects.equals(pump2[i].firstName[0], "empty")) {
                    writer.write("\n" + (i + 1) + ") position details :");
                    writer.write("\n   -> First name : " + pump2[i].firstName[0]);
                    writer.write("\n   -> Last name : " + pump2[i].surname[0]);
                    writer.write("\n   -> vehicle No : " + pump2[i].vehicle_no[0]);
                    writer.write("\n   -> Number of litres : " + pump2[i].NO_liters[0]+"\n");
                } else {
                    writer.write("\n" + (i + 1) + ") position  is empty");
                }
            }
            writer.write("\n\nQueue 3: ");
            for (int i=0;i<6;i++) {
                if (!Objects.equals(pump3[i].firstName[0], "empty")) {
                    writer.write("\n" + (i + 1) + ") position details :");
                    writer.write("\n   -> First name : " + pump3[i].firstName[0]);
                    writer.write("\n   -> Last name : " + pump3[i].surname[0]);
                    writer.write("\n   -> vehicle No : " + pump3[i].vehicle_no[0]);
                    writer.write("\n   -> Number of litres : " + pump3[i].NO_liters[0]+"\n");
                } else {
                    writer.write("\n" + (i + 1) + ") position  is empty");
                }
            }
            writer.write("\n\nQueue 4: ");
            for (int i=0;i<6;i++) {
                if (!Objects.equals(pump4[i].firstName[0], "empty")) {
                    writer.write("\n" + (i + 1) + ") position details :");
                    writer.write("\n   -> First name : " + pump4[i].firstName[0]);
                    writer.write("\n   -> Last name : " + pump4[i].surname[0]);
                    writer.write("\n   -> vehicle No : " + pump4[i].vehicle_no[0]);
                    writer.write("\n   -> Number of litres : " + pump4[i].NO_liters[0]+"\n");
                } else {
                    writer.write("\n" + (i + 1) + ") position  is empty");
                }
            }
            writer.write("\n\nQueue 5: ");
            for (int i=0;i<6;i++) {
                if (!Objects.equals(pump5[i].firstName[0], "empty")) {
                    writer.write("\n" + (i + 1) + ") position details :");
                    writer.write("\n   -> First name : " + pump5[i].firstName[0]);
                    writer.write("\n   -> Last name : " + pump5[i].surname[0]);
                    writer.write("\n   -> vehicle No : " + pump5[i].vehicle_no[0]);
                    writer.write("\n   -> Number of litres : " + pump5[i].NO_liters[0]+"\n");
                } else {
                    writer.write("\n" + (i + 1) + ") position  is empty");
                }
            }
            writer.write("\n\n");
            writer.write("The remaining fuel stock is: "+ Arrays.toString(fuelStock));
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void loadData(){
        try{
            File file= new File("Data_File.txt");//https://www.w3schools.com/java/java_files_read.asp
            Scanner read=new Scanner(file);
            while (read.hasNextLine()){
                String data= read.nextLine();
                System.out.println(data);
            }
            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("oops!! something went wrong");
            e.printStackTrace();
        }
    }
    private static void addFuel(int[] fuelStock){ //Method to add fuel to the stock.
        if (fuelStock[0]==6600){
            System.out.println("Fuel stock is filed");
        }else {
            Scanner input= new Scanner(System.in);
            System.out.print("Enter the new fuel stock :");
            int stock= input.nextInt();
            int stock_1= stock + fuelStock[0];
            if (stock_1>6600){
                System.out.println("Tank limit has excited");
            }else {
                fuelStock[0] = stock_1;
                System.out.println("you have successfully add the fuel to the stock.");
            }
        }
    }

}
