package com.icet.rapidsale.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;

    @Column(nullable = false)
    private String firstName;

    private String lastName;

    private Integer age;

    @Column(nullable = false,unique = true)
    private Integer contactNo;

    private String address;
    private String remark;

    @Column(nullable = false)
    private Double creditLimit;

    @Column(nullable = false)
    private String customerType;



}
