package devDOS.devdiariesoperationalsystem.domain.entry;

import devDOS.devdiariesoperationalsystem.domain.project.Project;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;


import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date entryDate;
    @NotBlank(message = "Entry cannot be empty")
    private String text;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "project_id",nullable = true, foreignKey = @ForeignKey(name = "FK_ENTRY_PROJECT"))
    private Project project;


}
