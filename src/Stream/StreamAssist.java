package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAssist {
    public static void main(String[] args){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Song",45));
        customers.add(new Customer("Kim",33));
        customers.add(new Customer("Park",21));
        customers.add(new Customer("Lee",67));
        customers.add(new Customer("Choi",19));

        // 스트림 사용 O
        List<String> customersNames = customers.stream()
                .filter(customer -> customer.getAge() > 30)
                .map(Customer::getName)
                .sorted()
                .collect(Collectors.toList());

        for(String reuslt : customersNames){
            System.out.println(reuslt);
        }


        // 스트림 사용 X
        List<Customer> list = new ArrayList<>();
        for(Customer customer : customers){
            if(customer.getAge() > 30){
                list.add(customer);
            }
        } // age 30 > 추출

        List<String> results = new ArrayList<>();
        for(Customer customer : list){
            results.add(customer.getName());
        } // 이름만 추출

        for(String name : results){
            System.out.println(name);
        } // age > 30 + 이름만 추출

    }
}
