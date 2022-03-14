package core.be.dto.magnetto;

import lombok.Data;

@Data
public class FundModel {

    private Integer id;
    private String  title;
    private String  subTitle;
    private String description;
    private String email;
    private Integer categoryId;
    private String twitter;
    private String facebook;
    private String instagram;
    private String url;
    private String iban;
    private Integer edpnou;
    private Phones [] phones ;
    private Banks [] banks;
    private String[] images;

}
