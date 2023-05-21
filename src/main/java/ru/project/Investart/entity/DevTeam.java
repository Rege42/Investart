package ru.project.Investart.entity;


import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "dev_teams")
public class DevTeam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String nameTeamLead;

    @NonNull
    private double rating;

    @OneToOne
    @JoinColumn(name = "user_id")
    @NonNull
    private User user;


}
