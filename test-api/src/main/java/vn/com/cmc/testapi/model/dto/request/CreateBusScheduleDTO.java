package vn.com.cmc.testapi.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

@Builder
public class CreateBusScheduleDTO {

    @NotNull
    private Integer busesId;

    @NotNull
    private Integer busId;

    @Length(max = 30)
    private String driverName;

    private Date departureDate;
    private String departureTime;
}
