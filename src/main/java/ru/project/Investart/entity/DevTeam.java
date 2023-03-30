package ru.project.Investart.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Objects;

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
    private String phoneNumber;

    @NonNull
    private String email;

    @NonNull
    private String login;
    @NonNull
    private String password;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DevTeam devTeam = (DevTeam) o;
        return Objects.equals(id, devTeam.id) && name.equals(devTeam.name) && phoneNumber.equals(devTeam.phoneNumber) && email.equals(devTeam.email) && login.equals(devTeam.login) && password.equals(devTeam.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phoneNumber, email, login, password);
    }
}
