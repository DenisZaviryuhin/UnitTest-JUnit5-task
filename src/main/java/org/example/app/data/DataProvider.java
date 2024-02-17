package org.example.app.data;

import java.util.Scanner;

public class DataProvider {
    public int getTemperature() {
        System.out.print("Enter temperature from -10 to +35: ");
        return new Scanner(System.in).nextInt();
    }
}
