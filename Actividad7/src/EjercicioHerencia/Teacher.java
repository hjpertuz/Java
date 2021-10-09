package EjercicioHerencia;

public class Teacher extends Person {
    private String program, university;
    
    public Teacher(){}
    
    public Teacher(int id, String name, String lastName, int age, String program,
            String university){
        super(id, name, lastName, age);
        this.program=program;
        this.university=university;
    }

    
    public String getProgram() {
        return program;
    }

  
    public void setProgram(String program) {
        this.program = program;
    }

   
    public String getUniversity() {
        return university;
    }

   
    public void setUniversity(String university) {
        this.university = university;
    }
    
    @Override
    public String retornarDatos(){
        return "Teacher Program: "+this.program+", University: "+this.university+", "
                + super.retornarDatos();
    }
    
    
}
