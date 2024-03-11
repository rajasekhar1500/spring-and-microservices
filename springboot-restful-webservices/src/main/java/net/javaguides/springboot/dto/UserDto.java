package net.javaguides.springboot.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(
        description = "userDto Model information"
)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Long id;

    // user first name should not be null or empty
    @NotEmpty
    @Schema(description = "user first name")
    private String firstName;

    // user last name should not be null or empty
    @NotEmpty
    @Schema(description = "user last name")
    private String lastName;

    // user email should not be null or empty
    // email address should be valid
    @NotEmpty
    @Email
    @Schema(description = "user email")
    private String email;
}
