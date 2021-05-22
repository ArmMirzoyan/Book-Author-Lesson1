public class Author {
    private String name;
    private String email;

    public Author (String name, String email){
        this.name = name; //hishum em vor this karayi chgrei :)
        this.email = email;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String newEmail){
        this.email = newEmail;
    }
    @Override
    public String toString() {
        return "Author name is " + name + ", email is " + email + ", ";
    }

}
