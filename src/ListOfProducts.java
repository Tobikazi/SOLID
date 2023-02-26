import java.util.Collection;
import java.util.Map;
import java.util.Set;

import static java.util.Map.entry;

public class ListOfProducts implements IntOfProducts {
    static final Map<String, Integer> products = Map.ofEntries(
            entry("Хлеб", 56),
            entry("Масло", 153),
            entry("Колбаса", 211),
            entry("Пирожок", 45)
    );

    @Override
    public Map<String, Integer> getProducts() {
        return new Map<>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public Integer get(Object key) {
                return null;
            }

            @Override
            public Integer put(String key, Integer value) {
                return null;
            }

            @Override
            public Integer remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map<? extends String, ? extends Integer> m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set<String> keySet() {
                return null;
            }

            @Override
            public Collection<Integer> values() {
                return null;
            }

            @Override
            public Set<Entry<String, Integer>> entrySet() {
                return null;
            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }
        };
    }
}
