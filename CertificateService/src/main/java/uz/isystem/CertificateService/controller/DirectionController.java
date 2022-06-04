package uz.isystem.CertificateService.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.isystem.CertificateService.model.Direction;
import uz.isystem.CertificateService.repository.DirectionRepository;

import java.util.List;

@RestController
@RequestMapping("/certificate")
@AllArgsConstructor
public class DirectionController {
    private DirectionRepository directionService;

    public ResponseEntity<?> create(@RequestBody Direction direction){
        boolean result = directionService.create(direction);
        return ResponseEntity.ok(result);
    }

    @GetMapping("getAll")
    public ResponseEntity<?> getAll(){
        List<Direction> result = directionService.getAll();
        return ResponseEntity.ok(result);
    }
}
