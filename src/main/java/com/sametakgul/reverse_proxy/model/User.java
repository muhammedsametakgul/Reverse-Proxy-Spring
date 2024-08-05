package com.sametakgul.reverse_proxy.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private Long id;

    private String name;

    private String surname;
}
