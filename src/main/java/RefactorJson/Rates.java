package RefactorJson;

import lombok.Data;

@Data
public class Rates {
    private String no;
    private String effectiveDate;
    private Double bid;
    private Double ask;

}
