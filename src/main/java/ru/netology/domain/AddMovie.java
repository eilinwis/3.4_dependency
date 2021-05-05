package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AddMovie {

    private int id;
    private String name;
    private String url;
    private int releaseDate;
    private String genre;
}
