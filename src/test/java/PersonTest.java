import mockit.Mock;
import mockit.MockUp;
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
     
     @Test
    public void testParametrizedConstructor(){
         new MockUp<Person>(){
             @Mock
             public void $init(String name){//dont missout the string parameter in the init method
             
             }
         };
         Person person = new Person("ayush");
         Assert.assertNull(person.getName());
     }
}
