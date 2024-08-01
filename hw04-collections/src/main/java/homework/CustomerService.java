package homework;

import java.text.Collator;
import java.util.*;

@SuppressWarnings({"java:S1186", "java:S1135", "java:S1172"}) // при выполнении ДЗ эту аннотацию надо удалить
public class CustomerService {
    private TreeMap<Customer, String> map_=null;
    public CustomerService() {
        map_ = new TreeMap<Customer, String>(Comparator.comparingLong(Customer::getScores));
    }
    public Map.Entry<Customer, String> getClone(Map.Entry<Customer, String> src){
        if(src == null) return null;
        String data = src.getValue()!=null ? new String(src.getValue()) : null;
        return Map.entry(new Customer(src.getKey()), data);

    }
    // todo: 3. надо реализовать методы этого класса
    // важно подобрать подходящую Map-у, посмотрите на редко используемые методы, они тут полезны

    public Map.Entry<Customer, String> getSmallest() {
        // Возможно, чтобы реализовать этот метод, потребуется посмотреть как Map.Entry сделан в jdk
        if(map_==null || map_.isEmpty()) return null;

        Customer lower_key  = map_.firstKey();
        while(map_.lowerKey(lower_key)!=null) {
            lower_key  = map_.lowerKey(lower_key);
        }
        Map.Entry<Customer, String> res = map_.ceilingEntry(lower_key);
        return getClone(res);
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        if(map_==null || map_.isEmpty()) return null;
        Map.Entry<Customer, String> res =map_.higherEntry(customer);
        return getClone(res);
    }

    public void add(Customer customer, String data) {
        if (map_==null) return;
        String put = map_.put(customer, data);
    }
}
