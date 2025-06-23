```java
class IFSample{ //public class  vagy class
    public static void main(String[] args){
        int x, y;
        x= 10;
        y= 20;

        if (x < y) System.out.println("X is less than y");
        //akár kodblokba is lehet rakni{} de
        //10 < 20 igaz kiírja
        x = x *2;
        if(x == y)System.out.println("x now equal to y");
        //20 == 20 igaz kiírja
        //maert x *2
        x = x * 2;
        if (x > y) System.out.println("X now greater than y");
        //40 > 20 igaz kiírja
        //mert megint x * 2

        //this won't display anything
        //mert az x értéke nem egyenlő  y értékével szóval nem írja ki
        if (x == y) System.out.println("You wont see this");
    }
}
```

