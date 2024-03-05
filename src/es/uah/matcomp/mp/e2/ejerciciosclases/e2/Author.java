package es.uah.matcomp.mp.e2.ejerciciosclases.e2;

public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String n, String e, char g){
        name=n;
        email=e;
        gender=g;
    }
    public Author(){}
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String myEmail){
        this.email=myEmail;
    }
    public char getGender(){
        return gender;
    }
    public void setGender(char myGender){
        this.gender=myGender;
    }

    public String toString() {
        return "Author[name="+name+", email="+email+", gender="+gender+"]";
    }
}
