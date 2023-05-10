package Kodlama.io.Language.business.abstracts;

import Kodlama.io.Language.business.requests.CreateLanguageRequest;
import Kodlama.io.Language.business.requests.UpdateLanguageRequest;
import Kodlama.io.Language.business.responses.GetAllLanguagesResponse;
import Kodlama.io.Language.business.responses.GetByIdLanguageResponse;

import java.util.List;


public interface LanguageService {
  List<GetAllLanguagesResponse> getAll();
  GetByIdLanguageResponse getById(int id);
  void add(CreateLanguageRequest createLanguageRequest);
  void update(UpdateLanguageRequest updateLanguageRequest);
  void delete(int id);


}
