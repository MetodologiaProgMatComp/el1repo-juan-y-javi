package es.uah.matcomp.mp.e2.ejerciciosclases.e3;

public class Author {
    private String name;
    private String email;
    public Author(String n, String e){
        name=n;
        email=e;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String myEmail){
        this.email=myEmail;
    }

    public String toString() {
        return "Author[name="+name+", email="+email+"]";
    }
}
