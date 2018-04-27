public class Person {
    
    private String name;
    
    Person(String name){
        this.name = name;
    }
    Person(){
        this.name = "check";
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
