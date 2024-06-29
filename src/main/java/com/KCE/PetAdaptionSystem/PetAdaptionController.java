package com.KCE.PetAdaptionSystem;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PetAdaptionController {

    @GetMapping("/DashBoard")
    public String getDashBoard(){
        return "DashBoard";
    }

    @GetMapping("/Pets")
    public String getPets(){
        return "Pets";
    }
}
