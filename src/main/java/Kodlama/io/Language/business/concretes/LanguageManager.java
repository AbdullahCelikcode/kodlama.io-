package Kodlama.io.Language.business.concretes;

import Kodlama.io.Language.business.abstracts.LanguageService;
import Kodlama.io.Language.business.requests.CreateLanguageRequest;
import Kodlama.io.Language.business.requests.UpdateLanguageRequest;
import Kodlama.io.Language.business.responses.GetAllLanguagesResponse;
import Kodlama.io.Language.business.responses.GetAllSubTech;
import Kodlama.io.Language.business.responses.GetByIdLanguageResponse;
import Kodlama.io.Language.core.utilities.mappers.ModelMapperService;
import Kodlama.io.Language.dataAccsess.abstracts.LanguageRepository;
import Kodlama.io.Language.entities.concretes.Language;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

// iş kuralları
@Service
@AllArgsConstructor
public class LanguageManager implements LanguageService {
    @Autowired
    private LanguageRepository languageRepository;
    @Autowired
    private ModelMapperService modelMapperService;



    public List<GetAllLanguagesResponse> getAll() {

        List<Language> languages = languageRepository.findAll();
        List<GetAllLanguagesResponse> languagesResponses =languages.stream().map(language -> this.modelMapperService.forResponse()
                .map(language,GetAllLanguagesResponse.class)).collect(Collectors.toList());
        return languagesResponses;

         /*   List<GetAllSubTech> getAllSubTeches = Language.getSubTeches().stream().map(SubTech -> modelMapperService.forResponse()
                    .map(SubTech, GetAllSubTech.class)).collect(Collectors.toList());
            getAllLanguagesResponse.setSubTechName(getAllSubTeches);

                    return getAllLanguagesResponse;}).collect(Collectors.toList()); */

    }


    @Override
    public void add(CreateLanguageRequest createLanguageRequest) {
        Language language = this.modelMapperService.forRequest().map(createLanguageRequest,Language.class);
        this.languageRepository.save(language);

    }
    public  void delete(int id){

       this.languageRepository.deleteById(id);
    }
    public  void update(UpdateLanguageRequest updateLanguageRequest){
        Language language = this.modelMapperService.forRequest().map(updateLanguageRequest,Language.class);

       this.languageRepository.save(language);

    }
    public GetByIdLanguageResponse getById(int id){
        Language language =this.languageRepository.findById(id).orElseThrow();
        GetByIdLanguageResponse response=this.modelMapperService.forResponse().map(language,GetByIdLanguageResponse.class);
        return  response;
    }

}



