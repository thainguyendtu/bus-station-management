package vn.com.cmc.testapi.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import org.hibernate.validator.constraints.Length;

@Builder
public class UpdateBusRangeDTO {

    @NotBlank
    @Length(max = 1000)
    private String description;

    @NotNull
    @Size(max = 100)
    private Integer numberOfSeats;
}
