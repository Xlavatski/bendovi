package hr.bj2020.bendovidemo.controller;

import hr.bj2020.bendovidemo.model.Bend;
import hr.bj2020.bendovidemo.repository.BendRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BendRestController {
    @Autowired
    private BendRepo bendRepo;

    //JSON oblik
    @GetMapping("/all")
    public List<Bend> getAllBends() {
        return (List<Bend>) bendRepo.findAll();
    }

    @DeleteMapping("/del/{id}")
    public String deleteBend(@PathVariable int id) {
        bendRepo.deleteById(id);
        return "Bend sa id= " + id + " je uspješno obrisan";
    }

    @PutMapping("/update")
    public Optional<Bend> updateBend(@RequestBody Bend bend) {
        bendRepo.save(bend);
        //return bend;
        return bendRepo.findById(bend.getId());
    }
    @PostMapping("/add")
    public Bend addBend(@RequestBody Bend bend) {
        bendRepo.save(bend);
        return bend;
    }
}
