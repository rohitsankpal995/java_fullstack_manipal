package StreamApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class ListFind {
    public void giveFilteredList(){

            List<String> inputList = Arrays.asList("abc", "xyz", "pqb", "wet", "qza", "opm", "nert", "bbc");

            List<String> outputList = inputList.stream()
                    .filter(str -> str.contains("a") || str.contains("b"))
                    .toList();

            System.out.println("Input list: " + inputList);
            System.out.println("Output list: " + outputList);
    }

}
