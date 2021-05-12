package de.sedoox.corona.web.Controller;

import de.sedoox.corona.web.Model.PDF;
import de.sedoox.corona.web.Model.User;
import de.sedoox.corona.web.MyUserDetails;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/corona")
public class CoronaController {


    @CrossOrigin("http://127.0.0.1:5500/")
    @GetMapping
    public PDF getIndex(Authentication authentication) {
        MyUserDetails userDetails = (MyUserDetails) authentication.getPrincipal();
        User user = userDetails.getUser();
        Date now = new Date();

        PDF pdf = new PDF();
        pdf.setName(user.getFullName());
        pdf.setGeburtstag(user.getGeburtstag());
        pdf.setStadt(user.getStadt());
        pdf.setPlz(user.getStadt());
        pdf.setStreet(user.getStreet());

        return pdf;
    }


}
