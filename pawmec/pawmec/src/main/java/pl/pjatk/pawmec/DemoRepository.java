package pl.pjatk.pawmec;

import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository<CarModel> {
    public pl.pjatk.pawmec.CarModel save(CarModel Car);

    public CarModel findCarModelByName(String name);
}
