package pl.projekt1.main;

import pl.projekt1.pakiet1.WyswietlanieNapisow;

public class Main {
    public static void main(String[] args) {
        WyswietlanieNapisow wyswietlanieNapisow = new WyswietlanieNapisow();
        wyswietlanieNapisow.wyswietlNapis();
        wyswietlanieNapisow.wyswietlNapis("napis");
        String ciagznakow=wyswietlanieNapisow.zwrocNapis();
        System.out.println(ciagznakow);

    }
    public void Wyswietl_napis(){
        System.out.println("helo world");

    }
}
