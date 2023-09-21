package devDOS.devdiariesoperationalsystem.domain.project;

import devDOS.devdiariesoperationalsystem.domain.entry.Entry;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "project")
    private List<Entry> projectEntries;

}
