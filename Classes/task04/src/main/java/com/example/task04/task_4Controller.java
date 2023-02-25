package com.example.task04;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.Objects;

public class task_4Controller {
    @FXML
    private TextArea Queue;
    @FXML
    private TextArea result;
    @FXML
    private TextField search;
    @FXML
    protected void task4() {
        //Displaying all the Queue details in the GUI
        StringBuilder Fuel_Details= new StringBuilder();
        Fuel_Details.append("------------ Queue 1 --------------\n");
        for(int i=0;i<Main.pump1.length;i++){
            if(!Objects.equals(Main.pump1[i].firstName[0], "empty")){
                Fuel_Details.append("\n(").append(i + 1).append(") position details :");
                Fuel_Details.append("\n   ->First name : ").append(Main.pump1[i].firstName[0]);
                Fuel_Details.append("\n    ->Last name : ").append(Main.pump1[i].surname[0]);
                Fuel_Details.append("\n   ->vehicle No : ").append(Main.pump1[i].vehicle_no[0]);
                Fuel_Details.append("\n   ->Number of liters : ").append(Main.pump1[i].NO_liters[0]);
                Fuel_Details.append("\n");
            } else {
                Fuel_Details.append("\n(").append(i + 1).append(") position  is empty");
            }
        }
        Fuel_Details.append("\n------------ Queue 2 --------------");
        for(int i=0;i<Main.pump2.length;i++) {
            if (!Objects.equals(Main.pump2[i].firstName[0], "empty")) {
                Fuel_Details.append("\n(").append(i + 1).append(") position details :");
                Fuel_Details.append("\n   ->First name : ").append(Main.pump2[i].firstName[0]);
                Fuel_Details.append("\n    ->Last name : ").append(Main.pump2[i].surname[0]);
                Fuel_Details.append("\n   ->vehicle No : ").append(Main.pump2[i].vehicle_no[0]);
                Fuel_Details.append("\n   ->Number of liters : ").append(Main.pump2[i].NO_liters[0]);
                Fuel_Details.append("\n");
            } else {
                Fuel_Details.append("\n(").append(i + 1).append(") position  is empty");
            }
        }
        Fuel_Details.append("\n------------ Queue 3 --------------");
        for(int i=0;i<Main.pump3.length;i++) {
            if (!Objects.equals(Main.pump3[i].firstName[0], "empty")) {
                Fuel_Details.append("\n(").append(i + 1).append(") position details :");
                Fuel_Details.append("\n   ->First name : ").append(Main.pump3[i].firstName[0]);
                Fuel_Details.append("\n    ->Last name : ").append(Main.pump3[i].surname[0]);
                Fuel_Details.append("\n   ->vehicle No : ").append(Main.pump3[i].vehicle_no[0]);
                Fuel_Details.append("\n   ->Number of liters : ").append(Main.pump3[i].NO_liters[0]);
                Fuel_Details.append("\n");
            } else {
                Fuel_Details.append("\n(").append(i + 1).append(") position  is empty");
            }
        }
        Fuel_Details.append("\n------------ Queue 4 --------------");
        for(int i=0;i<Main.pump4.length;i++) {
            if (!Objects.equals(Main.pump4[i].firstName[0], "empty")) {
                Fuel_Details.append("\n(").append(i + 1).append(") position details :");
                Fuel_Details.append("\n   ->First name : ").append(Main.pump4[i].firstName[0]);
                Fuel_Details.append("\n    ->Last name : ").append(Main.pump4[i].surname[0]);
                Fuel_Details.append("\n   ->vehicle No : ").append(Main.pump4[i].vehicle_no[0]);
                Fuel_Details.append("\n   ->Number of liters : ").append(Main.pump4[i].NO_liters[0]);
                Fuel_Details.append("\n");
            } else {
                Fuel_Details.append("\n(").append(i + 1).append(") position  is empty");
            }
        }
        Fuel_Details.append("\n------------ Queue 5 --------------");
        for(int i=0;i<Main.pump5.length;i++) {
            if (!Objects.equals(Main.pump5[i].firstName[0], "empty")) {
                Fuel_Details.append("\n(").append(i + 1).append(") position details :");
                Fuel_Details.append("\n   ->First name : ").append(Main.pump5[i].firstName[0]);
                Fuel_Details.append("\n    ->Last name : ").append(Main.pump5[i].surname[0]);
                Fuel_Details.append("\n   ->vehicle No : ").append(Main.pump5[i].vehicle_no[0]);
                Fuel_Details.append("\n   ->Number of liters : ").append(Main.pump5[i].NO_liters[0]);
                Fuel_Details.append("\n");
            } else {
                Fuel_Details.append("\n(").append(i + 1).append(") position  is empty");
            }
        }
        Queue.setText(Fuel_Details.toString());
    }
    @FXML
    protected void searchbar() {
        String name = search.getText();
        String Details = "";
        boolean x=false;

        for(int i=0;i<Main.pump1.length;i++) {
            if (Objects.equals(Main.pump1[i].firstName[0], name)) {
                Details += ("\n(" + (i + 1) + ") position details in Queue 1 :");
                Details += ("\n   ->First name : ") + (Main.pump1[i].firstName[0]);
                Details += ("\n    ->Last name : ") + (Main.pump1[i].surname[0]);
                Details += ("\n   ->vehicle No : ") + (Main.pump1[i].vehicle_no[0]);
                Details += ("\n   ->Number of liters : ") + (Main.pump1[i].NO_liters[0]);
                Details += ("\n");
                break;
            } else if (Objects.equals(Main.pump2[i].firstName[0], name)) {
                Details += ("\n(" + (i + 1) + ") position details in Queue 2 :");
                Details += ("\n   ->First name : ") + (Main.pump2[i].firstName[0]);
                Details += ("\n    ->Last name : ") + (Main.pump2[i].surname[0]);
                Details += ("\n   ->vehicle No : ") + (Main.pump2[i].vehicle_no[0]);
                Details += ("\n   ->Number of liters : ") + (Main.pump2[i].NO_liters[0]);
                Details += ("\n");
                break;
            } else if (Objects.equals(Main.pump3[i].firstName[0], name)) {
                Details += ("\n(" + (i + 1) + ") position details in Queue 3 :");
                Details += ("\n   ->First name : ") + (Main.pump3[i].firstName[0]);
                Details += ("\n    ->Last name : ") + (Main.pump3[i].surname[0]);
                Details += ("\n   ->vehicle No : ") + (Main.pump3[i].vehicle_no[0]);
                Details += ("\n   ->Number of liters : ") + (Main.pump3[i].NO_liters[0]);
                Details += ("\n");
                break;
            } else if (Objects.equals(Main.pump4[i].firstName[0], name)) {
                Details += ("\n(" + (i + 1) + ") position details in Queue 4:");
                Details += ("\n   ->First name : ") + (Main.pump4[i].firstName[0]);
                Details += ("\n    ->Last name : ") + (Main.pump4[i].surname[0]);
                Details += ("\n   ->vehicle No : ") + (Main.pump4[i].vehicle_no[0]);
                Details += ("\n   ->Number of liters : ") + (Main.pump4[i].NO_liters[0]);
                Details += ("\n");
                break;
            } else if (Objects.equals(Main.pump5[i].firstName[0], name)) {
                Details += ("\n(" + (i + 1) + ") position details in Queue 5:");
                Details += ("\n   ->First name : ") + (Main.pump5[i].firstName[0]);
                Details += ("\n    ->Last name : ") + (Main.pump5[i].surname[0]);
                Details += ("\n   ->vehicle No : ") + (Main.pump5[i].vehicle_no[0]);
                Details += ("\n   ->Number of liters : ") + (Main.pump5[i].NO_liters[0]);
                Details += ("\n");
                break;
            }else {
                Details += "\nName cannot be found";
                x = true;
                if (x == true) {
                    break;
                }
            }
        }
        result.setText(Details);
    }
}
