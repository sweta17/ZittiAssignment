# ZittiBot

ZittiBot is a simple command-line chatbot written in Java. It is capable of responding to a few instructions and questions. It can clean the room, handle your shopping list and answer a few questions. The Robot works based on the instruction/question issued to it.

## Features

- Responds to greetings and questions.
- Provides random weather updates.
- Can clean the room and fetch the newspaper.
- Manages a shopping list by adding and removing items.
- Responds to "thank you" with random responses like "You're welcome." or "My pleasure."

## Getting Started

Follow the steps below to clone and run the ZittiBot project on your local machine.

### Prerequisites

- Java Development Kit (JDK) installed on your machine. You can download it from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

### Installation

1. ** Unzip the project **

   Open your terminal or command prompt and run the following command to clone the repository:


   Navigate into the project directory:

    ```bash
    cd zittiAssignment
    ```

2. **Compile the Java Program**

   Compile the `ZittiBot.java` file using the following command:

    ```bash
    javac ZittiBot.java
    ```

3. **Run the Program**

   Run the compiled Java program using the following command:

    ```bash
    java ZittiBot
    ```

### Usage

Once the program is running, you can interact with ZittiBot by typing commands. Some example interactions:

- Greeting and questions:
    ```
    You: Hey. How are you?
    ZittiBot: Hello, I am doing great.
    ```

- Asking about the weather:
    ```
    You: How's the weather outside?
    ZittiBot: It's raining outside. Remember to take an umbrella.
    ```

- Cleaning the room:
    ```
    You: Clean my room.
    ZittiBot: Room is cleaned. It looks tidy now. Job completed at <current time>
    ```

- Managing the shopping list:
    ```
    You: Add apple to my shopping list.
    ZittiBot: Apple added to your shopping list.
    
    You: Remove apple from my shopping list.
    ZittiBot: Apple removed from your shopping list.
    
    You: Read my shopping list.
    ZittiBot: Here is your shopping list: <items>
    ```

- Responding to thank you:
    ```
    You: Thank you.
    ZittiBot: You're welcome. (or "My pleasure.")
    ```

To exit the program, type `exit` and press Enter.


