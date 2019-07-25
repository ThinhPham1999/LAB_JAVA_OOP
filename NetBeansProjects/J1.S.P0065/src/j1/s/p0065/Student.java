
package j1.s.p0065;

public class Student {
    private String name;
    private String clazz;
    private double math;
    private double chemistry;
    private double physical;
    private double average;
    private char type;

    public Student() {
    }

    public Student(String name, String clazz) {
        this.name = name;
        this.clazz = clazz;
    }

    public Student(String name, String clazz, double math, double chemistry, double physical) {
        this.name = name;
        this.clazz = clazz;
        this.math = math;
        this.chemistry = chemistry;
        this.physical = physical;
        this.average = 0;
        this.type = 'E';
        setAverage();
        setType();
    }

    public String getName() {
        return name;
    }

    public String getClazz() {
        return clazz;
    }

    public double getMath() {
        return math;
    }

    public double getChemistry() {
        return chemistry;
    }

    public double getPhysical() {
        return physical;
    }

    public double getAverage() {
        return average;
    }

    public double getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public void setMath(double math) {
        this.math = math;
        setAverage();
        setType();
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
        setAverage();
        setType();
    }

    public void setPhysical(double physical) {
        this.physical = physical;
        setAverage();
        setType();
    }

    private void setAverage() {
        average = (math + chemistry + physical) / 3;
    }
    
    private void setType() {
        if (average > 7.5) type = 'A';
        if (average >= 6 && average <= 7.5) type = 'B';
        if (average >= 4 && average <= 6) type = 'C';
        if (average < 4) type = 'D';
    }

    @Override
    public String toString() {
        System.out.println("Name: "+ this.name);
        System.out.println("Class: "+ this.clazz);
        System.out.println("AVG: " + this.average);
        System.out.println("Type: " + this.type);
        return "";
    }
}
