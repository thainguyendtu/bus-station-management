package vn.com.cmc.testapi.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;

@Builder
public class UpdateBusesDTO {

    @NotBlank
    @Length(max = 50)
    private String name;

    @NotNull
    private BigDecimal price;
}
