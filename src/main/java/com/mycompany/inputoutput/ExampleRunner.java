package com.mycompany.inputoutput;

import java.io.PrintStream;
import java.util.Scanner;

public class ExampleRunner {
    private Scanner input;
    private PrintStream output;
    ExampleRunner(Scanner input, PrintStream output) {
        this.input = input;
        this.output = output;
    }

    private String getMessage(String command) {
        String SECOND_MODE = "#2";
        String FIRST_MODE_RESULT = "Hello";
        String SECOND_MODE_RESULT = "Hai";

        if(command.equals(SECOND_MODE)) {
            return SECOND_MODE_RESULT;
        }
        return FIRST_MODE_RESULT;
    }

    void execute() {
        this.output.println("Please input your command: ");
        String command = this.input.nextLine();
        String message = getMessage(command);
        this.output.println(message);
        this.output.println("Good job");
        String followCommand = this.input.nextLine();
        this.output.println(followCommand);
    }
}
