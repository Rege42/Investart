package ru.project.Investart.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "startups")
public class Startup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private double needMoney;

    @NonNull
    private Date endDate;

    @OneToOne
    @JoinColumn(name = "author_id")
    @NonNull
    private DevTeam author;
}
