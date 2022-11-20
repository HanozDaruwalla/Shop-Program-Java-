
package shop;

import java.util.Scanner;
 
public class Shop {

    public static void Layout_Manager (String temp){
        
        System.out.println(temp);
        
    }
    
    public static String Text(String product_name, int product_qty){
        
        System.out.println("\nHow many " + product_name + "'s" + " do you want to buy?" );
        System.out.println("\nyou have " + product_qty + " already \n");
        
        return("");
    }
    
    public static double Buying_Product(int product_qty, double product_total, double product_price, String product_name){
        
        product_total = product_price * product_qty;
        System.out.println("\n" + product_qty + "x " + product_name + " = £" + String.format("%.2f", product_total) + "\n");
        return(product_total);
    }
        
        
    

    public static void main(String[] args) {
        
        String Barrier = "\n-------------------------------------------------------------------------------------------------------------\n";
        String Gap = "\n\n\n\n\n\n";
        String Short_Gap = "\n";
        
        
        
        //variables for each product 
        int product1_qty = 0;
        String product1_name = "Uno";
        double product1_price = 8.99;
        double product1_total = 0.0;
        
        int product2_qty = 0;
        String product2_name = "Monopoly";
        double product2_price = 19.99;
        double product2_total = 0.0;
        
        int product3_qty = 0;
        String product3_name = "Cludo";
        double product3_price = 15.00;
        double product3_total = 0.0;
        
        String product4_name = "Jenga";
        double product4_price = 10.50;
        int product4_qty = 0;
        double product4_total = 0.0;
        
        //extra variables used
        int chosen_product_num = 0;
        double GRAND_TOTAL = 0.0f;
        
        //About Program
        Layout_Manager(Barrier);
        System.out.println("This program was created by Hanoz Daruwalla 21483405\n");
        Layout_Manager(Gap);
        System.out.println("   Welcome To The Store");
        System.out.println("--------------------------\n");
        System.out.println("Press -1 to stop buying products and get the total. Otherwise, click 1 to continue \n");
        
        
        //Creating Scanner Object
        Scanner user_input = new Scanner(System.in);
        int input = user_input.nextInt();
        
        while(input != -1){
            //tells the user about the products (name ans price for each)
            System.out.println("\nProduct 1: " + product1_name + " £" + String.format("%.2f", product1_price) + "\n");
            System.out.println("Product 2: " + product2_name + " £" + String.format("%.2f", product2_price) + "\n");
            System.out.println("Product 3: " + product3_name + " £" + String.format("%.2f", product3_price) + "\n");
            System.out.println("Product 4: " + product4_name + " £" + String.format("%.2f", product4_price) + "\n");
            System.out.println("Please enter the product number of the product you want to buy\n");
            
            int product_num = user_input.nextInt();

            switch(product_num){//used to ask the user how many of each product they want
                
                case -1://ends loop
                    input = -1;    
                    break;

                case 1://asks how many of product user wants to buy/ how many you already have
                       //calculates new qty based on old qty + one just entered and calculates price
                       //outputs to the user.
                    chosen_product_num = 1;
                    Text(product1_name,product1_qty);//ask user how many they want
                    Layout_Manager(Short_Gap);//spaces
                    product1_qty = user_input.nextInt() + product1_qty;//take input
                    product1_total = Buying_Product(product1_qty, product1_total,  product1_price, product1_name);//calculations
                    
                    
                    
                    
                    break;

                case 2:
                    chosen_product_num = 2;
                    Text(product2_name,product2_qty);//ask user how many they want
                    Layout_Manager(Short_Gap);//spaces
                    product2_qty = user_input.nextInt() + product2_qty;//take input
                    product2_total = Buying_Product(product2_qty, product2_total,  product2_price, product2_name);//calculations
                    break;
                    
                case 3:
                    chosen_product_num = 3;
                    Text(product3_name,product3_qty);//ask user how many they want
                    Layout_Manager(Short_Gap);//spaces
                    product3_qty = user_input.nextInt() + product3_qty;//take input
                    product3_total = Buying_Product(product3_qty, product3_total,  product3_price, product3_name);//calculations
                    break;
                    
                case 4:
                    chosen_product_num = 4;
                    Text(product4_name,product4_qty);//ask user how many they want
                    Layout_Manager(Short_Gap);//spaces
                    product4_qty = user_input.nextInt() + product4_qty;//take input
                    product4_total = Buying_Product(product4_qty, product4_total,  product4_price, product4_name);//calculations
                    break;
                    
                    
                default://if product number not recognised then this runs
                    System.out.println("\n!!! Incorrect product number added !!!\n");
                    System.out.println("Please enter the product number of the product you want to buy\n");
          
            
            }//end of switch
            Layout_Manager(Barrier);
            Layout_Manager(Gap);
            System.out.println("Press -1 to stop buying products and get the total. Otherwise, click 1 to continue \n");

        }//end of while loop
        System.out.println("you have exited the Shop\n\n");
        
        System.out.println("   The Products you have ordered are...");//outputs amount for each product then total
        System.out.println("------------------------------------------");
        System.out.println("\n"+ product1_name + " x" + product1_qty + " = £" + String.format("%.2f", product1_total));
        System.out.println("\n"+ product2_name + " x" + product2_qty + " = £" + String.format("%.2f", product2_total));   
        System.out.println("\n"+ product3_name + " x" + product3_qty + " = £" + String.format("%.2f", product3_total));   
        System.out.println("\n"+ product4_name + " x" + product4_qty + " = £" + String.format("%.2f", product4_total)); 
        
        GRAND_TOTAL = product1_total + product2_total + product3_total + product4_total;
        
        //total changed to string format and outputted to 2 decimal place
        System.out.println("\nThe total price for all the products ordered is £" + String.format("%.2f", GRAND_TOTAL)+ "\n" );
        
        
        
    }//main method
}//class

