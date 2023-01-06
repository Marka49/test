package com.company;


import java.util.Scanner;

public class Start {
    private boolean running = true;
    private Scanner sc = new Scanner(System.in);
    public Map myMap = new Map();

    public Start() throws WrongDirectionException {
        myMap.putPlayer();

        while (running) {
            myMap.movePlayerTo(selectDirection());
            myMap.showMap();
        }
    }

    private void showOptions() {
        System.out.println("Options: ");
        for (Direction value : Direction.values()) {
            System.out.println(value);
        }
    }

    private Direction selectDirection() {
        showOptions();
        String input = userInput();
        for (Direction value : Direction.values()) {
            if(input.equalsIgnoreCase(value.toString())){
                return value;
            }
        }
        return null;
    }

    private String userInput() {
        System.out.println("Enter direction: ");
        return sc.nextLine();
    }

}
