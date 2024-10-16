import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        boolean info;
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<String> createdList = new ArrayList<String>();

        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");
        WordChecker a = new WordChecker(words);
        info = a.isWordChain();
        System.out.println(info);
        words.clear();
        words.add("to");
        words.add("too");
        words.add("stool");
        words.add("tools");
        WordChecker b = new WordChecker(words);
        info = b.isWordChain();
        System.out.println(info);
        words.clear();
        words.add("catch");
        words.add("bobcat");
        words.add("catchacat");
        words.add("cat");
        words.add("at");
        WordChecker c = new WordChecker(words);
        createdList = c.createList("cat");
        System.out.println(createdList);
        createdList = c.createList("catch");
        System.out.println(createdList);
        createdList = c.createList("dog");
        System.out.println(createdList);
    }
}