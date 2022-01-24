package com.careerdevs.companyfactory;
// Fields: name (String), yearEstablished (short), marketCap (double)
import java.util.Scanner;

public class MainCompanyFactory {
    public static void main(String[] args) {
        createACompany();

    }

       public static void createACompany(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your companys name? \n Name:");
        String name = scanner.next();

        System.out.print("What year was this company established? \n Year:");
        short yearEstablished = scanner.nextShort();

        System.out.print("What is the market cap? \n Cap:");
        double marketCap = scanner.nextDouble();


        Company myCompany = new Company(name,yearEstablished,marketCap);

        System.out.print(myCompany);






    }
}

