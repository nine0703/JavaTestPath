package WebPro;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {
    static Utils u;
    @BeforeAll
    public static void init(){
        u = new Utils();
    }
    @Test
    void sum() {
        int sum = u.sum(1,2);
        assertEquals(sum, 3);

    }
    @AfterAll
    public static void cleanup(){
        u = null ;
    }
}