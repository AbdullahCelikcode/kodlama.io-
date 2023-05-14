package Kodlama.io.Language.webApi.Controllers;

import java.util.List;

import Kodlama.io.Language.business.abstracts.SubTechService;
import Kodlama.io.Language.business.requests.CreateSubTechRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/subTechs")
@AllArgsConstructor
public class SubTechController {

    private SubTechService subTechService;

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public  void add(@RequestBody CreateSubTechRequest createSubTechRequest) {
        this.subTechService.add(createSubTechRequest);

    }
   /* @PutMapping("/update")
    public  void update(UpdateSubTechRequest subTechRequest) {
        this.subTechService.update(subTechRequest);

    }

    @DeleteMapping("/delete")
    public void delete(DeleteSubTechRequest deleteSubTechRequest) {
        this.subTechService.delete(deleteSubTechRequest);
    }

    @GetMapping("/getbyid")
    public GetByIdSubTechResponse getById(int id) {
        return subTechService.getById(id);
    }
*/
}
