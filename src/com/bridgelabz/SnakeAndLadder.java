package com.bridgelabz;
public class SnakeAndLadder {
    static int player1=0;
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and ladder program");
        System.out.println("player 1 starts from position:" +player1);

        int dice=(int)(Math.random()*6);
        if(dice==1){
            System.out.println("Dice value is: 1");
        }else if(dice==2){
            System.out.println("Dice value is: 2");
        }else if(dice==3){
            System.out.println("Dice value is: 3");
        }else if(dice==4){
            System.out.println("Dice value is: 4");
        } else if(dice==5){
        System.out.println("Dice value is: 5");
        }else {
            System.out.println("Dice Value is: 6");
        }
    }
}
