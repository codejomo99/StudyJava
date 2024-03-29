package Stream;

public class Customer implements Comparable<Customer>{
    private String name;
    private int age;

    public Customer(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){ return this.name; }
    public void setName(String name){ this.name = name; }
    public int getAge(){ return this.age; }
    public void setAge(int age){ this.age = age;}

    @Override
    public int compareTo(Customer customer) {
        if(this.age > customer.getAge()){
            return -1;
        }else if(this.age == customer.getAge()){
            return 0;
        }else{
            return -1;
        }
    }
}
