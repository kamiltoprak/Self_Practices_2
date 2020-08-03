package JetBrains.IfStatements;

import java.util.Scanner;

public class HousePrice {
    public static void main(String[] args) {


        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        //WRITE YOUR CODE HERE
        double bedroomsPrice=0;
        double backyardPrice=0;
        double spotsPrice=0;
        double highwayPrice=0;
        double schoolScorePrice=0;
        double smokingPrice=0;
        double metroPrice=0;
        double housePrice=0;

        System.out.println("Enter your property type");
        houseType = scan.next();

        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms = scan.nextInt();
        bedroomsPrice = numberOfBedrooms * 30000;

        System.out.println("Do you have a backyard?");
        backyard = scan.nextBoolean();
        backyardPrice = 5000;
        if (houseType.equalsIgnoreCase("condo")) {
            System.out.println("Backyard is not available for condo!");
            backyard = false;
            backyardPrice = 0;
        }

        System.out.println("Do you have garage?");
        garage = scan.nextBoolean();

        if (garage) {
            System.out.println("How many spots?");
            garageSpots = scan.nextInt();
            spotsPrice = garageSpots * 20000;
            if (garageSpots > 10) {
                System.out.println("Pardon, it's not a public parking!");
                garageSpots = 10;
                spotsPrice = garageSpots * 20000;
            }
        }

        System.out.println("How close is metro station?");
        metroAccessibility = scan.nextInt();
        if (metroAccessibility < 1) {
            metroPrice = 10000;
        } else if (metroAccessibility >= 1 && metroAccessibility <= 3) {
            metroPrice = 5000;
        } else {
            metroPrice = 0;
        }


        System.out.println("How close is highway?");
        highwayAccessibility = scan.nextInt();
        if (highwayAccessibility < 1) {
            highwayPrice = 15000;
        } else if (highwayAccessibility >= 1 && highwayAccessibility <= 5) {
            highwayPrice = 8000;
        } else if (highwayAccessibility > 5 && highwayAccessibility <= 20) {
            highwayPrice = 4000;
        } else {
            highwayPrice = 0;
        }


        System.out.println("What's the rating of nearest school?");
        schoolScore = scan.nextInt();
        if (schoolScore <= 10 && schoolScore > 8) {
            schoolScorePrice = 45000;
        } else if (schoolScore <= 8 && schoolScore > 4) {
            schoolScorePrice = 20000;
        } else {
            schoolScorePrice = 5000;
        }


        System.out.println("Does any of your family members smoking?");
        smoking = scan.nextBoolean();
        if (smoking) {
            smokingPrice = -5000;
        } else {
            smokingPrice = 0;
        }

        switch (houseType) {
            case "Condo":
                housePrice = 50000 + bedroomsPrice + backyardPrice + spotsPrice + highwayPrice + schoolScorePrice + smokingPrice + metroPrice + highwayPrice;
                break;
                case "Townhouse":
                    housePrice = 75000 + bedroomsPrice + backyardPrice + spotsPrice + highwayPrice + schoolScorePrice + smokingPrice + metroPrice + highwayPrice;
                break;
                case "Single Family Home":
                housePrice = 95000 + bedroomsPrice + backyardPrice + spotsPrice + highwayPrice + schoolScorePrice + smokingPrice + metroPrice + highwayPrice;
                break;

        }
        propertyPrice=(int)housePrice;
        System.out.println(propertyPrice);

    }
}

