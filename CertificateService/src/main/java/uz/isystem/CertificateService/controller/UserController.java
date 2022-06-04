package uz.isystem.CertificateService.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.isystem.CertificateService.model.User;
import uz.isystem.CertificateService.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/certificate")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody User user){
        boolean result = userService.create(user);
        return ResponseEntity.ok(result);
    }
    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        List<User> result =  userService.getAll();
        return ResponseEntity.ok(result);

    }
}
