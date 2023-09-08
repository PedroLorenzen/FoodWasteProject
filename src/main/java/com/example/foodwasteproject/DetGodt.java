package com.example.foodwasteproject;

public class DetGodt
{
        public static void main(String[] args) {
            String[] data = new String[100];
            int antalRader = 0;

            Scanner in = new Scanner(System.in);
            System.out.print("Välj ett alternativ (1 för att lägga till data, 2 för att visa data): ");
            int val = in.nextInt();

            if (val == 1) {
                System.out.print("Ange ny data: ");
                String nyData = in.nextLine();
                data[antalRader] = nyData;
                antalRader++;
                System.out.println("Data har lagts till.");
            } else if (val == 2) {
                System.out.println("Data:");
                for (int i = 0; i < antalRader; i++) {
                    System.out.println(data[i]);
                }
            } else {
                System.out.println("Ogiltigt alternativ.");
            }
        }
    }

}
