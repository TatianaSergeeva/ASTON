package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PuttingIntoPractice {

    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        List<Trader> traders = new ArrayList<>();
        traders.add(raoul);
        traders.add(mario);
        traders.add(alan);
        traders.add(brian);


        findTransactionsOfYear(transactions, 2011);

        findUnicCity(traders);

        findCityAndSortByName(traders, "Cambridge");

        sortTradersByName(traders);

        findTraderFromCity(traders, "Milan");

        sumOfCityTransactions(transactions, "Cambridge");

        findMaxSumTransaction(transactions);

        findMinSumTransaction(transactions);




    }

    public static void findTransactionsOfYear(List<Transaction> transactions, int year) {
        List<Transaction> list1 = transactions.stream()
                .filter(p -> p.getYear() == year)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(list1);
    }

    public static void findUnicCity(List<Trader> traders) {
        traders.stream()
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);
    }

    public static void findCityAndSortByName(List<Trader> traders, String city) {
        traders.stream().filter(p -> p.getCity().equals(city))
                .sorted().collect(Collectors.groupingBy(Trader::getCity)).entrySet().forEach(System.out::println);
    }

    public static void sortTradersByName(List<Trader> traders) {
        traders.stream().map(Trader::getName).sorted().forEach(System.out::println);
    }

    public static void findTraderFromCity(List<Trader> traders, String city) {
        traders.stream().filter(p -> p.getCity().equals(city)).forEach(System.out::println);
    }

    public static void sumOfCityTransactions(List<Transaction> transactions, String city) {
        Integer sum = transactions.stream()
                .filter(p -> p.getTrader().getCity().equals(city))
                .map(Transaction::getValue)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }

    public static void findMaxSumTransaction(List<Transaction> transactions) {
        Integer max = transactions.stream()
                .map(Transaction::getValue)
                .max(Comparator.naturalOrder()).get();
        System.out.println(max);
    }

    public static void findMinSumTransaction(List<Transaction> transactions) {
        Integer min = transactions.stream()
                .map(Transaction::getValue)//получаем значения транзакций
                .min(Comparator.naturalOrder()).get();
        System.out.println(min);
    }
}

