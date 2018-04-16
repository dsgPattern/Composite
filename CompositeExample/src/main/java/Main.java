public class Main {
    public static void main(String[] args) {
        Person pers1=new Person("Tibi draga");
        Person pers2=new Person("Andreas");
        Person pers3=new Person("Joana");
        Person pers4 = new Person("Ion");
        pers1.AddChild(pers2);
        pers1.AddChild(pers3);
        pers1.AddChild(pers4);
        pers1.LogChildren();
        pers2.LogChildren();

        //Add a more complex tree structure and adapt the loging to show the hierarchy
    }
}
