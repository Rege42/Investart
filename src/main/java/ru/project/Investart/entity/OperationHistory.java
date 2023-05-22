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
@Table(name = "operation_history")
public class OperationHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "investor_id")
    @NonNull
    private Investor investor;

    @ManyToOne
    @JoinColumn(name = "startup_id")
    @NonNull
    private Startup startup;

    @NonNull
    private Date operationDate;

    @NonNull
    private double transMoney;
}
