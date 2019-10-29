/*
 * Program: Cake creator class
 * Programmer: Ivoire Morrell
 * Date: 10-15-13
 * Abstract: This program creates cakes that are created and defined in several
 * different classes. User will be able to select the cake they want along with
 * the layers of the cake and the pieces they want it cut in.
 */
package cake_app;

//import scanner class
import java.util.Scanner;

public class Cake_app
{
    public static void main(String[] args)
    {
       //Print out welcome message
        System.out.print("Welcome to cake selector!!! What kind of cake would you like?"
                + "\n");
        
        //Diplay menu
        System.out.println("\t" + "Cake Menu" + "\t");
        System.out.println("________________________");
        System.out.println("1. Cheese Cake" +
                           "2. Chocalte Cake" +
                           "3. Moca Lava Cake" +
                           "4. Ice Creame Cake" +
                           "5. Carrot Cake" +
                           "6. Spice Rum Cake" +
                           "7. Custom Cake" + "\n");
        
        System.out.println("Please select the cake number.");
        
        //Create varibles for layers, pieces, cake number, and boolean
        int cakeLayers;
        int cakePieces;
        int makeCakeSelection;
        boolean ok = true;
        
        //create scanner object
        Scanner sc = new Scanner(System.in);
        
        // use while loop to process the customer orders
        while (ok)
        {
            //get user cake selection
            makeCakeSelection = MyValidation.getIntWithinRange
            (sc, "Please select the cake number.", 1, 7);
            
            System.out.println("");
            
            //Enter the layers
            cakeLayers = MyValidation.getInt(sc, "How many layers do you need");
            
            System.out.println("");
            
            //Enter the pieces that you want in cut in
            cakePieces = MyValidation.getInt(sc, "How many pieces would you like"
            + " your cake to be cut in?");
            
            //use switch statement to process user cake selection
            switch (makeCakeSelection)
            {
             
                case 1:
                    //user selected cheese cake
                    CheeseCake c = new CheeseCake(cakeLayers, cakePieces);
                    //diplay cake
                    c.getCakeResults();
                    System.out.println("");
                    break;
                case 2:
                    //user selected 
                    
            }
        }
        
    }
}
