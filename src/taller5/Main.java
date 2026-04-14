/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller5;

public class Main {
    public static void main(String[] args) {

        Persona p = new Persona("Alex", 20);

        System.out.println(p.edad); // ✅ funciona (default)
        // System.out.println(p.nombre); ❌ ERROR (private)

        System.out.println(p.getNombre()); // ✅ correcto
    }
}
