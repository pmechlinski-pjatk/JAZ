package pl.pjatk.pawmec;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class HomeworkRestController {

    @GetMapping("/entities/{id}")
    public ResponseEntity<String> getEntityById(@PathVariable("id") String id) {
        // Logic to retrieve entity by ID
        String entity = "Entity with ID: " + id;
        return ResponseEntity.ok(entity);
    }

    @GetMapping("/entities")
    public ResponseEntity<String> getEntityByQueryParam(@RequestParam("name") String name) {
        // Logic to retrieve entity by query parameter
        String entity = "Entity with name: " + name;
        return ResponseEntity.ok(entity);
    }

    @PutMapping("/entities/{id}")
    public ResponseEntity<String> updateEntity(@PathVariable("id") String id, @RequestBody String entity) {
        // Logic to update entity by ID
        // Assuming the entity is provided as a string in the request body
        // Perform update operation here

        // Return the updated entity
        return ResponseEntity.ok(entity);
    }

    @PostMapping("/entities")
    public ResponseEntity<String> createEntity(@RequestBody String entity) {
        // Logic to create a new entity
        // Assuming the entity is provided as a string in the request body
        // Perform create operation here

        // Return the created entity
        return ResponseEntity.ok(entity);
    }

    @DeleteMapping("/entities/{id}")
    public ResponseEntity<Void> deleteEntity(@PathVariable("id") String id) {
        // Logic to delete entity by ID
        // Perform delete operation here
        System.out.println("/homework [DELETE] Code 200 - "+id);
        // Return HTTP status 200 without any body
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
