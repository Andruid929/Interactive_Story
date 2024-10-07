package com.story.util;

import com.story.choice.Choice;
import com.story.choice.arrival.One;
import com.story.choice.arrival.Three;
import com.story.choice.arrival.Two;

import java.util.Scanner;

public class Story {

    Scanner scanner = new Scanner(System.in);

    public static String name;
    public static String gender;

    public Story() {
        System.out.println("What shall we name the protagonist?");
        name = scanner.next();
        scanner.nextLine();

        System.out.println("and the gender?");
        gender = scanner.next();
        scanner.nextLine();

        arrival();
    }

    private void arrival() {
        System.out.println("Let's say we just arrived...");

        System.out.println("Choose wisely: One or Two");

        oneOrTwo(scanner.next()).continueStory();
    }

    private Choice oneOrTwo(String choice) {
        return switch (choice.toLowerCase()) {
            case "one" -> new One();
            case "two" -> new Two();
            case "three" -> new Three();
            default -> () -> System.out.println(scanner.next());
        };
    }

}
