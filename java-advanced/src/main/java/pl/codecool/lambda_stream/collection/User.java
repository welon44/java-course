package pl.codecool.lambda_stream.collection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class User {

    private long id;
    private String userName;
    private String password;
    private int age;
}
