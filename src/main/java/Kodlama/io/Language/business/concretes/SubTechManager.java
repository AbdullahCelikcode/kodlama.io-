package Kodlama.io.Language.business.concretes;


import Kodlama.io.Language.business.abstracts.SubTechService;
import Kodlama.io.Language.business.requests.CreateSubTechRequest;
import Kodlama.io.Language.business.responses.GetAllLanguagesResponse;
import Kodlama.io.Language.business.responses.GetAllSubTech;
import Kodlama.io.Language.core.utilities.mappers.ModelMapperManager;
import Kodlama.io.Language.core.utilities.mappers.ModelMapperService;
import Kodlama.io.Language.dataAccsess.abstracts.LanguageRepository;
import Kodlama.io.Language.dataAccsess.abstracts.SubTechRepository;
import Kodlama.io.Language.entities.concretes.Language;
import Kodlama.io.Language.entities.concretes.SubTech;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class SubTechManager implements SubTechService {
    private SubTechRepository subTechRepository;
    private ModelMapperManager modelMapperService;

    public void add(CreateSubTechRequest createSubTechRequest) {
        SubTech subTech = this.modelMapperService.forRequest().map(createSubTechRequest,SubTech.class);
        this.subTechRepository.save(subTech);

    }


    }

