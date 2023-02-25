import java.io.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class task_one {
    public static void main(String[] args) {
        String[] pump1 = new String[6];//creating the arrays for the pumps
        String[] pump2 = new String[6];
        String[] pump3 = new String[6];
        int[] fuelStock= new int[1];
        fuelStock[0]=6600;
        Queues(pump1, pump2, pump3);
        loop:
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
            System.out.println("999 or EXT: Exit the program");
            System.out.println("----------------------------------");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your option :");
            String option = sc.next();

            switch (option) {
                case "100":
                case "VFQ":
                    System.out.println("all the fuel queues :");
                    allQueues(pump1,pump2,pump3);
                    break;
                case "101":
                case "VEQ":
                    System.out.println("Empty Queues:");
                    emptyQueues(pump1,pump2,pump3);
                    break;
                case "102":
                case "ACQ":
                    System.out.println("Add customer to the Queue");
                    addToQueue(pump1,pump2,pump3,fuelStock);
                    break;
                case "103":
                case "RCQ":
                    System.out.println("Remove a customer from the Queue");
                    RemoveCustomer(pump1,pump2,pump3,fuelStock);
                    break;
                case "104":
                case "PCQ":
                    System.out.println("Remove served customer from the Queue");
                    severedCustomer(pump1,pump2,pump3);
                    break;
                case "105":
                case "VCS":
                    System.out.println("Customers in alphabetical order");
                    Order(pump1,pump2,pump3);
                    break;
                case "106":
                case "SPD":
                    System.out.println("You have successfully stored data into a file");
                    storeTOFile(pump1,pump2,pump3,fuelStock);
                    break;
                case "107":
                case "LPD":
                    System.out.println("Data from the stored file");
                    loadData();
                    break;
                case "108":
                case "STK":
                    System.out.println("Remaining fuel stock is "+fuelStock[0]+" Liters");
                    if(fuelStock[0]<=500){
                        System.out.println("Warning!! Your stock is less than 500 liters");
                    }
                    break;
                case "109":
                case "AFS":
                    System.out.println("Add fuel stock");
                    addFuel(fuelStock);
                    break;
                case "999":
                case "EXT":
                    System.out.println("You have Exit the program");
                    break loop;
                default:
                    System.out.println("Invalid Input!!,Please enter again");

            }
        }

    }

    private static void Queues(String[] pump1,String[] pump2,String[] pump3) {
        //Initialing the arrays to an empty string
        for (int i = 0; i < 6; i++)
            pump1[i] = "-";
        for (int j = 0; j < 6; j++)
            pump2[j] = "-";
        for (int l = 0; l < 6; l++)
            pump3[l] = "-";
    }
    private static void allQueues(String[] pump1,String[] pump2,String[] pump3){
        //Displaying all the Queues
        System.out.println("------------Queue 1--------------");
        for (int i = 0; i < 6; i++) {
            System.out.println((i+1)+") is Filled with: "+ pump1[i]);
        }
        System.out.println("------------Queue 2---------------");
        for (int j = 0; j < 6; j++) {
            System.out.println((j+1) + ") is Filled with: " + pump2[j]);
        }
        System.out.println("------------Queue 3---------------");
        for (int l = 0; l < 6; l++) {
            System.out.println((l+1) + ") is Filled with: " + pump3[l]);
        }
    }

    private static void emptyQueues(String[] pump1,String[] pump2,String[] pump3) {
        //Displaying all the empty Queues
        System.out.println("------------Queue 1--------------");
        for (int i = 0; i < 6; i++) {
            if (pump1[i].equals("-"))
                System.out.println("position ("+(i+1)+")" + pump1[i]+" is empty");
        }
        System.out.println("------------Queue 2---------------");
        for (int j = 0; j < 6; j++) {
            if (pump2[j].equals("-"))
                System.out.println("position ("+(j+1)+")" + pump2[j]+" is empty");
        }
        System.out.println("------------Queue 3---------------");
        for (int l = 0; l < 6; l++) {
            if (pump3[l].equals("-"))
                System.out.println(("position ("+(l+1)+")" + pump3[l]+" is empty"));
        }
    }
    public static void addToQueue(String[] pump1, String[] pump2, String[] pump3,int[] fuelStock) {
        //method to add new customers to the Queues by giving the Queue number
        int Queue;
        int num = 0;
        Scanner sc;
        while (true) {
            try {
                System.out.println("->press 1 to Queue 1 for pump 1");
                System.out.println("->press 2 to Queue 2 for pump 2");
                System.out.println("->press 3 to Queue 3 for pump 3");
                sc = new Scanner(System.in);
                System.out.print("Enter Queue number :");
                Queue = sc.nextInt();
                if (1 <= Queue && Queue <= 3) {
                    break;
                } else {
                    System.out.println("Invalid input!! please enter the correct Queue number.");
                }
            } catch (Exception e) {
                System.out.println("Inputs only can be the displayed options!");
            }
        }
        System.out.print("Enter the customers name: ");
        String name = sc.next();
        if(Queue==1){
            for(int i=0;i<6;i++){
                if(pump1[i].equals("-")){
                    pump1[i]=name;
                    System.out.println(name+" Has been added to Queue 1");
                    for(int x=0;x<1;x++) {
                        fuelStock[x] = fuelStock[x] - 10;
                    }
                    break;
                }else {
                    num++;
                }
            }
            if(num==6){
                System.out.println("oops!! Queue 1 is full, try another Queue");
            }
        }else if(Queue==2){
            for(int i=0;i<6;i++){
                if(pump2[i].equals("-")){
                    pump2[i]=name;
                    System.out.println(name+" Has been added to Queue 2");
                    for(int x=0;x<1;x++) {
                        fuelStock[x] = fuelStock[x] - 10;
                    }
                    break;
                }else {
                    num++;
                }
            }
            if(num==6){
                System.out.println("oops!! Queue 2 is full, try another Queue");
            }
        }else {
            for(int i=0;i<6;i++){
                if(pump3[i].equals("-")){
                    pump3[i]=name;
                    System.out.println(name+" Has been added to Queue 3");
                    for(int x=0;x<1;x++) {
                        fuelStock[x] = fuelStock[x] - 10;
                    }
                    break;
                }else {
                    num++;
                }
            }
            if(num==6){
                System.out.println("oops!! Queue 3 is full, try another Queue");
            }
        }
    }

    private static void RemoveCustomer(String[] pump1,String[] pump2,String[] pump3,int[] fuelStock){
        //Method for removing customers from a specific location by taking the user input for the location
        System.out.println("->press 1 for Queue 1 for pump 1");
        System.out.println("->press 2 for Queue 2 for pump 2");
        System.out.println("->press 3 for Queue 3 for pump 3");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Queue Number:");
        int Queue_no= sc.nextInt();
        switch (Queue_no) {// Removing customers from Queue one
            case 1:
                System.out.print("Enter the position 1 to 6 number to remove: ");
                int positionNo = sc.nextInt()-1;
                if (Objects.equals(pump1[positionNo], "-")){
                    System.out.println("The position is already empty");
                }else {System.out.println(pump1[positionNo]+" Has been removed from Queue");}
                for (int x = 0; x < 1; x++) {
                    fuelStock[x] = fuelStock[x] + 10;
                }
                if (positionNo == 5) {
                    pump1[positionNo] = "-";
                } else {
                    for (int i = 0; i < 6; i++) {
                        if ((positionNo + i + 1) == 5) {
                            pump1[4] = pump1[5];
                            pump1[5] = "-";
                            break;
                        } else {
                            pump1[positionNo + i] = pump1[positionNo + i + 1];
                        }
                    }
                }
                break;
            case 2:
                System.out.print("Enter the position number to remove: ");
                int position_NO = sc.nextInt();
                if (Objects.equals(pump1[position_NO], "-")){
                    System.out.println("The position is already empty");
                }else {System.out.println(pump1[position_NO]+" Has been removed from Queue");}
                for (int l = 0; l < 1; l++) {
                    fuelStock[l] = fuelStock[l] + 10;
                }
                if (position_NO == 5) {
                    pump2[position_NO] = "-";
                } else {
                    for (int l = 0; l < 6; l++) {
                        if ((position_NO + l + 1) == 5) {
                            pump2[4] = pump2[5];
                            pump2[5] = "-";
                            break;
                        } else {
                            pump2[position_NO + l] = pump2[position_NO + l + 1];
                        }
                    }
                }
                break;
            case 3:
                System.out.print("Enter the position number to remove: ");
                positionNo = sc.nextInt();
                if (Objects.equals(pump1[positionNo], "-")){
                    System.out.println("The position is already empty");
                }else {System.out.println(pump1[positionNo]+" Has been removed from Queue");}
                for (int x = 0; x < 1; x++) {
                    fuelStock[x] = fuelStock[x] + 10;
                }
                if (positionNo == 5) {
                    pump3[positionNo] = "-";
                } else {
                    for (int i = 0; i < 6; i++) {
                        if ((positionNo + i + 1) == 5) {
                            pump3[4] = pump3[5];
                            pump3[5] = "-";
                            break;
                        } else {
                            pump3[positionNo + i] = pump3[positionNo + i + 1];
                        }
                    }
                }
                break;
            default:
                System.out.println("Invalid input please enter again");
                RemoveCustomer(pump1, pump2, pump3, fuelStock);
        }

    }
    private static void severedCustomer(String[] pump1,String[] pump2,String[] pump3){
        //Removing the served customer from the Queue by removing the fist one in the Queue
        Scanner input = new Scanner(System.in);
        System.out.println("->press 1 for Queue 1 in pump 1");
        System.out.println("->press 2 for Queue 2 in pump 2");
        System.out.println("->press 3 for Queue 3 in pump 3");
        System.out.print("Enter the Queue Number:");
        int Queue_no= input.nextInt();
        if(Queue_no==1) {
            if (Objects.equals(pump1[0], "-")){
                System.out.println("The Queue is empty");
            }else {System.out.println(pump1[0]+" Has been removed from Queue");}
            int position = 0;
            for (int i = 0; i < 6; i++) {
                if ((position + i + 1) == 5) {
                    pump1[4]= pump1[5];
                    pump1[5] = "-";
                    break;
                } else {
                    pump1[position + i]= pump1[position + i + 1];
                }
            }
        } else if (Queue_no==2) {
            int position = 0;
            if (Objects.equals(pump2[0], "-")){
                System.out.println("The Queue is empty");
            }else {System.out.println(pump2[0]+" Has been removed from Queue");}
            for (int i = 0; i < 6; i++) {
                if ((position + i + 1) == 5) {
                    pump2[4]= pump2[5];
                    pump2[5] = "-";
                    System.out.println("The customer has served successfully");
                    break;
                } else {
                    pump2[position + i]= pump2[position + i + 1];
                }
            }
        } else if (Queue_no==3) {
            int position = 0;
            if (Objects.equals(pump3[0], "-")){
                System.out.println("The Queue is empty");
            }else {System.out.println(pump3[0]+" Has been removed from Queue");}
            for (int i = 0; i < 6; i++) {
                if ((position + i + 1) == 5) {
                    pump3[4] = pump3[5];
                    pump3[5] = "-";
                    System.out.println("The customer has served successfully");
                    break;
                } else {
                    pump3[position + i] = pump3[position + i + 1];
                }
            }
        }  else {
            System.out.println("Error!! Please enter again");
        }
    }
    private static void Order(String[] pump1,String[] pump2,String[] pump3){
        //method to display customer name in alphabetical oder
        String letter;
        for (int i=0;i<6-1;i++){
            for(int l=i+1;l<6;l++){
                if (pump1[i].compareTo(pump1[l])>0){
                    letter=pump1[l];
                    pump1[l]=pump1[i];
                    pump1[i]=letter;
                }
            }
            for(int l=i+1;l<6;l++){
                if (pump2[i].compareTo(pump2[l])>0){
                    letter=pump2[l];
                    pump2[l]=pump2[i];
                    pump2[i]=letter;
                }
            }
            for(int l=i+1;l<6;l++){
                if (pump3[i].compareTo(pump3[l])>0){
                    letter=pump3[l];
                    pump3[l]=pump3[i];
                    pump3[i]=letter;
                }
            }
        }

        System.out.println("sorted list in alphabetical order");
        System.out.println("-------------Queue 1---------------");
        for (int z=0;z<6;z++){
            if(!(pump1[z].equals("-"))) {
                System.out.println(pump1[z]);
            }
        }
        System.out.println("-------------Queue 2---------------");
        for (int z=1;z<6;z++) {
            if (!(pump2[z].equals("-"))) {
                System.out.println(pump2[z]);
            }
        }
        System.out.println("-------------Queue 3---------------");
        for (int z=0;z<6;z++) {
            if (!(pump3[z].equals("-"))) {
                System.out.println(pump3[z]);
            }
        }
    }
    private static void storeTOFile(String[] pump1,String[] pump2,String[] pump3,int[] fuelStock){
        //Storing data to the text file.
        try{
            BufferedWriter writer=new BufferedWriter((new FileWriter("data_File.txt")));//https://www.javatpoint.com/java-bufferedwriter-class
            writer.write("\nQueue 1: ");
            for (int i=0;i<6;i++){
                writer.write("\n"+"position "+(i+1)+" filled by "+ pump1[i]);
            }
            writer.write("\n\nQueue 2: ");
            for (int i=0;i<6;i++){
                writer.write("\n"+"position "+(i+1)+" filled by "+ pump2[i]);
            }
            writer.write("\n\nQueue 3: ");
            for (int i=0;i<6;i++) {
                writer.write("\n" + "position " + (i + 1) + " filled by " + pump3[i]);
            }
            writer.write("\n\n");
            writer.write("The remaining fuel stock is: "+ Arrays.toString(fuelStock));
            writer.close();
        }catch (Exception e){
            e.printStackTrace(); //https://stackoverflow.com/questions/2560368/what-is-the-use-of-printstacktrace-method-in-java
        }
    }
    private static void loadData(){
        //reading the data from the text file
        try{
            File file= new File("data_File.txt");//https://www.w3schools.com/java/java_files_read.asp
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
    private static void addFuel(int[] fuelStock){
        //Method to add fuel to the stock.
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
                System.out.println(stock+"l  have successfully add the fuel to the stock.");
            }
        }
    }
}

