/*
for(inicializálás; feltétel; iteráció)
 */
public class ForTest{//ha sima Class nem kell megváltoztani a fájl nevét
    public static void main(String[] args) {
        int x;
            // x 0tól; x 9-ig; x++; hozzáadunk egyet külömben nem áll le
            // azaz túlcsordul
            // de a 10. sornál leáll 9-ig megy
        for (x = 0; x < 10; x = x + 1) //vagy x++
            System.out.println("This is x: " + x);//kiíratjuk a változott
    }
}