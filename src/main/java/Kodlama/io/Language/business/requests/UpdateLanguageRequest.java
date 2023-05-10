package Kodlama.io.Language.business.requests;

import Kodlama.io.Language.entities.concretes.SubTech;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateLanguageRequest {
    private int id;
    private String name;
}
