package TCSNQTPrepSession;

public class BeanClass {
    private String name;
    private int age;

    public BeanClass() {
    }

    public BeanClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class MessageService {
    public void sendMessage(String msg) {
        System.out.println("Message: " + msg);
    }
}

class ConstructorInjectionExample {
    private MessageService service;

    public ConstructorInjectionExample(MessageService service) {
        this.service = service;
    }

    public void process(String msg) {
        service.sendMessage(msg);
    }
}

class SetterInjectionExample {
    private MessageService service;

    public void setService(MessageService service) {
        this.service = service;
    }

    public void process(String msg) {
        service.sendMessage(msg);
    }
}

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//class FieldInjectionExample {
//    @Autowired
//    private MessageService service;
//
//    public void process(String msg) {
//        service.sendMessage(msg);
//    }
//}
