import java.util.Scanner;

public class passenger {
    String[] firstName={"empty"};
    String[] surname={"empty"};
    String[] vehicle_no={"empty"};
    int[] NO_liters= new int[1];

    public int Name(String empty){
        //setting the first name
        Scanner input=new Scanner(System.in);
        if(firstName[0].equals("empty")) {
            System.out.print("Enter the first name :");
            String name = input.next();
            firstName[0] = name;
            return 0;
        }
        return 1;
    }
    public void surname(String empty){
        //setting the last name
        Scanner input=new Scanner(System.in);
        if (surname[0].equals("empty")) {
            System.out.print("Enter the Last Name :");
            String lastName = input.next();
            surname[0] = lastName;
        }

    }
    public void setVehicle_no(){
        //method for setting the vehicle number
        Scanner sc=new Scanner(System.in);
        if (vehicle_no[0].equals("empty")) {
            System.out.print("Enter the vehicle number :");
            String vehicleNo = sc.next();
            vehicle_no[0] = vehicleNo;
        }
    }
    public void setNo_liters() {
        //method for asking the no of litres requided
        Scanner input = new Scanner(System.in);
        if (NO_liters[0] == 0) {
            System.out.print("Enter the Number of liters needed: ");
            int no_liters = input.nextInt();
            NO_liters[0] = no_liters;
        }
    }
}
