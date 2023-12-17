class User{
    private final String userName;
    private final String userId;
    private final String email;

    private User(UserBuilder builder){
        //initialize
        this.userName = builder.userName;
        this.userId = builder.userId;
        this.email = builder.email;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    //inner class to create oject
    static class UserBuilder{
        private String userName;
        private String userId;
        private String email;

        public UserBuilder(){
            
        }

        // another way of creating object
        public static UserBuilder builder(){    
            return new UserBuilder();

        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public User build(){
            return new User(this);
        }
        
    }

    @Override
    public String toString() {
        return "User [userName=" + userName + ", userId=" + userId + ", email=" + email + "]";
    }



    
}