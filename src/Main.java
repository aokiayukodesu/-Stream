import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> onigiriList = List.of("ツナマヨ", "たらこ", "おかか", "鮭", "いくら", "うめ");
        onigiriList.stream().sorted().forEach(onigiri -> System.out.println(onigiri));
    }
}
