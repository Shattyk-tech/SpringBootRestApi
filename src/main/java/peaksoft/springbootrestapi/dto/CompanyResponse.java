package peaksoft.springbootrestapi.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CompanyResponse {
    public String id;
    private String address;
    private String companyName;
    private String number;
    private String emal;
    private boolean blocked;
    private LocalDateTime dateTime;

}
