package org.tajry.devopstpjenkins.services;

public class SimpleMethods {

    // Méthode pour additionner deux nombres
    public int addNumbers(int a, int b) {
        return a + b;
    }

    // Méthode pour vérifier si un nombre est pair
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Méthode pour inverser une chaîne
    public String reverseString(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }


    public String sayHello(){
       return "Hello Mahmoud";
    }
}
