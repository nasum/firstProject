package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

import play.db.jpa.Model;

@Entity
public class Parent extends Model{
	@Id
	public Long id;
	
	public String name;
	
	public Date createDate;
	
	@Version
	public Date updateDate;
	
	public String toString() {
        return "Parent [id=" + id + ", name=" + name + ", createDate="
                + createDate + ", updateDate=" + updateDate + "]";
    }
}
