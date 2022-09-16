package uds.exercise.mountain.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uds.exercise.mountain.models.Mountain;
import uds.exercise.mountain.services.MountainService;
import java.util.Set;

@RestController
public class MountainController {

    private final MountainService mService;

    public MountainController(MountainService mService) {
        this.mService = mService;
    }

    @GetMapping("/all")
    public ResponseEntity<Set<Mountain>> getMountains(){
        return new ResponseEntity<>(mService.findall(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Mountain> addMountain(Mountain mount){
        mService.save(mount);
        return new ResponseEntity<>(mount, HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Long> deleteMountain(Long id){
        mService.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

    @PutMapping("/edit")
    public ResponseEntity<Mountain> updateMountain(Long id, String name){
        Mountain updateMountain = mService.findbyId(id).orElseThrow(() -> new ResourceNotFoundException("No mountain with id: " + id));
        updateMountain.setName(name);
        mService.save(updateMountain);
        return new ResponseEntity<>(updateMountain, HttpStatus.OK);
    }
}
