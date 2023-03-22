package vn.com.cmc.testapi.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import org.hibernate.validator.constraints.Length;
import vn.com.cmc.testapi.util.validation.InspectionTermValidation;
import vn.com.cmc.testapi.util.validation.LicensePlateValidation;

@Builder
public class CreateBusDTO {

    @NotNull
    private Integer rangeId;

    @NotNull
    private Integer garageId;

    @NotBlank
    @Length(max = 20)
    private String vehicleCompany;

    @NotBlank
    @Length(max = 10)
    @LicensePlateValidation
    private String licensePlate;

    @NotBlank
    @InspectionTermValidation
    private String inspectionTerm;
}
