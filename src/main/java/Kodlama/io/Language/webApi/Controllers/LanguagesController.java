package Kodlama.io.Language.webApi.Controllers;

import Kodlama.io.Language.business.abstracts.LanguageService;
import Kodlama.io.Language.business.requests.CreateLanguageRequest;
import Kodlama.io.Language.business.requests.UpdateLanguageRequest;
import Kodlama.io.Language.business.responses.GetAllLanguagesResponse;
import Kodlama.io.Language.business.responses.GetByIdLanguageResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // annotation
@RequestMapping("/api/languages")
@AllArgsConstructor
public class LanguagesController {
            private LanguageService languageService;

    @GetMapping()
    public List<GetAllLanguagesResponse> getAll(){
        return languageService.getAll();

    }
    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public  void add(@RequestBody CreateLanguageRequest createLanguageRequest){
        this.languageService.add(createLanguageRequest);
    }


    @GetMapping("/{id}")
    public GetByIdLanguageResponse getById(@PathVariable int id){
        return languageService.getById(id);
    }
    @PutMapping()

    public  void update(UpdateLanguageRequest updateLanguageRequest){
        this.languageService.update(updateLanguageRequest);
    }

    @DeleteMapping("/{id}")
    public  void delete(@PathVariable int id){
        this.languageService.delete(id);
    }


}
