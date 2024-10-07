public class Main
{
    public static void main(String[] args)
    {
        boolean info;

        WordChecker a = new WordChecker();
        a.add("an");
        a.add("band");
        a.add("band");
        a.add("abandon");
        info = a.isWordChain();
        System.out.print(info);
        WordChecker b = new WordChecker();
        b.add("to");
        b.add("too");
        b.add("stool");
        b.add("tools");
        info = b.isWordChain();
        System.out.print(info);
    }
}