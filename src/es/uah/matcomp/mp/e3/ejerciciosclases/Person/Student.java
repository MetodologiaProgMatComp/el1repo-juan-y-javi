package es.uah.matcomp.mp.e3.ejerciciosclases.Person;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String nam, String ad, String prog, int ye, double fe) {
        super(nam, ad);
        program = prog;
        year = ye;
        fee = fe;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    @Override
    public String toString() {
        return "Student[" +
                "program=" + program +
                ", year=" + year +
                ", fee=" + fee +
                ']';
    }
}
