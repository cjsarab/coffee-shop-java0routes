package com.codeclan.example.CoffeeTracker.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "coffees")
public class Coffee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "strength")
    private int strength;

    @Column(name = "age")
    private int age;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "coffeeShop_id", nullable = false)
    private CoffeeShop coffeeShop;

    public Coffee(String name, int age,int strength, CoffeeShop coffeeShop) {
        this.name = name;
        this.age = age;
        this.strength = strength;
        this.coffeeShop = coffeeShop;
    }

    public Coffee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public CoffeeShop getCoffeeShop() {
        return coffeeShop;
    }

    public void setCoffeeShop(CoffeeShop coffeeShop) {
        this.coffeeShop = coffeeShop;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

