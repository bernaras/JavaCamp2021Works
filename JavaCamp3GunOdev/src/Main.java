
public class Main {

	public static void main(String[] args) {
 
		User user1 =new User();
 		user1.setId(1);
 		user1.setEmail("berna@berna.com");
		user1.setUserName("Berna");
		user1.setPassword("askdjaslı2j2");
		System.out.println("Kullanıcı adı: "+user1.getUserName());
  		System.out.println();

		Student student1=new Student();
		student1.setId(1);
		student1.setStudentCourse("Java");
        student1.setUserName("bernaras");
        student1.setPassword("sajdlkskldj");
        student1.setEmail("berna@berna.com");
        
        StudentManager studentManager=new StudentManager();
        studentManager.add(student1);
        studentManager.registeredCourse(student1);
  		System.out.println("Öğrencinin kullanıcı adı: "+student1.getUserName()+". Sisteme eklendi ve kursa kaydedildi.");
  		System.out.println();
  		
        Instructor instructor1=new Instructor();
        instructor1.setId(1);
        instructor1.setUserName("Engin Demiroğ");
        instructor1.setInstructorCourse("Java Camp 2021");
        instructor1.setInstructorId("1");
        System.out.println(instructor1.getUserName()+" adlı eğitmenin kursu: "+instructor1.getInstructorCourse()+"'dir.");
  		System.out.println();
  		
  		InstructorManager instructorManager=new InstructorManager();
  		instructorManager.addCourse(instructor1);
        System.out.println(instructor1.getUserName()+" adlı eğitmene Pyhton kursu eklendi.");

        UserManager userManager=new UserManager();
        User [] users ={user1,student1,instructor1};
        userManager.addMultiple(users);
	
	}

}
