package eng.plasticc66;

import java.util.*;

public class Dictionary {
    Map<String, String> dictionary = new HashMap<>();


    public Dictionary(Map<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    public void startSession() {
        double attempts = 0;
        double rightAnswers = 0;
        Map<String, String> dictionaryTemp = new HashMap<>();
        dictionaryTemp.putAll(dictionary);
        System.out.println("\nStart lesson!\nWrite translation:\n");

        while (!dictionaryTemp.isEmpty()) {
            String wordEng = getRandomWord(dictionaryTemp);
            if (dictionaryTemp.containsKey(wordEng)) {
                System.out.print(wordEng + ": ");
                attempts++;
                if (checkAnswer(wordEng)) {
                    rightAnswers++;
                    dictionaryTemp.remove(wordEng);
                    System.out.println("✅\n");
                } else {
                    System.out.println("❌\n");
                }
            }
        }

        System.out.println("Great!");
        int accuracy = (int) Math.round(rightAnswers / attempts * 100);
        System.out.println("Accuracy " + accuracy + "%");
    }

    private String getRandomWord(Map<String, String> dictionary) {
        String[] wordsEng = new String[dictionary.size()];
        int i = 0;
        for (String wordEng : dictionary.keySet()) {
            wordsEng[i] = wordEng;
            i++;
        }

        Random random = new Random();
        return wordsEng[random.nextInt(wordsEng.length)];
    }

    private String acceptAnswer() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private boolean checkAnswer(String wordEng) {
        return acceptAnswer().equals(dictionary.get(wordEng));
    }
}
