
public class E2_1 {
    public static void main(String[] args) {
        Alumno a = new Alumno();
        Profesor p = new Profesor(10008000);
        System.out.println(a);
        System.out.println(p);



    }
} 
    class Persona{
        protected  String nombre;
        protected  int edad;

        Persona(){
            this.nombre = "Sin nombre";
            this.edad = 0;
        }

    }

    class Alumno extends Persona{

        Alumno(){
            System.out.println("Se crea Alumno...");
            super();
        }
        @Override 
        public String toString(){
            return "Un alumno llamado: " + this.nombre;
        }

    }

    class Profesor extends Persona{
        private int numEmpleado;

        Profesor(int numEmpleado){
            this.numEmpleado = numEmpleado;
            super();
        }
        @Override 
        public String toString(){
            return "Un profesor de edad " + this.edad + ", con calve " + this.numEmpleado;
        }
    }

