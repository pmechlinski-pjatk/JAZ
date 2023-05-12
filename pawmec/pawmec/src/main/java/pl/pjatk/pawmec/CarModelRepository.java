package pl.pjatk.pawmec;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CarModelRepository implements DemoRepository<CarModel> {

    // Using an in-memory Map
    // to store the object data
    private Map<String, CarModel> repository;

    public CarModelRepository() {
        this.repository = new HashMap<>();
    }

    @Override
    public CarModel save(CarModel car) {
        repository.put(car.getName(), car);

        return car;
    }

    @Override
    public CarModel findCarModelByName(String name) {
        return repository.get(name);
    }
}
