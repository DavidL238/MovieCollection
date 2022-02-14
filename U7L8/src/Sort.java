import java.util.ArrayList;

public class Sort
{
    // Part A.  Which Sort is Which?
    public static void selectionSort(int[] elements)
    {
        int runtime = 0;
        for (int j = 0; j < elements.length - 1; j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < elements.length; k++)
            {
                if (elements[k] < elements[minIndex])
                {
                    minIndex = k;
                }
                runtime++;
            }
            int temp = elements[j];
            elements[j] = elements[minIndex];
            elements[minIndex] = temp;
        }
        System.out.println("Runtime: " + runtime);
    }

    public static void insertionSort(int[] elements)
    {
        int runtime = 0;
        for (int j = 1; j < elements.length; j++)
        {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
            {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
                runtime++;
            }
            elements[possibleIndex] = temp;
        }
        System.out.println("Runtime: " + runtime);
    }

    // Part C.  Sorting a 1000-word list!
    public static void selectionSortWordList(ArrayList<String> words)
    {
        int runtime = 0;
        for (int i = 0; i < words.size(); i++) {
            String originalWord = words.get(i);
            String wordAtIdx = originalWord;
            int idx = i;
            for (int p = i+1; p < words.size(); p++) {
                String currentWord = words.get(p);
                if (currentWord.compareTo(wordAtIdx) < 0) {
                    wordAtIdx = currentWord;
                    idx = p;
                }
                runtime++;
            }
            words.set(i, wordAtIdx);
            words.set(idx, originalWord);
        }
        System.out.println(runtime);
    }

    public static void insertionSortWordList(ArrayList<String> words)
    {
        int runtime = 0;
        for (int i = 0; i < words.size(); i++) {
            String originalWord = words.get(i);
            String nextWord = words.get(i+1);
            int idxOf = i;
            while(originalWord.compareTo(nextWord) > 0) {
                int crtIdx = i + 1;
                words.set(idxOf, nextWord);
                words.set(crtIdx, originalWord);

            }
        }
    }
}