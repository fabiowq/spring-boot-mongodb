package hello;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {

    @Id
    private final String id;
    private final String firstName;
    private final String lastName;

}

