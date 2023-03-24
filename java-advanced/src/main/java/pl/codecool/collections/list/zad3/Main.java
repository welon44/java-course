package pl.codecool.collections.list.zad3;

public class Main {

    public static void main(String[] args) {

        Command command1 = new Command("command 1");
        Command command2 = new Command("command 2");

        Queue queue = new Queue();

        queue.addCommand(command1);
        queue.addCommand(command2);

        queue.getCommandDeque().forEach(command -> command.operation());
    }
}
