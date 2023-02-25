import java.util.Objects;
import java.util.Scanner;

public class FuelQueue {//fuelQueue is managed from here
    public static void addToQueue(passenger[] pump1,passenger[] pump2,passenger[] pump3,passenger[] pump4,passenger[] pump5,int[] fuelStock) {
       //Method to add the customers according to the minimum empty spaces
        int Queue_no;
        int pump_1 = 0;
        int pump_2 = 0;
        int pump_3 = 0;
        int pump_4 = 0;
        int pump_5 = 0;
        for(int i=0;i<6;i++){
            if(Objects.equals(pump1[i].firstName[0], "empty")){
                pump_1+=1;
            }
            if(Objects.equals(pump2[i].firstName[0], "empty")){
                pump_2 +=1;
            }
            if(Objects.equals(pump3[i].firstName[0], "empty")){
                pump_3+=1;
            }
            if(Objects.equals(pump4[i].firstName[0], "empty")){
                pump_4+=1;
            }
            if(Objects.equals(pump5[i].firstName[0], "empty")){
                pump_5+=1;
            }
        }// comparing the minimum null count
        if(pump_1>= pump_2 && pump_1>=pump_3 && pump_1>=pump_4 && pump_1>=pump_5){
            Queue_no=1;
        }else if(pump_2 >=pump_1 && pump_2 >=pump_3 && pump_2>=pump_4 && pump_2>=pump_5) {
            Queue_no=2;
        } else if (pump_3>=pump_1 && pump_3>=pump_2 && pump_3>=pump_4 && pump_3>=pump_5) {
            Queue_no=3;
        } else if (pump_4>=pump_1 && pump_4>=pump_2 && pump_4>=pump_3 && pump_4>=pump_5) {
            Queue_no=4;
        }else {
            Queue_no=5;
        }

        int num = 0;
        if (Queue_no == 1) {
            for (int i = 0; i < 6; i++) {
                if (pump1[i].firstName[0].equals("empty")) {
                    pump1[i].Name("empty");
                    pump1[i].surname("empty");
                    pump1[i].setVehicle_no();
                    pump1[i].setNo_liters();
                    System.out.println(pump1[i].firstName[0]+" Has been added to Queue 1");
                    for (int x = 0; x < 1; x++) {
                        fuelStock[x] = fuelStock[x] - pump1[i].NO_liters[0];
                    }
                    break;
                } else {
                    num++;
                }
            }
            if (num == 6) {
                System.out.println("oops the Queue is full");
            }

        } else if (Queue_no == 2) {
            for (int i = 0; i < 6; i++) {
                if (pump2[i].firstName[0].equals("empty")) {
                    pump2[i].Name("empty");
                    pump2[i].surname("empty");
                    pump2[i].setVehicle_no();
                    pump2[i].setNo_liters();
                    System.out.println(pump2[i].firstName[0]+" Has been added to Queue 2");
                    for (int x = 0; x < 1; x++) {
                        fuelStock[x] = fuelStock[x] - pump2[i].NO_liters[0];
                    }
                    break;
                } else {
                    num++;
                }
            }
            if (num == 6) {
                System.out.println("oops the Queue is full");
            }
        } else if (Queue_no == 3) {
            for (int i = 0; i < 6; i++) {
                if (pump3[i].firstName[0].equals("empty")) {
                    pump3[i].Name("empty");
                    pump3[i].surname("empty");
                    pump3[i].setVehicle_no();
                    pump3[i].setNo_liters();
                    System.out.println(pump3[i].firstName[0]+" Has been added to Queue 3");
                    for (int x = 0; x < 1; x++) {
                        fuelStock[x] = fuelStock[x] - pump3[i].NO_liters[0];
                    }
                    break;
                } else {
                    num++;
                }
            }
            if (num == 6) {
                    System.out.println("oops the Queue is full");
            }
        } else if (Queue_no == 4) {
            for (int i = 0; i < 6; i++) {
                if (pump4[i].firstName[0].equals("empty")) {
                    pump4[i].Name("empty");
                    pump4[i].surname("empty");
                    pump4[i].setVehicle_no();
                    pump4[i].setNo_liters();
                    System.out.println(pump4[i].firstName[0]+" Has been added to Queue 4");
                    for (int x = 0; x < 1; x++) {
                        fuelStock[x] = fuelStock[x] - pump4[i].NO_liters[0];
                    }
                    break;
                } else {
                    num++;
                }
            }
            if (num == 6) {
                    System.out.println("oops the Queue is full");
            }
        } else {
            for (int i = 0; i < 6; i++) {
                if (pump5[i].firstName[0].equals("empty")) {
                    pump5[i].Name("empty");
                    pump5[i].surname("empty");
                    pump5[i].setVehicle_no();
                    pump5[i].setNo_liters();
                    System.out.println(pump5[i].firstName[0]+" Has been added to Queue 5");
                    for (int x = 0; x < 1; x++) {
                        fuelStock[x] = fuelStock[x] - pump5[i].NO_liters[0];
                    }
                    break;
                } else {
                    num++;
                }
            }
            if (num == 6) {
                    System.out.println("oops the Queue is full");
            }
        }

    }

    public static void RemoveCustomer(passenger[] pump1,passenger[] pump2,passenger[] pump3,passenger[] pump4,passenger[] pump5,int[] fuelStock) {
        //Removing a customer from a specific location.
        Scanner input = new Scanner(System.in);
        System.out.println("->press 1 for Queue 1 in pump 1");
        System.out.println("->press 2 for Queue 2 in pump 2");
        System.out.println("->press 3 for Queue 3 in pump 3");
        System.out.println("->press 4 for Queue 4 in pump 4");
        System.out.println("->press 5 for Queue 5 in pump 5");
        System.out.print("Enter the Queue Number:");
        int Queue_no= input.nextInt();
        switch (Queue_no){
            case 1:
                System.out.print("Enter the position number :");
                int position = input.nextInt() - 1;
                if (Objects.equals(pump1[position].firstName[0], "empty")){
                    System.out.println("The position is already empty");
                }else {System.out.println(pump1[position].firstName[0]+" Has been removed from Queue");}
                for(int x=0;x<1;x++) {
                    fuelStock[x] = fuelStock[x] + pump1[position].NO_liters[0];
                }
                if (position == 5) {
                    pump1[5].firstName[0] = "empty";
                    pump1[5].surname[0] = "empty";
                    pump1[5].vehicle_no[0] = "empty";
                    pump1[5].NO_liters[0] = 0;
                } else {
                    for (int i = 0; i < 6; i++) {
                        if ((position + i + 1) == 5) {
                            pump1[4].firstName[0] = pump1[5].firstName[0];
                            pump1[4].surname[0]=pump1[5].surname[0];
                            pump1[4].vehicle_no[0] = pump1[5].vehicle_no[0];
                            pump1[4].NO_liters[0]= pump1[5].NO_liters[0];
                            pump1[5].firstName[0] = "empty";
                            pump1[5].surname[0] = "empty";
                            pump1[5].vehicle_no[0] = "empty";
                            pump1[5].NO_liters[0] = 0;
                            break;
                        } else {
                            pump1[position + i].firstName[0] = pump1[position + i + 1].firstName[0];
                            pump1[position + i].surname[0] = pump1[position + i + 1].surname[0];
                            pump1[position + i].vehicle_no[0] = pump1[position + i + 1].vehicle_no[0];
                            pump1[position + i].NO_liters[0] = pump1[position + i + 1].NO_liters[0];
                        }
                    }
                }
                break;
            case 2:
                System.out.print("Enter the position number :");
                position = input.nextInt() - 1;
                if (Objects.equals(pump2[position].firstName[0], "empty")){
                    System.out.println("The position is already empty");
                }else {System.out.println(pump2[position].firstName[0]+" Has been removed from Queue");}
                for(int x=0;x<1;x++) {
                    fuelStock[x] = fuelStock[x] + pump2[position].NO_liters[0];
                }
                if (position == 5) {
                    pump2[5].firstName[0] = "empty";
                    pump2[5].surname[0] = "empty";
                    pump2[5].vehicle_no[0] = "empty";
                    pump2[5].NO_liters[0] = 0;
                } else {
                    for (int i = 0; i < 6; i++) {
                        if ((position + i + 1) == 5) {
                            pump2[4].firstName[0] = pump2[5].firstName[0];
                            pump2[4].surname[0]=pump2[5].surname[0];
                            pump2[4].vehicle_no[0] = pump2[5].vehicle_no[0];
                            pump2[4].NO_liters[0]= pump2[5].NO_liters[0];
                            pump2[5].firstName[0] = "empty";
                            pump2[5].surname[0] = "empty";
                            pump2[5].vehicle_no[0] = "empty";
                            pump2[5].NO_liters[0] = 0;
                            break;
                        } else {
                            pump2[position + i].firstName[0] = pump2[position + i + 1].firstName[0];
                            pump2[position + i].surname[0] = pump2[position + i + 1].surname[0];
                            pump2[position + i].vehicle_no[0] = pump2[position + i + 1].vehicle_no[0];
                            pump2[position + i].NO_liters[0] = pump2[position + i + 1].NO_liters[0];
                        }
                    }
                }
                break;
            case 3:
                System.out.print("Enter the position number :");
                position = input.nextInt() - 1;
                if (Objects.equals(pump3[position].firstName[0], "empty")){
                    System.out.println("The position is already empty");
                }else {System.out.println(pump3[position].firstName[0]+" Has been removed from Queue");}
                for(int x=0;x<1;x++) {
                    fuelStock[x] = fuelStock[x] + pump3[position].NO_liters[0];
                }
                if (position == 5) {
                    pump3[5].firstName[0] = "empty";
                    pump3[5].surname[0] = "empty";
                    pump3[5].vehicle_no[0] = "empty";
                    pump3[5].NO_liters[0] = 0;
                } else {
                    for (int i = 0; i < 6; i++) {
                        if ((position + i + 1) == 5) {
                            pump3[4].firstName[0] = pump3[5].firstName[0];
                            pump3[4].surname[0]=pump3[5].surname[0];
                            pump3[4].vehicle_no[0] = pump3[5].vehicle_no[0];
                            pump3[4].NO_liters[0]= pump3[5].NO_liters[0];
                            pump3[5].firstName[0] = "empty";
                            pump3[5].surname[0] = "empty";
                            pump3[5].vehicle_no[0] = "empty";
                            pump3[5].NO_liters[0] = 0;
                            break;
                        } else {
                            pump3[position + i].firstName[0] = pump3[position + i + 1].firstName[0];
                            pump3[position + i].surname[0] = pump3[position + i + 1].surname[0];
                            pump3[position + i].vehicle_no[0] = pump3[position + i + 1].vehicle_no[0];
                            pump3[position + i].NO_liters[0] = pump3[position + i + 1].NO_liters[0];
                        }
                    }
                }
                break;
            case 4:
                System.out.print("Enter the position number :");
                position = input.nextInt() - 1;
                if (Objects.equals(pump4[position].firstName[0], "empty")){
                    System.out.println("The position is already empty");
                }else {System.out.println(pump4[position].firstName[0]+" Has been removed from Queue");}
                for(int x=0;x<1;x++) {
                    fuelStock[x] = fuelStock[x] + pump4[position].NO_liters[0];
                }
                if (position == 5) {
                    pump4[5].firstName[0] = "empty";
                    pump4[5].surname[0] = "empty";
                    pump4[5].vehicle_no[0] = "empty";
                    pump4[5].NO_liters[0] = 0;
                } else {
                    for (int i = 0; i < 6; i++) {
                        if ((position + i + 1) == 5) {
                            pump4[4].firstName[0] = pump4[5].firstName[0];
                            pump4[4].surname[0]=pump4[5].surname[0];
                            pump4[4].vehicle_no[0] = pump4[5].vehicle_no[0];
                            pump4[4].NO_liters[0]= pump4[5].NO_liters[0];
                            pump4[5].firstName[0] = "empty";
                            pump4[5].surname[0] = "empty";
                            pump4[5].vehicle_no[0] = "empty";
                            pump4[5].NO_liters[0] = 0;
                            break;
                        } else {
                            pump4[position + i].firstName[0] = pump4[position + i + 1].firstName[0];
                            pump4[position + i].surname[0] = pump4[position + i + 1].surname[0];
                            pump4[position + i].vehicle_no[0] = pump4[position + i + 1].vehicle_no[0];
                            pump4[position + i].NO_liters[0] = pump4[position + i + 1].NO_liters[0];
                        }
                    }
                }
                break;
            case 5:
                System.out.print("Enter the position number :");
                position = input.nextInt() - 1;
                if (Objects.equals(pump5[position].firstName[0], "empty")){
                    System.out.println("The position is already empty");
                }else {System.out.println(pump5[position].firstName[0]+" Has been removed from Queue");}
                for(int x=0;x<1;x++) {
                    fuelStock[x] = fuelStock[x] + pump5[position].NO_liters[0];
                }
                if (position == 5) {
                    pump5[5].firstName[0] = "empty";
                    pump5[5].surname[0] = "empty";
                    pump5[5].vehicle_no[0] = "empty";
                    pump5[5].NO_liters[0] = 0;
                } else {
                    for (int i = 0; i < 6; i++) {
                        if ((position + i + 1) == 5) {
                            pump5[4].firstName[0] = pump5[5].firstName[0];
                            pump5[4].surname[0]=pump5[5].surname[0];
                            pump5[4].vehicle_no[0] = pump5[5].vehicle_no[0];
                            pump5[4].NO_liters[0]= pump5[5].NO_liters[0];
                            pump5[5].firstName[0] = "empty";
                            pump5[5].surname[0] = "empty";
                            pump5[5].vehicle_no[0] = "empty";
                            pump5[5].NO_liters[0] = 0;
                            break;
                        } else {
                            pump5[position + i].firstName[0] = pump5[position + i + 1].firstName[0];
                            pump5[position + i].surname[0] = pump5[position + i + 1].surname[0];
                            pump5[position + i].vehicle_no[0] = pump5[position + i + 1].vehicle_no[0];
                            pump5[position + i].NO_liters[0] = pump5[position + i + 1].NO_liters[0];
                        }
                    }
                }
                break;
            default:
                System.out.println("Error!! Please enter again");
        }
    }

    public static void income(passenger[] pump1,passenger[] pump2,passenger[] pump3,passenger[] pump4,passenger[] pump5){
        int total_1=0;// initializing the variable for each queue
        int total_2=0;
        int total_3=0;
        int total_4=0;
        int total_5=0;
        //calculating the total income from the queue 2
        System.out.println();
        for(int i=0;i<6;i++){
            total_1+=pump1[i].NO_liters[0];
        }
        System.out.println("Total income from Queue 1:"+(total_1 * 430)+"LKR");
        //calculating the total income from the queue 2
        System.out.println();
        for(int i=0;i<6;i++){
            total_2+=pump2[i].NO_liters[0];
        }
        System.out.println("Total income from Queue 2:"+(total_2 * 430)+"LKR");
        //calculating the total income from the queue 3
        System.out.println();
        for(int i=0;i<6;i++){
            total_3+=pump3[i].NO_liters[0];
        }
        System.out.println("Total income from Queue 3:"+(total_3 * 430)+"LKR");
        //calculating the total income from the queue 4
        System.out.println();
        for(int i=0;i<6;i++){
            total_4+=pump4[i].NO_liters[0];
        }
        System.out.println("Total income from Queue 4:"+(total_4 * 430)+"LKR");
        //calculating the total income from the queue 3
        System.out.println();
        for(int i=0;i<6;i++){
            total_5+=pump5[i].NO_liters[0];
        }
        System.out.println("Total income from Queue 5:"+(total_5 * 430)+"LKR");
        System.out.println();
        System.out.println("------------ Total for all the Queues --------------");
        System.out.println("Total income from all the queues: "+(total_1+total_2+total_3+total_4+total_5)*430+"LKR");
        System.out.println();
    }

}

