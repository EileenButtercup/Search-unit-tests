public class Main {
    public static void main(String[] args) {
        String string = "Послушайте!\n" +
                "Ведь, если звёзды зажигают —\n" +
                "Значит — это кому-нибудь нужно?\n" +
                "Значит — это необходимо,\n" +
                "Чтобы каждый вечер\n" +
                "Над крышами\n" +
                "Загоралась хоть одна звезда?!\n" +
                "Стихотворение Владимира Маяковского, " +
                "изданное в 1914 году в «Первом журнале русских футуристов» (№ 1-2).";

        Search search = new Search();

        System.out.println("Количество цифр в строке : " + search.countDigits(string));
        System.out.println("Количество букв в строке : " + search.countLetters(string));
        System.out.println("Количество пробелов в строке : " + search.countSpaces(string));
    }
}
