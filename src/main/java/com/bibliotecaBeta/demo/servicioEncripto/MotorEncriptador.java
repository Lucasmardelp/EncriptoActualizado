package com.bibliotecaBeta.demo.servicioEncripto;

import com.bibliotecaBeta.demo.Clases.TextoAEncriptar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class MotorEncriptador {



    public String encriptandoTexto (TextoAEncriptar texto){

        StringBuilder textoEncriptado = new StringBuilder();
         for (int i = 0; i < texto.getTextoM().length(); i++){
    char caracter = texto.getTextoM().charAt(i);
    switch (Character.toLowerCase(caracter)){
        case 'a' :
            textoEncriptado.append("$");
            break;
        case 'e' :
            textoEncriptado.append("%");
            break;
        case 'i' :
            textoEncriptado.append("&");
            break;
        case  'o' :
            textoEncriptado.append("?");
            break;
        case 'u' :
            textoEncriptado.append("=");
            break;
        default:
           textoEncriptado.append(caracter);
           break;

    }


}

        return textoEncriptado.toString();

    }





    public String decifrarMensaje(String texto){

        System.out.println("Se recibe el siguiente texo : "  +  texto);


        StringBuilder textoDecifrado = new StringBuilder();

        for(int i = 0; i  < texto.length(); i++ ){
            char caracter = texto.charAt(i);
           switch (caracter) {
               case '$':
                   textoDecifrado.append("a");
                   break;
               case '%':
                   textoDecifrado.append("e");
                   break;
               case '&':
                   textoDecifrado.append("i");
                   break;
               case '?':
                   textoDecifrado.append("o");
                   break;
               case '=':
                   textoDecifrado.append("u");
                   break;
               default:
                   textoDecifrado.append(caracter);
                   break;


           }

        }


        return textoDecifrado.toString();
    }

}

   /*      ArrayList<String> textEncriptar = new ArrayList<>();
// Bucle encargado de agregar el texto del usuario a un Arrays
        for (int i = 0; i < texto.getTextoM().length(); i++) {
            char lets = texto.getTextoM().charAt(i);
            String caracter = Character.toString(lets);
            textEncriptar.add(caracter);
        }

 // Bucle que recorre la lista y remplaza las vocales por signos -- encriptando

        for (int i = 0; i < textEncriptar.size(); i++) {
            if (textEncriptar.get(i).equalsIgnoreCase("a")) {
                textEncriptar.set(i, "$");  // Reemplazar el elemento "a" por "$"
            } else if (textEncriptar.get(i).equalsIgnoreCase("e")) {
                textEncriptar.set(i, "%");
            } else if (textEncriptar.get(i).equalsIgnoreCase("i")) {
                textEncriptar.set(i, "&");
            } else if (textEncriptar.get(i).equalsIgnoreCase("o")) {
                textEncriptar.set(i, "!");
            } else if (textEncriptar.get(i).equalsIgnoreCase("u")) {
               textEncriptar.set(i, "?");
            } else if (textEncriptar.get(i).equalsIgnoreCase(" ")) {
                textEncriptar.set(i, " ");textEncriptar.get(i).equalsIgnoreCase(" ");
            }
        }
  // convierto mi ArrayList en un String -- ya el texto a sido encriptado

        String palbraEncriptada = String.join(" ", textEncriptar);
    */




  /*



        ArrayList<String> textDecifrar = new ArrayList<>();
     for(int i = 0; i  < texto.length(); i++ ){
         char lets = texto.charAt(i);
         String caracter = Character.toString(lets);
         textDecifrar.add(caracter);
     }

        for (int i = 0; i < textDecifrar.size(); i++) {
            if (textDecifrar.get(i).equalsIgnoreCase("$")) {
                textDecifrar.set(i, "a");  // Reemplazar el elemento "a" por "$"
            } else if (textDecifrar.get(i).equalsIgnoreCase("%")) {
                textDecifrar.set(i, "e");
            } else if (textDecifrar.get(i).equalsIgnoreCase("&")) {
                textDecifrar.set(i, "i");
            } else if (textDecifrar.get(i).equalsIgnoreCase("!")) {
                textDecifrar.set(i, "o");
            } else if (textDecifrar.get(i).equalsIgnoreCase("?")) {
                textDecifrar.set(i, "u");
            } else if (textDecifrar.get(i).equalsIgnoreCase(" ")) {
                textDecifrar.set(i, " ");textDecifrar.get(i).equalsIgnoreCase(" ");
            }
        }
        String palbraDecifrada = String.join(" ", textDecifrar);
 */