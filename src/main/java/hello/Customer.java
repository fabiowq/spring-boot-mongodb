package hello;

import org.springframework.data.annotation.Id;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Customer {

    @Id
    String id;
    String firstName;
    String lastName;
    String mobile;

}

