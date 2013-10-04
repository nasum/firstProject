package controllers;

import java.util.List;

import play.*;
import play.data.DynamicForm;
import play.data.Form;
import play.db.ebean.Model.Finder;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
	
    public static Result index() {
        return ok(index.render());
    }
}
