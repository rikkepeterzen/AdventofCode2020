import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Day1_1 {

    public static void main(String[] args) throws IOException {

        int[] intArr = Files.lines(Paths.get("C:\\Users\\Rikke\\Dev\\AdventOfCode2020\\src\\main\\java\\day1input.txt"))
                .mapToInt(Integer::parseInt).toArray();

        int result = 0;
        for (int i = 0; i < intArr.length; i++) {
            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[i] + intArr[j] == 2020) {
                    result = intArr[i] * intArr[j];
                }
            }
        }
        System.out.println(result);
    }
}

