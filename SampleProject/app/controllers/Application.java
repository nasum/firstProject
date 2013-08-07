package controllers;

import java.util.List;

import models.Parent;
import play.*;
import play.db.ebean.Model.Finder;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
    public static Result index() {
    	Parent parent1 = new Parent();
    	parent1.name = "hogehoge";
    	parent1.save();
    	
    	Parent parent2 = new Parent();
    	parent2.name = "hugahuga";
    	parent2.save();
    	
    	Finder<Long, Parent> finder = new Finder<Long, Parent>(Long.class, Parent.class);
    	List<Parent> list = finder.all();
    	
    	StringBuilder sb = new StringBuilder();
    	
    	for(Parent parent:list){
    		sb.append(parent.toString()).append("¥¥n");
    	}
    	
        return ok(sb.toString());
    }
  
}
