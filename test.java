class a {
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age = age;
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
    }

    
}