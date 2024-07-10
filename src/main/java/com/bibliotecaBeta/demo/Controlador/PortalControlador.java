package com.bibliotecaBeta.demo.Controlador;

import com.bibliotecaBeta.demo.Clases.TextoAEncriptar;
import com.bibliotecaBeta.demo.servicioEncripto.MotorEncriptador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class PortalControlador {

    @Autowired
    MotorEncriptador motor;
    @GetMapping("/")
    public String index(ModelMap model){
        model.addAttribute("data",new TextoAEncriptar());
        return "index.html";
    }

    @PostMapping("/recibirMensaje")
    public String recibirMensajeEncriptar(@ModelAttribute("data")  TextoAEncriptar data,  ModelMap model){
    String recibeMensaje = data.getTextoM();
    String mensajeRecibido =  motor.encriptandoTexto(data);
    model.addAttribute("mensaje",  mensajeRecibido);
    model.addAttribute("data",new TextoAEncriptar());
    return "mensajeEncriptado.html";

    }

 @GetMapping("/encriptado")
    public String mensajeEncriptado(@ModelAttribute("data") TextoAEncriptar data, ModelMap model, MotorEncriptador motor){
    String mensajeRecibido =  motor.encriptandoTexto(data);
    model.addAttribute("mensaje", mensajeRecibido);
    return "mensajeEncriptado.html";

 }

 @PostMapping("/recibirEncriptado")
    public  String recibirCifrado(@RequestParam("textoM") String textoM, ModelMap model ){
     System.out.println("dassssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
     System.out.println(  "QUE RECIBE" + textoM.toString());
        String mensajeCifrado = motor.decifrarMensaje(textoM);
        model.addAttribute("mensajeCifrado", mensajeCifrado);
        return "mensajeEncriptado.html";
 }



}
