import org.example.Person;
import org.example.Students;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestingClass {
    private Person p1;
    private Students s1;


    @BeforeAll
    public static void init(){
        System.out.println("stsrt before all");
    }

    @Test
    public void testPerson() {
        String name = "Amaal";
        int age = 21;
        String address = "Riyadh";

        String actual = "Name: " + name + ", Age: " + age + ", Address: " + address;
        String expected = "Name: Amaal, Age: 22, Address: Riyadh";
        Assertions.assertEquals(expected, actual);
    }

}
