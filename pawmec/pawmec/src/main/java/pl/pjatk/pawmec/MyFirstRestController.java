package pl.pjatk.pawmec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/test")
public class MyFirstRestController {

    @Autowired
    CarModelRepository carModelRepository;



    @GetMapping("/hello/{someValue}")
    public ResponseEntity<String> echoValue(@PathVariable String someValue) { return ResponseEntity.ok(someValue); }

    @GetMapping("/hello?reqParam={someValue}")
    @ResponseBody
    public String echoValueReq(@RequestParam("reqParam") String someValue) { return someValue; }

    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld(@RequestParam(name="reqParam", defaultValue="Hello World") String reqParam){
        return ResponseEntity.ok(reqParam);
    }
        @GetMapping("/model")
    public CarModel getCarModel(){
        return new CarModel("NewCar", 1999, 2000);
    }
//    @PostMapping("/model")
//    public CarModel postCarModel(){
//        return new CarModel("NewCar", 9999, 2323);
//    }

//    @PostMapping("/model")
//    public CarModel postCarModel(@RequestParam("value") String value){
//        System.out.println("It's a "+value+"!");
//        return new CarModel("NewCar", 9999, 2323);
//    }

        @PostMapping("/model")
        public CarModel postCar (@RequestBody CarModel carModel){
        carModelRepository.save(new CarModel(carModel.getName(), carModel.getProductionStartYear(), carModel.getProductionEndYear()));
        return carModel;
    }

//                (@RequestBody CarModel carModel) {
//        CarModel persistedCarModel = carModelRepository.save(carModel);
//        return ResponseEntity.ok(carModel.getName());
//    }
//    public String postBody(@RequestBody String fullName) {
//        return "Hello" + fullName;
//    }
//    @ResponseBody
//    public ResponseEntity<CarModel> carModelController(@RequestParam("name") String name, @RequestParam("prodStart") int prodStart, @RequestParam("prodEnd") int prodEnd){
//        return ResponseEntity.ok(carModelRepository.save(new CarModel(name, prodStart, prodEnd)));
//    }

//        @ResponseBody
//        public String echoValueReq(@RequestParam("reqParam") String someValue) { return someValue; }



    @GetMapping("/exception")
    public void throwException(@RequestParam("errorMessage") String errorMessage) {
        throw new RuntimeException(errorMessage);
    }
    }

