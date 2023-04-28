package pl.codecool.lambda_stream.collection.exercises.zad1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Zad1 {
    private Stream<Locale> locales = Stream.of(Locale.getAvailableLocales());
    private Map<String, Set<String>> countryLanguageSetsLowCode = new TreeMap<>();
    private Map<String, Set<String>> countryLanguageSets = new TreeMap<>();

    public void createLanguageMap() {
        countryLanguageSetsLowCode = locales.filter(l -> !l.getDisplayCountry().isEmpty())
                .collect(Collectors.groupingBy(Locale::getDisplayCountry,
                                               TreeMap::new,
                                               Collectors.mapping(Locale::getDisplayLanguage,
                                                                  Collectors.toSet())));

        locales = Stream.of(Locale.getAvailableLocales());
        countryLanguageSets = locales.filter(l -> !l.getDisplayCountry().isEmpty())
                .collect(Collectors.toMap(
                        Locale::getDisplayCountry,
                        l -> Collections.singleton(l.getDisplayLanguage()),
                        (a, b) -> {
                            Set<String> union = new HashSet<>(a);
                            union.addAll(b);
                            return union;
                        }
                ));

        countryLanguageSetsLowCode.entrySet().forEach(System.out::println);
        System.out.println(countryLanguageSets.equals(countryLanguageSetsLowCode));
    }
}
