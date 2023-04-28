package pl.codecool.lambda_stream.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionExample {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.stream()
                .collect(Collectors.toSet());

        users.stream()
                .collect(Collectors.toCollection(TreeSet::new));

        Comparator<User> userComparator = null;

        users.stream()
                .collect(Collectors.toCollection(() -> new TreeSet<>(userComparator)));

        users.add(new User(1, "admin1", "admin1", 34));
        users.add(new User(2, "admin2", "admin2", 24));
        users.add(new User(3, "admin3", "admin3", 14));
        users.add(new User(3, "admin31", "admin31", 18));

        Map<Long, User> userMap = users.stream()
                .collect(Collectors.toMap(
                        User::getId,
                        Function.identity(),
                        (actual, newValue) -> newValue,
                        LinkedHashMap::new));

        Map<Long, List<User>> allUsersMap = users.stream()
                        .collect(Collectors.toMap(
                                User::getId,
                                Collections::singletonList,
                                (a, b) -> {
                                    List<User> newValue = new ArrayList<>(a);
                                    newValue.addAll(b);
                                    return newValue;
                                }
                        ));

        System.out.println(allUsersMap);

        Map<Long , List<User>> allUsersGrouping = users.stream()
                .collect(Collectors.groupingBy(User::getId));

        System.out.println("-----------------");
        System.out.println(allUsersGrouping);

        Stream<Locale> locales = Stream.of(Locale.getAvailableLocales());
        locales.forEach(l -> System.out.println(l.getDisplayCountry() + " -> " + "Original: " + l.getDisplayLanguage(l)));
    }

}
