package Kodlama.io.Language.dataAccsess.abstracts;

import Kodlama.io.Language.entities.concretes.SubTech;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubTechRepository extends JpaRepository<SubTech,Integer> {
}
