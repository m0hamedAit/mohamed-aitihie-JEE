package ma.m0hamedait.ebankbackend.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomerDTO {
    private Long id;
    private String name;
    private String email;

    public CustomerDTO() {}
}
