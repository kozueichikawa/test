package object;

public class test {

  public static void main(String[]args){
	  
	Person taro = new Person();
	taro.name ="山田太郎";
	taro.age =20;
	taro.phoneNumber ="111-111";
	taro.address="111111111";
	
	System.out.println(taro.name);
	System.out.println(taro.age);
	System.out.println(taro.phoneNumber);
	System.out.println(taro.address);
	taro.talk();
	taro.walk();
	taro.run();
	
	
	
	
	Person jiro = new Person();
	jiro.name ="木村次郎";
	jiro.age =18;
	jiro.phoneNumber ="222-222";
	jiro.address="22222222";
	
	System.out.println(jiro.name);
	System.out.println(jiro.age);
	System.out.println(jiro.phoneNumber);
	System.out.println(jiro.address);
	jiro.talk();
	jiro.walk();
	jiro.run();
	
	
	
	
	Person hanako = new Person();
	hanako.name ="鈴木花子";
	hanako.age =16;
	hanako.phoneNumber ="333-333";
	hanako.address="333333333";
	
	System.out.println(hanako.name);
	System.out.println(hanako.age);
	System.out.println(hanako.phoneNumber);
	System.out.println(hanako.address);
	hanako.talk();
	hanako.walk();
	hanako.run();
	
	
	
	
	Person saburo = new Person();
	saburo.name ="田中三郎";
    saburo.age =29;
	saburo.phoneNumber ="444-444";
	saburo.address ="44444444444";
	
	System.out.println(saburo.name);
	System.out.println(saburo.age);
	System.out.println(saburo.phoneNumber);
	System.out.println(saburo.address);
	saburo.talk();
	saburo.walk();
	saburo.run();
	
	
	
	
}
}
