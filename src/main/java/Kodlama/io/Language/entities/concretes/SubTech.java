package Kodlama.io.Language.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "SubTech")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SubTech {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sub_id")
    private int id;


    @Column(name = "name")
    private String name;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "language_id")
    private Language language;

}
