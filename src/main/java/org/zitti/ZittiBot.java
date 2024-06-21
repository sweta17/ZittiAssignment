package org.zitti;

import java.util.*;
import java.util.regex.*;

public class ZittiBot {
    private static List<String> shoppingList = new ArrayList<>();
    private static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ZittiBot: Hello! How can I assist you today?");

        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("ZittiBot: Goodbye!");
                break;
            }

            handleInput(input);
        }

        scanner.close();
    }

    private static void handleInput(String input) {
        if (matchesPattern(input, "(?i)\\bhey\\b.*\\bhow\\s*are\\s*you\\b|\\bhey\\b.*\\bhow\\s*you\\b|\\bhow\\s*are\\s*you\\b|\\bhow\\s*you\\b|\\bhow\\s*r\\s*u\\b|\\bhow\\s*are\\s*u\\b")) {
            System.out.println("ZittiBot: Hello, I am doing great.");
        } else if (matchesPattern(input, "(?i)\\bhow's\\s*the\\s*weather\\s*outside\\b|\\bhow\\s*is\\s*the\\s*weather\\s*outside\\b|\\bwhat\\s*is\\s*the\\s*weather\\b")) {
            respondToWeatherQuestion();
        } else if (matchesPattern(input, "(?i)\\bclean\\s*my\\s*room\\b")) {
            System.out.println("ZittiBot: Room is cleaned. It looks tidy now. Job completed at " + new Date());
        } else if (matchesPattern(input, "(?i)\\bfetch\\s*my\\s*newspaper\\b")) {
            System.out.println("ZittiBot: Here you go. Getting today's newspaper");
        } else if (matchesPattern(input, "(?i)\\badd\\s+(\\w+)\\s+.*\\bshopping\\s*(list|bag)\\b")) {
            addItemToShoppingList(input);
        } else if (matchesPattern(input, "(?i)\\bremove\\s+(\\w+)\\s+.*\\bshopping\\s*list\\b")) {
            removeItemFromShoppingList(input);
        } else if (matchesPattern(input, "(?i)\\bread\\s*my\\s*shopping\\s*list\\b")) {
            readShoppingList();
        } else if (matchesPattern(input, "(?i)\\bthank\\s*you\\b")) {
            respondToThankYou();
        } else {
            System.out.println("ZittiBot: Hmm. I don't know that");
        }
    }

    private static boolean matchesPattern(String input, String pattern) {
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(input);
        return matcher.find();
    }

    private static void respondToWeatherQuestion() {
        String[] responses = {
                "It's pleasant outside. You should take a walk.",
                "It's raining outside. Remember to take an umbrella.",
                "It's snowing outside. Feels Christmas-y!"
        };
        int randomIndex = random.nextInt(responses.length);
        System.out.println("ZittiBot: " + responses[randomIndex]);
    }

    private static void addItemToShoppingList(String input) {
        Matcher matcher = Pattern.compile("(?i)\\badd\\s+(\\w+)\\s+.*\\bshopping\\s*(list|bag)\\b").matcher(input);
        if (matcher.find()) {
            String item = matcher.group(1).trim();
            shoppingList.add(item);
            System.out.println("ZittiBot: " + item + " added to your shopping list.");
        } else {
            System.out.println("ZittiBot: Please specify an item to add.");
        }
    }

    private static void removeItemFromShoppingList(String input) {
        Matcher matcher = Pattern.compile("(?i)\\bremove\\s+(\\w+)\\s+.*\\bshopping\\s*list\\b").matcher(input);
        if (matcher.find()) {
            String item = matcher.group(1).trim();
            if (shoppingList.remove(item)) {
                System.out.println("ZittiBot: " + item + " removed from your shopping list.");
            } else {
                System.out.println("ZittiBot: " + item + " is not in your shopping list.");
            }
        } else {
            System.out.println("ZittiBot: Please specify an item to remove.");
        }
    }

    private static void readShoppingList() {
        if (shoppingList.isEmpty()) {
            System.out.println("ZittiBot: Your shopping list is empty.");
        } else {
            System.out.println("ZittiBot: Here is your shopping list:");
            for (String item : shoppingList) {
                System.out.println("- " + item);
            }
        }
    }

    private static void respondToThankYou() {
        String[] responses = {
                "You're welcome.",
                "My pleasure."
        };
        int randomIndex = random.nextInt(responses.length);
        System.out.println("ZittiBot: " + responses[randomIndex]);
    }
}
