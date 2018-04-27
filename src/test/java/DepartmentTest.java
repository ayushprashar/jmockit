import mockit.Expectations;
import mockit.MockUp;
import mockit.Mocked;
import mockit.Verifications;
import org.junit.Assert;
import org.junit.Test;

public class DepartmentTest {
    
    @Mocked
    Person person;
    
    
    @Test
    public void testExpectationGetPersonName(){
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
    
    @Test
    public void testVerifyGetPersonName(){
        Department department = new Department();
        String name = department.getPersonName();
        new Verifications(){
            {
                person.getName();
            }
        };
    }
    
    @Test
    public void testMockUpGetDeptName(){
        Department department = new Department();
        new MockUp<Department>(){
            public String getPersonName(){
                return null;
            }
        };
        Assert.assertNull(department.getPersonName());
    }
}
