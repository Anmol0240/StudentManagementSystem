package com.enterprise.sms.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

/**
 * Represents the marks obtained by a student for a specific exam.
 * A unique constraint prevents duplicate mark entries for the same
 * student/exam combination.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(
        name = "marks",
        uniqueConstraints = @UniqueConstraint(columnNames = {"student_id", "exam_id"})
)
public class Mark extends BaseAuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "exam_id", nullable = false)
    private Exam exam;

    @NotNull
    @PositiveOrZero
    @Column(name = "marks_obtained", nullable = false)
    private Double marksObtained;

    @Column(name = "grade", length = 5)
    private String grade;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mark mark)) return false;
        return id != null && id.equals(mark.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
