package homework;

import java.util.Stack;

@SuppressWarnings({"java:S1186", "java:S1135", "java:S1172"}) // при выполнении ДЗ эту аннотацию надо удалить
public class CustomerReverseOrder {
    private Stack<Customer> stack_=null;
    // todo: 2. надо реализовать методы этого класса
    // надо подобрать подходящую структуру данных, тогда решение будет в "две строчки"
    public CustomerReverseOrder() {
        stack_= new Stack<Customer>();
    }
    public void add(Customer customer) {
        if(stack_!=null &&  customer!=null) {
            stack_.push(customer);
        }
    }

    public Customer take() {
        if(!stack_.empty())
            return stack_.pop();
        else
            return null;// это "заглушка, чтобы скомилировать"
    }
}
