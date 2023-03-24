package pl.codecool.collections.list.zad3;

import java.util.Deque;
import java.util.LinkedList;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Queue {

    private Deque<Command> commandDeque = new LinkedList<>();

    public void addCommand(Command command) {
        commandDeque.add(command);
    }

    public Deque<Command> returnQueue() {
        return commandDeque;
    }
}
