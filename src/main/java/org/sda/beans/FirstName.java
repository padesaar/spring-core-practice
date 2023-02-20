package org.sda.beans;

import org.sda.interfaces.BeanName;
import org.springframework.stereotype.Component;

@Component(value = "firstName")
public class FirstName implements BeanName {
    private String name;

    public FirstName() {
        this.name = "Miki";
    }
    @Override
    public String getName() {
        return this.name;
    }
}
