package models.users;



import java.util.*;
import javax.persistence.*;


import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import models.*;
import models.shopping.*;

@Entity
@DiscriminatorValue("customer")
public class Customer extends User {


    @OneToOne(mappedBy="customer", cascade = CascadeType.ALL)
    private Basket basket;
    @OneToMany(mappedBy="customer", cascade = CascadeType.ALL)
    private List<ShopOrder> orders;
	
    public Customer(String email, String password, String fName, String lName) {

        super(email, password, fName, lName);
    }
    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public List<ShopOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<ShopOrder> orders) {
        this.orders = orders;
    }
}