package entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("b")
public class B {
    @Value("B")
    String name;
    @Value("66")
    int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "B{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
