class a {
    private String name;
    private String village;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setVillage(String village){
        this.village = village;
    }
    public String getVillage(){
        return village;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class test{
    public static void main(String[] args) {
        a obj = new a();
        obj.setAge(12);
        System.out.println(obj.getAge());
        obj.setName("hbehuey");
        System.out.println(obj.getName());
        obj.setVillage("kaluthara");
        System.out.println(obj.getVillage());
    }

    
}