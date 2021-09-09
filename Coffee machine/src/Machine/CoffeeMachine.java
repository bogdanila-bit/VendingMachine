package Machine;

import java.util.Scanner;

public class CoffeeMachine {

    private static int mlOfWater = 400, mlOfMilk = 540, gOfCoffee = 120, numberOfCups = 9, money = 550;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showStock();
        command(actionRequired());
        showStock();
    }
    private static void showStock() {
        System.out.println("The coffee machine has:\n" +
                mlOfWater + " ml of water\n" +
                mlOfMilk + " ml of milk\n" +
                gOfCoffee + " g of coffee beans\n" +
                numberOfCups + " disposable cups\n" +
                "$" + money + " of money");
    }
    private static String actionRequired(){
        System.out.println("Write action (buy, fill, take):");
        return scanner.nextLine();
    }
    private static void command(String action){
        if (action.equals("buy"))
            actionBuy();
        else
        if (action.equals("fill"))
            actionFill();
        else
        if (action.equals("take"))
            actionTake();
    }
    private static void actionBuy(){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        int action = scanner.nextInt();
        if(action == 1){
            mlOfWater -= 250;
            gOfCoffee -= 16;
            numberOfCups--;
            money += 4;
        }
        if(action == 2){
            mlOfWater -= 350;
            mlOfMilk -= 75;
            gOfCoffee -= 20;
            numberOfCups--;
            money += 7;
        }
        if(action == 3){
            mlOfWater -= 200;
            mlOfMilk -= 100;
            gOfCoffee -= 12;
            numberOfCups--;
            money += 6;
        }
    }
    private static void actionFill(){
        System.out.println("Write how many ml of water you want to add:");
        mlOfWater += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        mlOfMilk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        gOfCoffee += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        numberOfCups += scanner.nextInt();
    }
    private static void actionTake(){
        System.out.println("I gave you $" + money);
        money = 0;
    }
}
