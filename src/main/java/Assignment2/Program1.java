package Assignment2;

public class Program1 {

        private final int id;
        private final String name;
        private final double salary;


        public Program1(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Program1{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }

        public static void main(String[] args) {
            Program1 p=new Program1(1,"Lakshmi",30000);
            System.out.println(p);
            System.out.println("Employee Id:"+p.getId());
            System.out.println("Employee Name:"+p.getName());
            System.out.println("Employee Salary:"+p.getSalary());
        }
    }

