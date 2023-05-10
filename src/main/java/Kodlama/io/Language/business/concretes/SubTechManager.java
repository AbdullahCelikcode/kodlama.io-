package Kodlama.io.Language.business.concretes;


import Kodlama.io.Language.business.abstracts.SubTechService;
import Kodlama.io.Language.business.requests.CreateSubTechRequest;
import Kodlama.io.Language.core.utilities.mappers.ModelMapperService;
import Kodlama.io.Language.dataAccsess.abstracts.LanguageRepository;
import Kodlama.io.Language.dataAccsess.abstracts.SubTechRepository;
import Kodlama.io.Language.entities.concretes.SubTech;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class SubTechManager implements SubTechService {
    private SubTechRepository subTechRepository;

    public void add(CreateSubTechRequest createSubTechRequest) {
        int Id=createSubTechRequest.getLanguageId();
        SubTech subTech= new SubTech();
        subTech.setName(createSubTechRequest.getName());
        subTech.setLanguage(subTechRepository.getReferenceById(Id).getLanguage());
        this.subTechRepository.save(subTech);

    }


    }

