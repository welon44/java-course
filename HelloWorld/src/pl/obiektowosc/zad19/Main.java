package pl.obiektowosc.zad19;

public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("Autor1", "Polish");
        Author author2 = new Author("Autor2", "USA");
        Author author3 = new Author("Autor3", "Arab");

        Poem poem1 = new Poem(author1, 1);
        Poem poem2 = new Poem(author2, 2);
        Poem poem3 = new Poem(author3, 3);

        Poem[] poems = new Poem[3];
        poems[0] = poem1;
        poems[1] = poem2;
        poems[2] = poem3;

        Poem theLongestPoem = poems[0];

        for (Poem poem : poems) {
            if (poem.getStropheNumbers() > theLongestPoem.getStropheNumbers()) {
                theLongestPoem = poem;
            }
        }

        System.out.println("Najdłuższy poem napisał => " + theLongestPoem.getCreator().getSurname());

    }
}
