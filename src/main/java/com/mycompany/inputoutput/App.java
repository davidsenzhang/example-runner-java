package com.mycompany.inputoutput;

import java.io.PrintStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final PrintStream printStream = System.out;

        ExampleRunner runner = new ExampleRunner(scanner, printStream);

        runner.execute();
    }
}
