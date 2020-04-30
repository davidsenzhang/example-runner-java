package com.mycompany.inputoutput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;

import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.atLeastOnce;

class ExampleRunnerTest {
    private PrintStream printStream;
    private ArgumentCaptor<String> argument;

    @BeforeEach
    void setup() {
        printStream = Mockito.mock(PrintStream.class);
        argument = ArgumentCaptor.forClass(String.class);
    }

    @Test
    void execute_shouldDoPrintHello_whenInputIsHashtag1() {
        Scanner scanner = new Scanner("#1\nAlice follows Bob");
        final ExampleRunner runner = new ExampleRunner(scanner, printStream);

        runner.execute();

        verify(printStream, atLeastOnce()).println(argument.capture());
        final List<String> printResultList = argument.getAllValues();

        assertEquals("Please input your command: ", printResultList.get(0));
        assertEquals("Hello", printResultList.get(1));
        assertEquals("Good job", printResultList.get(2));
        assertEquals("Alice follows Bob", printResultList.get(3));
    }

    @Test
    void execute_shouldDoPrintHai_whenInputIsHashtag2() {
        Scanner scanner = new Scanner("#2");
        final ExampleRunner runner = new ExampleRunner(scanner, printStream);

        runner.execute();

        verify(printStream, atLeastOnce()).println(argument.capture());
        final List<String> printResultList = argument.getAllValues();

        assertEquals("Please input your command: ", printResultList.get(0));
        assertEquals("Hai", printResultList.get(1));
    }
}
