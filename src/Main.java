import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("my","book", "is", "my", "book", "forever"));
        ServiceImpl serviceImpl = new ServiceImpl();
        serviceImpl.printOnlyOdd(nums);
        System.out.println();
        serviceImpl.printOnlyEvenWithoutDoubles(nums);
        System.out.println();
        serviceImpl.printOnlyUniqueWords(words);
        serviceImpl.printNumberOfRepetitions(words);
    }
}