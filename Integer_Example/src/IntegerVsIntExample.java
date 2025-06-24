public class IntegerVsIntExample {
    public static void main(String[] args) {
        // 1. Primitív int használata
        int primInt = 5;
        System.out.println("Primitív int érték: " + primInt);

        // 2. Integer objektum létrehozása (autoboxing)
        Integer integerObj = primInt; // int -> Integer (autoboxing)
        System.out.println("Integer objektum érték: " + integerObj);

        // 3. Integer -> int konverzió (unboxing)
        int primInt2 = integerObj; // Integer -> int (unboxing)
        System.out.println("Unboxing után int érték: " + primInt2);

        // 4. Integer null értékkel
        Integer nullInteger = null;

        try {
            int primInt3 = nullInteger; // unboxing nullból - NPE!
            System.out.println("Ez nem fog kiíródni: " + primInt3);
        } catch (NullPointerException e) {
            System.out.println("Hiba: NullPointerException az unboxing során, mert az Integer értéke null!");
        }

        // 5. Integer metódusok használata
        String intAsString = integerObj.toString();
        System.out.println("Integer toString() eredménye: " + intAsString);
    }
}
