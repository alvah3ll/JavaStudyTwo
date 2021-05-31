package Lesson3;

import java.io.IOException;
import java.util.*;

public class Task {
    static final String FILE_NAME1 = "C://JAVA/Java2Lesson3Homework3.txt";
    static final String FILE_NAME2 = "Java2Lesson3Homework3.txt";
    public static void main(String[] args) {
        // first homework item
        List<String> wordArray = new ArrayList<String>();
        wordArray = ArrayOperation.fillTheArray(wordArray);
        System.out.println(wordArray + "\n");
        ArrayOperation.printUniqueWords(wordArray);
        wordArray.clear();
        try {
            wordArray = ArrayOperation.fillTheArrayFromFile(wordArray,FILE_NAME1);
        } catch (IOException e) {
            System.out.println("Failed to fill array from file!\n");
        }
        try {
            wordArray = ArrayOperation.fillTheArrayFromFile(wordArray,FILE_NAME2);
        } catch (IOException e) {
            System.out.println("Failed to fill array from file!\n");
        }
        System.out.println(wordArray + "\n");
        ArrayOperation.printUniqueWords(wordArray);
        // second homework item
        Phonebook phonebook = new Phonebook();

        phonebook.add(4567890, "Миронов");
        phonebook.add(3334567, "Хорошева");
        phonebook.add(2345687, "Тимонов");
        phonebook.add(3456278, "Клявлина");
        phonebook.add(1239065, "Дурнов");
        phonebook.add(4532198, "Тимонов");

        phonebook.get("Миронов");
        phonebook.get("Хорошева");
        phonebook.get("Тимонов");
    }
}
