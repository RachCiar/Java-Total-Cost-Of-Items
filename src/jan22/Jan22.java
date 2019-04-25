/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan22;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author rciarl8967
 */
public class Jan22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Please enter the item name: ");
        String item1 = keyboardInput.nextLine();
        System.out.println("Please enter price for " + item1 + ": ");
        double price1 = keyboardInput.nextDouble();
        keyboardInput.nextLine();

        System.out.println("Please enter the item name: ");
        String item2 = keyboardInput.nextLine();
        System.out.println("Please enter price for " + item2 + ": ");
        double price2 = keyboardInput.nextDouble();
        keyboardInput.nextLine();

        System.out.println("Please enter the item name: ");
        String item3 = keyboardInput.nextLine();
        System.out.println("Please enter price for " + item3 + ": ");
        double price3 = keyboardInput.nextDouble();
        keyboardInput.nextLine();

        System.out.println("Please enter the item name: ");
        String item4 = keyboardInput.nextLine();
        System.out.println("Please enter price for " + item4 + ": ");
        double price4 = keyboardInput.nextDouble();
        keyboardInput.nextLine();

        System.out.println("Item            |  Price   ");
        System.out.println("________________|__________");
        System.out.println(item1 + "\t\t|" + price1);
        System.out.println(item2 + "\t\t|" + price2);
        System.out.println(item3 + "\t\t|" + price3);
        System.out.println(item4 + "\t\t|" + price4);
        System.out.println("_______________|___________");

        double subTotal = price1 + price2 + price3 + price4;
        System.out.println("Subtotal: " + subTotal);

        double taxAmount = subTotal * 0.06;

        System.out.println("Total: " + (subTotal + taxAmount));

    }

}
