package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();

        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine();

        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine();

        System.out.print("Billing State: ");
        String billingState = scanner.nextLine();

        System.out.print("Billing Zip: ");
        String billingZip = scanner.nextLine();

        System.out.print("Shipping Street: ");
        String shippingStreet = scanner.nextLine();

        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine();

        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine();

        System.out.print("Shipping Zip: ");
        String shippingZip = scanner.nextLine();

        StringBuilder info = new StringBuilder();
        info.append("Full name: ");
        info.append(fullName);
        info.append("\nBilling Address: ");
        info.append("\n" + billingStreet + " " + billingCity + ", "+ billingState + " " + billingZip);
        info.append("\nShipping Address: ");
        info.append("\n" + shippingStreet + " " + shippingCity + ", " + shippingState + " " + shippingZip);

        String yourInfo = info.toString();
        System.out.println(yourInfo);

    }
}
