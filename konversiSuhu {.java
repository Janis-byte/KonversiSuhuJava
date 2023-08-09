import java.util.Scanner;



class konversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input Celcius: ");
        double Celcius = input.nextDouble();

        System.out.println("Pilih Opsi: ");
        System.out.println("1.Fahrenheit: ");
        System.out.println("2.Reamur: ");

        int Opsi = input.nextInt();

        if (Opsi == 1) {
            double F = (Celcius*9/5)+32;
            System.out.println("Celcius: "+Celcius + " == "+ "Fahrenheit: "+ F);
            
        }
        else if (Opsi == 2) {
            double R = (Celcius*4/5);
            System.out.println("Celcius "+Celcius +" ==" + " Raemur"+ R);

            
        }
        else{System.out.println("Invalid: ");}
    


    }
    
}
