package com.mycompany.inputoutput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.util.Scanner;

import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

class ExampleRunnerTest {
    private PrintStream printStream;

    @BeforeEach
    void setup() {
        printStream = Mockito.mock(PrintStream.class);
    }

    @Test
    void execute_shouldDoPrintHello_whenInputIsHashtag1() {
        Scanner scanner = new Scanner("#1");
        final ExampleRunner runner = new ExampleRunner(scanner, printStream);

        runner.execute();

        verify(printStream).println("Hello");
    }

    @Test
    void execute_shouldDoPrintHai_whenInputIsHashtag2() {
        Scanner scanner = new Scanner("#2");
        final ExampleRunner runner = new ExampleRunner(scanner, printStream);

        runner.execute();

        verify(printStream, Mockito.times(0)).println("Hello");
        verify(printStream).println("Hai");
    }
}
