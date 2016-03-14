package test;

class User {
	/** 
	  *��������������nameֵ 
	  *���������String name 
	  *�������ͣ�void 
	  */  
	 public void setName(String name) {  
	  this.name = name;  
	 }  
	  
	/** 
	  *������������ȡnameֵ 
	  *��������� 
	  *�������ͣ�String 
	  */  
	 public String getName() {  
	   return name;  
	 }  
	  
	/** 
	  *������������дequals()���� 
	  *���������Object obj 
	  *�������ͣ�boolean 
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
	  userA.setName("����");  
	    
	  User userB = new User();  
	  userB.setName("����");  
	  
	  User userC = new User();  
	  userC.setName("����");  
	  
	  System.out.println("userA equals userB:" + userA.equals(userB));  
	  System.out.println("userA equals userC:" + userA.equals(userC));  
	 }  
}
