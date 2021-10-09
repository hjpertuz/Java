
package EjercicioHerencia;

public class Doctor extends Person {
   private String specialty, hospital;

    public Doctor() {
        super();
    }
    
    public Doctor(int id, String name, String lastName, int age, String specialty,
            String hospital){
        super(id, name, lastName, age);
        this.specialty=specialty;
        this.hospital=hospital;
    }

    
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
        
    }
    
    
   @Override
    public String retornarDatos(){
        return "Doctor Specialty: "+this.specialty+", Hospital: "+this.hospital+", "
                + super.retornarDatos();
    }
    
    
   
}
