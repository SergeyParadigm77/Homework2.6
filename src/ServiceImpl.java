import java.util.*;

public class ServiceImpl implements Service{
    @Override
    public void printOnlyOdd(List<Integer> list) {
        for (Integer integer: list) {
            if (integer % 2 == 1) {
                System.out.print(integer + " ");
            }
        }
    }

    @Override
    public void printOnlyEvenWithoutDoubles(List<Integer> list) {
        Collections.sort(list);
        Set<Integer> alreadyPrintedNums = new HashSet<>();
        for (Integer integer : list) {
            if (!alreadyPrintedNums.contains(integer))
                if (integer % 2 == 0) {
                    System.out.print(integer + " ");
                    alreadyPrintedNums.add(integer);
            }
        }
    }

    @Override
    public void printOnlyUniqueWords(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
        }

    @Override
    public void printNumberOfRepetitions(List<String> words) {
        Map<String,Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            }
            else {
                map.put(word, 1);
            }
        }
        for (String key: map.keySet()) {
            System.out.println("Слово " + key + " встречается " + map.get(key) + " раз. ");
        }
    }
}
