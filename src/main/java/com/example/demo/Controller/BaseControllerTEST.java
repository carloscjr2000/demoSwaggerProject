package com.example.demo.Controller;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseControllerTEST {
    @GetMapping(value = "api/teste")
    public ResponseEntity<?> getTest() {
        String returnMSG = "Isso é uma string de teste";

        return ResponseEntity.ok().body(returnMSG);
    }

    @DeleteMapping(value = "api/teste/delete")
    public ResponseEntity<?> deleteTest(){
        String returnMSG = "Alguma coisa foi deletada, ou não";

        return ResponseEntity.ok().body(returnMSG);
    }
}
