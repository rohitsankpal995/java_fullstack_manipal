package com.ani.orm.domain;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "car_info")
public class Car {

    @Id
    private Long id;
    private String name;
    private Double cost;
}
