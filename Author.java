class Author{
    String name,email;
    char gender;
    Author(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    void getDetails(){
        System.out.println("the author details are as follows:");
        System.out.println(name);
        System.out.println(email);
        System.out.println(gender);
    }
}