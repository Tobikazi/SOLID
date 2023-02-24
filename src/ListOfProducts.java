import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class ListOfProducts implements IntOfProducts {
    static final Map<String, Integer> products = Map.ofEntries(
            entry("Хлеб", 56),
            entry("Масло", 153),
            entry("Колбаса", 211),
            entry("Пирожок", 45)
    );

    @Override
    public HashMap<String, Integer> getProducts() {
        return new HashMap<>(products);
    }

}
