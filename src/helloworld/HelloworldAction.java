package helloworld;

public class HelloworldAction {
    //˽������
	private String hello="";

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}
	//execute() ����
	public String execute(){
		if(this.hello.equals("hello")){
			 return "SUCCESS";
		}else
			return "FAILED";
	}
}
