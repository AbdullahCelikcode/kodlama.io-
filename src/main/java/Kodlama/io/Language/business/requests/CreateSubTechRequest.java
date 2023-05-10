package Kodlama.io.Language.business.requests;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateSubTechRequest {
    private String name;
    private int LanguageId;

}
