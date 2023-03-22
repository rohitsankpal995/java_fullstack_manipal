package com.ani.CodingQuetions;

import java.util.Scanner;
import java.time.Year;
import java.time.LocalDate;

public class YearValidation {
    private Scanner sc = new Scanner(System.in);
    public  void yearValidation() {

        int currentYear = Year.now().getValue();
        int maxYear = currentYear - 23; // Maximum year allowed
        System.out.print("Enter a year between " + maxYear + " and " + currentYear + ": ");

        try {
            int inputYear = sc.nextInt();
            int age = LocalDate.now().getYear() - inputYear;

            if (inputYear > currentYear) { // Year is in future
                throw new IllegalArgumentException("Year cannot be in the future");
            } else if (age > 23) { // Year is more than 23 years old
                throw new IllegalArgumentException("Year should not be older than 23 years");
            } else {
                System.out.println("Year entered: " + inputYear);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
