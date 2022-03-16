package core.be.dto.magnetto;

import lombok.Data;

@Data
public class Banks {

    private Integer id;
    private String beneficiaryAccount;
    private String beneficiaryBankSwift;
    private String intermediarySwift;
    private String beneficiaryName;
    private String beneficiaryBankName;
    private String beneficiaryBankAddress;
    private String intermediaryName;
    private String intermediaryAddress;
    private String correspondentBankAccount;
}
