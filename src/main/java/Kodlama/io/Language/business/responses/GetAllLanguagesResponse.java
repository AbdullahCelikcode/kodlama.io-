package Kodlama.io.Language.business.responses;

import Kodlama.io.Language.entities.concretes.SubTech;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllLanguagesResponse {
    private int id;
    private String name;
     private List<GetAllSubTech> subTechs;


}
