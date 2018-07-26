package controllers;

import play.*;
import play.api.templates.Html;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {


    public static Result home() {
        return ok(home.render());

    }

    public static Result Acer() {
        return ok(Acer.render());

    }

    public static Result Asus() {
        return ok(Asus.render());

    }

    public static Result Dell() {
        return ok(Dell.render());

    }

    public static Result Msi() {
        return ok(Msi.render());

    }

    public static Result index() {
        return ok(index.render());

    }

    public static Result Promotion() {
        return ok(Promotion.render());

    }

    public static Result history() {
        return ok(history.render());

    }

    public static Result Showproduct(){
        models.Notebook Adidas1 = new models.Notebook("A001","Adidas Originals NMD R1 Color Core Black/Carbon/Ftwr White","Adidas",8500.00,10);
        models.Notebook Adidas2 = new models.Notebook("A002","Adidas Originals NMD R1 PK Color Grey Two/Grey Four/Grey Five","Adidas",11000.00,8);
        models.Notebook Adidas3 = new models.Notebook("A003","Adidas Originals NMD R1 PK Color Utility Grey/Utility Grey/Shock Pink","Adidas",11000.00,8);
        models.Notebook Adidas4 = new models.Notebook("A004","Adidas NMD R1 Exclusive ZLD Colour rose pink footwear white","Adidas",8900.00,10);
        models.Notebook Adidas5 = new models.Notebook("A005","adidas Originals NMD_R1 Exclusive JD Color RED","Adidas",8500.00,6);
        models.Notebook Adidas6 = new models.Notebook("A006","Adidas CFW M CasualShoeAdvantage DA9636","Adidas",2300.00,10);

        return ok(home.render());
}
