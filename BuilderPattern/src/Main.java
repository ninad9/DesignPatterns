public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder()
                .setUserName("Praveen")
                .setUserId("praveen123")
                .setEmail("paravee11@gmail.com")
                .build();
        
        System.out.println(user1.toString());  
     
        // we can skip any value if not needed,
        // we can even change the parameter sequence
        User user2 = User.UserBuilder.builder()
                    .setUserId("naveen456")                            
                    .setUserName("Naveen")
                    .build();
        System.out.println(user2.toString());
    }
    
}
