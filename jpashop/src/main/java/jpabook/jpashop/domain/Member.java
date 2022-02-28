package jpabook.jpashop.domain;

import org.apache.tomcat.jni.Address;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.criteria.Order;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Member {
    @Id @GeneratedValue
    private Long id;
    private String  name;
    private Address address;
    private List<Order> orders = new ArrayList<>();
}
