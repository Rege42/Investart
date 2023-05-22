package ru.project.Investart.entity;


import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "project_history")
public class ProjectHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "startup_id")
    @NonNull
    private Startup startup;

    @NonNull
    private String description;

    @NonNull
    private Date entry_date;



}
