package pl.codecool.collections.list.zad3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Command {

    private String command;

    public String operation() {
        return command;
    }

}
