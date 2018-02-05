package top.kou.customer.model;

import org.hibernate.validator.constraints.NotEmpty;

public class CustomerBo {
    @NotEmpty(message = "Username Cannot Be Empty")
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}