public class Person {
    private String name;
    private String middleName;
    private String familyName;
    private int age;

    public Person (String name, String middleName, String familyName, int age) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.name = name;
        this.age = age;
    
    }
    
    public void printAge(){
        System.out.println ("Возраст "+ age);

    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }
    
    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName){
        this.familyName = familyName;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

}
