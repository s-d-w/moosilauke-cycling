package com.moosilaukecycling.api.terminal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Terminal {

    private static final String EXIT = "q";

    private BufferedReader bufferedReader;

    public Terminal() {
        this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    // 1. create repair job
    // 2. checkout
    // 3. list inventory
    // 4. add to inventory
    public void run() {
        System.out.println("Enter choice, or '" + EXIT + "' to quit.");

        while (true) {

            System.out.print("> ");
            String input = "";
            try {
                input = bufferedReader.readLine();
            } catch (IOException e) {
                System.err.println("Something went wrong. Quiting.");
                e.printStackTrace();
                break;
            }

            if (EXIT.equals(input.toLowerCase())) {
                System.out.println("Quiting.");
                break;
            }
            switch (input) {
                case "1":
                    createRepairJob();
                    break;
                case "2":
                    checkout();
                    break;
                case "3":
                    listInventory();
                    break;
                case "4":
                    addInventory();
                    break;
                default:
                    System.out.println("Unknown choice. Enter '" + EXIT + "' to quit.");

            }
        }
    }

    //TODO

    private void createRepairJob() {
        System.out.println("Creating repair job.");
    }

    private void checkout() {
        System.out.println("Checking out.");
    }

    private void listInventory() {
        System.out.println("Listing inventory.");
    }

    private void addInventory() {
        System.out.println("Adding inventory.");
    }

    public void close() {
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
