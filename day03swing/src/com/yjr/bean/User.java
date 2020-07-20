package com.yjr.bean;

/*public class User {
	private String ID;
	private String name;
	private String wugong;
	private String leval;
	public String getID() {
		return ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getwugong() {
		return wugong;
	}
	public void setwugong(String wugong) {
		this.wugong = wugong;
	}
	public String getleval() {
		return leval;
	}
	public void setleval(String leval) {
		this.leval = leval;
	}
	
	 @Override
	public String toString() {
		return "User [ID=" + ID + ", name=" + name + ", wugong=" + wugong + ", leval=" + leval + "]";
	}

}*/

public class User {
	//实体类的成员变量和数据库表的字段名称和类型一致
    private String id;
    private String name;
    private String wugong;
    private String leval;
    
    public User(){}
    public User(String name,String id, String wugong,String leval) {
        super();
        this.id = id;
        this.name = name;
        this.wugong = wugong;
        this.leval = leval;
    }
    //创建每个成员变量的set和get方法
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getwugong() {
        return wugong;
    }
    public void setwugong(String wugong) {
        this.wugong = wugong;
    }
    public void setleval(String leval) {
        this.leval = leval;
    }

    public String getleval() {
        return leval;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", wugong=" + wugong + ", leval=" + leval + "]";
    }

}