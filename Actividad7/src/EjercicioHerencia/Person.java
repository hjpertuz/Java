
package EjercicioHerencia;


public  class Person {
   protected int id;
   private String name, lastName;
   private int age;

    public Person() {
        super();
    }

    public Person(int id, String name, String lastName, int age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

   
    public int getId() {
        return id;
    }

   
    public void setId(int id) {
        this.id = id;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

   
    public String getLastName() {
        return lastName;
    }

    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
   
 
    public String retornarDatos(){
        return "Persona id: "+this.id+", name: "+this.name+", lastName: "
                +this.lastName+", age: "+this.age;
    }
}
