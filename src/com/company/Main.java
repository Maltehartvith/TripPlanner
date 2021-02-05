package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean stop = true;
        Scanner scan = new Scanner(System.in);
        ArrayList<Trip> denVildeTur = new ArrayList<>();
        BeachTrip tur = new BeachTrip("Denmark", 8, 7999, "buss", "googles", true);
        SkiTrip tur2 = new SkiTrip("Sweden", 10, 7899, "buss", "Snowboad",0);
        BeachTrip tur3= new BeachTrip("Croatia", 10, 8999, "Plane", "FlipFlops", true);
        denVildeTur.add(tur);
        denVildeTur.add(tur2);
        denVildeTur.add(tur3);

        menu();

            while(stop){
        switch(scan.next()) {


            case "1":
                System.out.println("Do you want to plan a beach trip(1), or a Ski trip(2)?");
                if(createTrip(scan) != null){
                    denVildeTur.add(createTrip(scan));

                }else {
                    System.out.println("null doesnt get added");
                }
                System.out.println(denVildeTur);
                menu();
                break;

            case "2":
                print(denVildeTur);
                menu();
                break;
            case "3":
                System.out.println("What kind of trip do you want to edit? Beach(1) or Ski(2)?");
                int i = scan.nextInt();
                if(i == 1){

                }
                if(i == 2){
                    editSkiTrip(scan, denVildeTur);
                }

                break;
            case "-1":
                stop = false;
                break;

            default:
                System.out.println("Wrong option. Try again.");
                break;
        }
        }
    }
    public static void menu(){

        System.out.println("Trip menu:\n1. Create trip\n2. List trip\n-1 to exit");
    }
    public static Trip createTrip(Scanner scan){

         int a = scan.nextInt();
        if(a == 1){
            System.out.println("Enter country: ");
            String c = scan.next();
            System.out.println("Enter how many days you are planning to travel: ");
            int d = scan.nextInt();
            System.out.println("Enter the price you are willing to pay: ");
            double p = scan.nextDouble();
            System.out.println("Enter your preference of transportation: ");
            String t = scan.next();
            System.out.println("What equipment are you bringing?: ");
            String e = scan.next();
            System.out.println("Did you remember sun screen? true/false");
            boolean s = scan.nextBoolean();
            BeachTrip beachTur = new BeachTrip(c, d, p, t, e, s);

            return beachTur;

        }if(a == 2){
            Random ran = new Random();
            System.out.println("Enter country: ");
            String c = scan.next();
            System.out.println("Enter how many days you are planning to travel: ");
            int d = scan.nextInt();
            System.out.println("Enter the price you are willing to pay: ");
            double p = scan.nextDouble();
            System.out.println("Enter your preference of transportation: ");
            String t = scan.next();
            System.out.println("What equipment are you bringing?: ");
            String e = scan.next();
            int s = ran.nextInt(10000) + 1;
            SkiTrip SkiTur = new SkiTrip(c, d, p, t, e, s);

            return SkiTur;

        }else{

            System.out.println("You typed something wrong - try again.");
        }
        return null;
    }
    public static void print(ArrayList<Trip> t){

        for (Trip p:t) {
            System.out.println(p);
        }
    }
    public static SkiTrip editSkiTrip(Scanner scan, ArrayList<Trip> t){
            int a = 0;

            ArrayList<SkiTrip> tt = new ArrayList<>();
            for (Trip p : t) {
                if (p.toString().contains("Ski Trip")) {
                    tt.add((SkiTrip) p);
                    System.out.println(a + ". " + p);
                    a++;
                }
            }
        System.out.println("What trip do you want to edit?");
            int b = scan.nextInt();
        System.out.println("What do you want to edit?");

        if(scan.next().equalsIgnoreCase("country")){
            System.out.println("Which country do you want to change it to?");
            String c = scan.next();
            tt.get(b).setCountry(c);
            return tt.get(b);
        }if(scan.next().equalsIgnoreCase("Duration")){
            System.out.println("How many days did you intend to write?");
            int d = scan.nextInt();
            tt.get(b).setDuration(d);
            return tt.get(b);
        }if(scan.next().equalsIgnoreCase("cost")){
            System.out.println("What should be the new price?");
            double p = scan.nextDouble();
            tt.get(b).setCost(p);
        }if(scan.next().equalsIgnoreCase("transportation")){
            System.out.println("What kind of transportation would you rather go with?");
            String tr = scan.next();
            tt.get(b).setTransportation(tr);
        }if(scan.next().equalsIgnoreCase("Equipment")){
            System.out.println("What is the change of equipment?");
            String e = scan.next();
            tt.get(b).setEquipment(e);
        }if(scan.nextLine().equalsIgnoreCase("Lift card")){
            System.out.println("What is the new lift card #ID?");
            int k = scan.nextInt();
            tt.get(b).setLiftCard(k);
        }else{
            System.out.println("you typed something wrong.");
        }

/*
            }else{
            System.out.println("I think you hit the wrong button.");

        }*/
          return null;

    }
}
