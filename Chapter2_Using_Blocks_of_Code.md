```java
class BlockTest{
    public static void main (String[] args){
        int x ,y;
        y = 20;
        // the target of this loop is a block
        for (x = 1; x < 11; x++){
            System.out.println("This is x: " +x);
            System.out.println("This is y: " +y);//kiírja mert a for ciklus belsejében van
            y = y -2;//és elvesz belőle mindig 2-öt ez is a for belsejében
            //x = x +1;
        }
    }
}
```

