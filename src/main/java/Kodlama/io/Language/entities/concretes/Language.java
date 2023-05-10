package Kodlama.io.Language.entities.concretes;


import lombok.*;
import org.springframework.scheduling.annotation.Async;

import javax.persistence.*;
import java.util.List;

@Table(name = "Language")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "language", cascade = CascadeType.ALL)
    List<SubTech> subTeches;

}
