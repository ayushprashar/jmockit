import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
     @Test
    public void testMockupName(){
         
         new MockUp<Person>(){
             @Mock
             public void $init(){}
         };
         Person person = new Person();
         Assert.assertNull(person.getName());
     }
}
