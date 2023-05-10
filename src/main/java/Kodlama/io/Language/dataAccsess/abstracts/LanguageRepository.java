package Kodlama.io.Language.dataAccsess.abstracts;

import Kodlama.io.Language.entities.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaRepository<Language,Integer> {

    Language findByIdAndName(int id , String name);

}
