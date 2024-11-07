import  java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException ;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to my Zoo Program!");

        // Create the animal name lists using the Utilities method
        String filePath = "animalNames.txt"; // Update with the correct file path
        AnimalNameListsWrapper animalLists = Utilities.createAnimalNameLists(filePath);

        // Access and display the hyena names
        ArrayList<String> listOfHyenaNames = animalLists.getHyenaNameList();
        System.out.println("Hyena Names:");
        for (String hyenaName : listOfHyenaNames) {
            System.out.println(hyenaName);
        }

        // Similarly, display other animal names
        ArrayList<String> listOfLionNames = animalLists.getLionNameList();
        System.out.println("\nLion Names:");
        for (String lionName : listOfLionNames) {
            System.out.println(lionName);
        }

        ArrayList<String> listOfTigerNames = animalLists.getTigerNameList();
        System.out.println("\nTiger Names:");
        for (String tigerName : listOfTigerNames) {
            System.out.println(tigerName);
        }

        ArrayList<String> listOfBearNames = animalLists.getBearNameList();
        System.out.println("\nBear Names:");
        for (String bearName : listOfBearNames) {
            System.out.println(bearName);
        }

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("arrivingAnimals.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                String[] arrayOfStrPartsOnComma = line.split(", ");
                int elementNum = 0;
                for (String thePart : arrayOfStrPartsOnComma) {
                    System.out.println("Element " + elementNum + " of arrayOfStrPartsOnComma is: " + thePart);
                    elementNum++;
                }

                String aniColor = arrayOfStrPartsOnComma[2];
                String aniWeight = arrayOfStrPartsOnComma[3];
                String aniOrigin01 = arrayOfStrPartsOnComma[4];
                String aniOrigin02 = arrayOfStrPartsOnComma[5];
                String aniArrivalDate = Utilities.arrivalDate();

                String[] arrayOfStrPartsOnSpace = arrayOfStrPartsOnComma[0].split(" ");
                elementNum = 0;
                for (String thePart : arrayOfStrPartsOnSpace) {
                    System.out.println("Element " + elementNum + " of arrayOfStrPartsOnSpace is: " + thePart);
                    elementNum++;
                }

                String aniAge = arrayOfStrPartsOnSpace[0];
                int intAniAge = Integer.parseInt(aniAge);
                String aniSex = arrayOfStrPartsOnSpace[3];
                String aniSpecies = arrayOfStrPartsOnSpace[4];

                System.out.println("\n The animal's sex is " + aniSex);
                System.out.println("\n The species is " + aniSpecies);
                System.out.println("\n The color is " + aniColor);
                System.out.println("\n The weight is " + aniWeight);
                System.out.println("\n Origin01 is " + aniOrigin01);
                System.out.println("\n Origin02 is " + aniOrigin02);

                String ageInYears = arrayOfStrPartsOnSpace[0];
                String animalBirthSeason = arrayOfStrPartsOnComma[1].split(" ")[2];
                System.out.println("The age in years of the animal is: " + ageInYears);
                System.out.println("The season of birth of the animal is: " + animalBirthSeason);

                if (aniSpecies.equals("hyena")) {
                    System.out.println("\n The animal is a hyena!");
                    String aniID = Utilities.calcAnimalID;                }
            }
        } catch (IOException e) {
            // Handle exceptions, such as file not found or I/O errors
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
