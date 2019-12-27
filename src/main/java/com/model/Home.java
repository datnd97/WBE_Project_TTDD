package com.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "home")
@Data
public class Home {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String name;

    @Lob
    private String address;

    @Lob
    private Integer bedroom;

    @Lob
    private Integer bathroom;

    @Lob
    private Double price;

    @ManyToOne
    @JoinColumn(name = "type_home_id")
    private TypeHome typeHome;

    @ManyToOne
    @JoinColumn(name = "type_room_id")
    private TypeRoom typeRoom;

    @Lob
    private String description;

    @Lob
    private boolean status;

    @OneToMany(mappedBy = "home")
    private List<Image> images;

}