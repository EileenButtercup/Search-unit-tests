import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SearchTests {
    Search search;

    @BeforeEach
    public void setUp() {
        System.out.println("set up");
        search = new Search();
    }

    @AfterEach
    public void tearDown() {
        System.out.println("tear down");

    }

    @AfterAll
    public static void tearDownAfterClass() throws Exception {
        System.out.println("tear down after class");
    }


    @Test
    public void testCountDigits() {
        String a = "1234";
        int expected = 4;
        int result = search.countDigits(a);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCountLetters() {
        String a = "Количество букв в строке";
        int expected = 21;
        int result = search.countLetters(a);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCountSpaces() {
        String a = "Количество пробелов в строке";
        int expected = 3;
        int result = search.countSpaces(a);
        Assertions.assertEquals(expected, result);
    }


}
