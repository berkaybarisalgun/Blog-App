package berkaybarisalgun.BlogApp.Business.Requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdatePostRequest {

    private int id;

    private String title;

    private String create_time= String.valueOf(LocalDate.now());

    private String content;


}
