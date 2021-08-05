
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Enter the number of employees: ");
        int n = entrada.nextInt();

        Employee [] vect = new Employee[n];

        for(int i=0;i<n;i++){
            System.out.println("Employee #" + (i+1)+ " data:");
            System.out.println("Outsourced(y/n)?");
            char c = entrada.next().charAt(0);
            System.out.println("Name: ");
            String name = entrada.next();
            System.out.println("Hours: ");
            Integer hours = entrada.nextInt();
            System.out.println("Value per hour: ");
            Double value = entrada.nextDouble();
            if(c=='n'){
                vect[i] = new Employee(name, hours, value);
            }
            if(c=='y'){
                System.out.println("Additional charge: ");
                Double add = entrada.nextDouble();
                vect[i] = new OutsourcedEmployee(name, hours, value, add);
            }
        }

        for(int i=0;i<n;i++){
            System.out.println("PAYMENTS: ");
            System.out.println(vect[i].getName()+ " - " + "$ "+ vect[i].payment());
        }


    }
}