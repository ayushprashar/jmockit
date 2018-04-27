import mockit.Expectations;
import mockit.Mocked;
import org.junit.Assert;
import org.junit.Test;

public class DepartmentTest {
    
    @Mocked
    Person person;
    
    
    @Test
    public void testGetPersonName(){
        Department dept = new Department();
        
        new Expectations(){
            {
                person.getName();
                returns("ayush");
            }
        };
        String name = dept.getPersonName();
        Assert.assertEquals("ayush",name);
    }
}
