package ru.project.Investart.entity;


import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "investors")
public class Investor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String login;

    @NonNull
    private String email;


    @NonNull
    private String phoneNumber;

    @NonNull
    private String password;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Investor investor = (Investor) o;
        return Objects.equals(id, investor.id) && login.equals(investor.login) && email.equals(investor.email) && phoneNumber.equals(investor.phoneNumber) && password.equals(investor.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, email, phoneNumber, password);
    }
}
