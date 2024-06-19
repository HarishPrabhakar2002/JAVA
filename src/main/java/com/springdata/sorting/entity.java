package com.springdata.sorting;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@AllArgsConstructor
@Table(name = "uber")
    public class entity {
    @Id
    @GeneratedValue
        private Long id;
        private String name;
        private Long price;

        private Long km;

    public entity(String name, Long price, Long km) {
        this.name = name;
        this.price = price;
        this.km = km;
    }
}


