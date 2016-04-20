package helloworld;

public class HelloworldAction {
    //私有属性
	private String hello="";

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}
	//execute() 方法
	public String execute(){
		if(this.hello.equals("hello")){
			 return "SUCCESS";
		}else
			return "FAILED";
	}
}
