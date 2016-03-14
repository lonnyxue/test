package test;

class User {
	/** 
	  *方法描述：设置name值 
	  *输入参数：String name 
	  *返回类型：void 
	  */  
	 public void setName(String name) {  
	  this.name = name;  
	 }  
	  
	/** 
	  *方法描述：获取name值 
	  *输入参数： 
	  *返回类型：String 
	  */  
	 public String getName() {  
	   return name;  
	 }  
	  
	/** 
	  *方法描述：重写equals()方法 
	  *输入参数：Object obj 
	  *返回类型：boolean 
	  */  
	  @Override
	public boolean equals(Object obj) {  
	 if(this == obj) {  
	   return true;  
	 }  
	 if(null == obj) {  
	   return false;  
	 }  
	 if(getClass() != obj.getClass()) {  
	   return false;  
	 }  
	  
	 User user = (User) obj;  
	 if(!name.equals(user.name)) {  
	  return false;  
	 }  
	  return true;  
	}  
	 private String name;  
	  
	 public static void main(String[] args) {  
	  User userA = new User();  
	  userA.setName("王明");  
	    
	  User userB = new User();  
	  userB.setName("王明");  
	  
	  User userC = new User();  
	  userC.setName("王亮");  
	  
	  System.out.println("userA equals userB:" + userA.equals(userB));  
	  System.out.println("userA equals userC:" + userA.equals(userC));  
	 }  
}
