import java.util.*;

public class goingShopping {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Cost Items at the Grocery Store
        System.out.println("ITEMS AVAILABLE:");
        System.out.println("Today's Special! Buy 4 packs of Crackers Get a 10% Discount!");
        System.out.print("");
        System.out.print("");
        System.out.println("Rice..........$9.00");
        System.out.println("Flour.........$8.00");
        System.out.println("Bread.........$6.00");
        System.out.println("Beer..........$4.00");
        System.out.println("Soda.........$4.00");
        System.out.println("Snacks........$2.00");
        System.out.println("Milk........$5.00");
        System.out.println("Crackers........$4.00");
        System.out.println("Candy.........$1.50");
        System.out.println("Spices.........$2.50");
        //System.out.println("Additional Items.........$5.00");
        System.out.println("");

        double charge = 0.10; //10% charge on items over 10.

        System.out.println("Welcome Shopper! Please enter the items you wish to purchase: ");
        System.out.println("");

        //Processing
        System.out.print("What item(s) do you want? ");
        String item1 = input.nextLine();
        System.out.println(item1);
        System.out.print("How much " + item1 + " do you want?: ");
        int quantity1 = input.nextInt();
        System.out.println("");

        System.out.print("What else do you want? ");
        String item2 = input.nextInt();
        System.out.println(item2);
        System.out.print("How much " + item2 + " do you want?: ");
        int quantity2 = input.nextInt();
        System.out.println("");

        System.out.print("What else do you want? ");
        String item3 = input.nextLine();
        System.out.println(item3);
        System.out.print("How much " + item3 + " do you want?: ");
        int quantity3 = input.nextInt();
        System.out.println("");

        System.out.print("What else do you want? ");
        String item4 = input.nextLine();
        System.out.println(item4);
        System.out.print("How much " + item4 + " do you want?: ");
        int quantity4 = input.nextInt();
        System.out.println("");

        System.out.print("What else do you want? ");
        String item5 = input.nextLine();
        System.out.println(item5);
        System.out.print("How much " + item5 + " do you want?: ");
        int quantity5 = input.nextInt();
        System.out.println("");

        System.out.print("What else do you want? ");
        String item6 = input.nextLine();
        System.out.println(item6);
        System.out.print("How much " + item6 + " do you want?: ");
        int quantity6 = input.nextInt();
        System.out.println("");

        System.out.print("What else do you want? ");
        String item7 = input.nextLine();
        System.out.println(item7);
        System.out.print("How much " + item7 + " do you want?: ");
        int quantity7 = input.nextInt();
        System.out.println("");

        System.out.print("What else do you want? ");
        String item8 = input.nextLine();
        System.out.println(item8);
        System.out.print("How much " + item8 + " do you want?: ");
        int quantity8 = input.nextInt();
        System.out.println("");

        System.out.print("What else do you want? ");
        String item9 = input.nextLine();
        System.out.println(item9);
        System.out.print("How much " + item9 + " do you want?: ");
        int quantity9 = input.nextInt();
        System.out.println("");

        System.out.print("What else do you want? ");
        String item10 = input.nextLine();
        System.out.println(item10);
        System.out.print("How much " + item10 + " do you want?: ");
        int quantity10 = input.nextInt();
        
        //The items need to be calculated for if statements to work.
        

        //Implement conditional statements to give user optional choices for items chosen.
        //Outptut
        if (item1.equals("Rice")) {
            double total1 = 9.00 * quantity1;
            System.out.println("Rice..........$" + total1);

        } else if (item2.equals("Flour")) {
            double total2 = 8.00 * quantity2;
            System.out.println("Flour.........$" + total2);  

        } else if (item3.equals("Bread")) {
            double total3 = 6.00 * quantity3;
            System.out.println("Bread.........$" + total3); 

        } else if (item4.equals("Beer")) {
            double total4 = 4.00 * quantity4;
            System.out.println("Beer..........$" + total4);
           

        } else if (item5.equals("Soda")) {
            double total5 = 4.00 * quantity5;
            System.out.println("Soda.........$" + total5); 
           
        } else if (item6.equals("Snacks")) {
            double total6 = 2.00 * quantity6;
            System.out.println("Snacks........$" + total6); 
           

        } else if (item7.equals("Milk")) {
            double total7 = 5.00 * quantity7;
            System.out.println("Milk........$" + total7);
           

        } else if (item8.equals("Crackers")) {
            double total8 = 4.00 * quantity8;
            System.out.println("Crackers........$" + total8);
        }  else if (quantity8 >= 4) {
            double total8_1 = ((4.00 * 0.10) - 4.00) * quantity8;
            System.out.println("Crackers........$" + total8_1);

        }else if(item9.equals("Chocolate")) {
            double total9 = 1.50 * quantity9;
            System.out.println("Candy.........$" + total9);  
        } else if (item9.equals("Candy")) {
            double total9_1 = 1.50 * quantity9;
            System.out.println("Candy.........$" + total9_1);

        } else if (item10.equals("Spices")) {
            double total10 = 2.50 * quantity10;
            System.out.println("Spices.........$" + total10);

        } else {
            System.out.println("Enter what your see on the list.");
        }
        System.out.println("Thank you for Shopping. Please come again!");        
        System.out.println("");
        System.out.println("");
        System.out.println("Copyright 2018 HANEYCO. Software");
        //This grocery shopping program software written by Michael J. Dehaney.
        //I've written this program to test an see the possibilty of using conditional statements and scanner method.
    }
}