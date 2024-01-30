package Stream;

import java.util.ArrayList;
import java.util.List;

public class StreamAssist {
    public static void main(String[] args){
        List<Customer> cutomers = new ArrayList<>();
        cutomers.add(new Customer("Song",45));
        cutomers.add(new Customer("Kim",33));
        cutomers.add(new Customer("Park",21));
        cutomers.add(new Customer("Lee",67));
        cutomers.add(new Customer("Choi",19));


        List<Customer> list = new ArrayList<>();
        for(Customer customer : cutomers){
            if(customer.getAge() > 30){
                list.add(customer);
            }
        } // age 30 > 추출

        List<String> results = new ArrayList<>();
        for(Customer customer : list){
            results.add(customer.getName());
        } // 이름만 추출

    }
}
