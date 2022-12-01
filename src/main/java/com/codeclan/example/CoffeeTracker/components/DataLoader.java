package com.codeclan.example.CoffeeTracker.components;

import com.codeclan.example.CoffeeTracker.models.Coffee;
import com.codeclan.example.CoffeeTracker.models.CoffeeShop;
import com.codeclan.example.CoffeeTracker.repositories.CoffeeRepository;
import com.codeclan.example.CoffeeTracker.repositories.CoffeeShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CoffeeShopRepository coffeeShopRepository;

    @Autowired
    CoffeeRepository coffeeRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        CoffeeShop coffeeShop1 = new CoffeeShop("Revival", "Jamaica");
        coffeeShopRepository.save(coffeeShop1);

        Coffee coffee1 = new Coffee("Magnum Exotics", 15, 4, coffeeShop1);
        coffeeRepository.save(coffee1);

        CoffeeShop coffeeShop2 = new CoffeeShop("King’s Row Coffee", "Brazil");
        coffeeShopRepository.save(coffeeShop2);

        Coffee coffee2 = new Coffee("Volcanica Brazil Peaberry", 12, 5, coffeeShop2);
        coffeeRepository.save(coffee2);


        CoffeeShop coffeeShop3 = new CoffeeShop("Rise & Shine", "Colombia");
        coffeeShopRepository.save(coffeeShop3);


        Coffee coffee3 = new Coffee("Juan Valdez", 6, 5, coffeeShop3);
        coffeeRepository.save(coffee3);


        CoffeeShop coffeeShop4 = new CoffeeShop("Elm Coffee Roasters", "Colombia");
        coffeeShopRepository.save(coffeeShop4);

        Coffee coffee4 = new Coffee("Magnum Exotics", 12, 8, coffeeShop1);
        coffeeRepository.save(coffee4);


        CoffeeShop coffeeShop5 = new CoffeeShop("Cafe D’Bolla", "Costa Rica");
        coffeeShopRepository.save(coffeeShop5);

        Coffee coffee5 = new Coffee("Cumbres del Poas Coffee", 12, 9, coffeeShop5);
        coffeeRepository.save(coffee5);


        CoffeeShop coffeeShop6 = new CoffeeShop("Peregrine Espresso", "Jamaica");
        coffeeShopRepository.save(coffeeShop6);

        Coffee coffee6 = new Coffee("Volcanica", 16, 9, coffeeShop5);
        coffeeRepository.save(coffee6);

        Coffee coffee7 = new Coffee("Green Coffee Trader", 12, 8, coffeeShop6);
        coffeeRepository.save(coffee7);

        Coffee coffee8 = new Coffee("Old Pulteney 18", 18, 8, coffeeShop6);
        coffeeRepository.save(coffee8);

        CoffeeShop coffeeShop7 = new CoffeeShop("Renaissance Cafe", "Jamaica");
        coffeeShopRepository.save(coffeeShop7);

        Coffee coffee9 = new Coffee("Coffee Traders One-Hundred Percent", 12, 7, coffeeShop7);
        coffeeRepository.save(coffee9);

        Coffee coffee10 = new Coffee("Dancing Moon", 13, 12, coffeeShop7);
        coffeeRepository.save(coffee10);

        CoffeeShop coffeeShop8 = new CoffeeShop("Commonwealth Cafe", "Brazil");
        coffeeShopRepository.save(coffeeShop8);

        Coffee coffee11 = new Coffee("Cooper's Cask Brazilian Espresso Cremoso", 15, 7, coffeeShop8);
        coffeeRepository.save(coffee11);

        Coffee coffee12 = new Coffee("Pilao Coffee Traditional Roast and Ground", 10, 1, coffeeShop8);
        coffeeRepository.save(coffee12);

        CoffeeShop coffeeShop9 = new CoffeeShop("Coffee Roasterie", "Ethiopia");
        coffeeShopRepository.save(coffeeShop9);

        Coffee coffee13 = new Coffee("Yirgacheffe Coffee", 16, 1, coffeeShop9);
        coffeeRepository.save(coffee13);

        Coffee coffee14 = new Coffee("Organic Sidamo Coffee", 1, 11, coffeeShop9);
        coffeeRepository.save(coffee14);

        CoffeeShop coffeeShop10 = new CoffeeShop("Diva Espresso", "Ethiopia");
        coffeeShopRepository.save(coffeeShop10);

        Coffee coffee15 = new Coffee("Peet's Coffee Brazil Minas Naturais Ground Coffee", 16, 10, coffeeShop8);
        coffeeRepository.save(coffee15);

        Coffee coffee16 = new Coffee("Dancing Moon", 1, 8, coffeeShop7);
        coffeeRepository.save(coffee16);

        CoffeeShop coffeeShop11 = new CoffeeShop("Grassroots Cafe", "Costa Rica");
        coffeeShopRepository.save(coffeeShop11);

        Coffee coffee17 = new Coffee("Tarrazu Coffee", 1, 6, coffeeShop11);
        coffeeRepository.save(coffee17);

        Coffee coffee18 = new Coffee("Monteverde Coffee", 1, 6, coffeeShop11);
        coffeeRepository.save(coffee18);

        CoffeeShop coffeeShop12 = new CoffeeShop("Sunset Cafe", "Costa Rica");
        coffeeShopRepository.save(coffeeShop12);

        Coffee coffee19 = new Coffee("La Minita Coffee", 13, 4, coffeeShop12);
        coffeeRepository.save(coffee19);

        Coffee coffee20 = new Coffee("La Amistad Coffee", 1, 4, coffeeShop12);
        coffeeRepository.save(coffee20);

        CoffeeShop coffeeShop13 = new CoffeeShop("Old Town Roastery", "Colombia");
        coffeeShopRepository.save(coffeeShop13);

        Coffee coffee21 = new Coffee("Don Pablo", 12, 3, coffeeShop13);
        coffeeRepository.save(coffee21);

        Coffee coffee22 = new Coffee("Colombia Coffee Roasters", 18, 8, coffeeShop13);
        coffeeRepository.save(coffee22);
    }
}
