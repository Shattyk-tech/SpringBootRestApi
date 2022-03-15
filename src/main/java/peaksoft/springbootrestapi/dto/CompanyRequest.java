package peaksoft.springbootrestapi.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter

public class CompanyRequest {
    @NonNull
    private  String companyName;
    private  String address;
    private  String email;
    private String number;


}
