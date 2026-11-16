package data.repository;

import data.model.WareHouse;

import java.util.List;
import java.util.Optional;

public interface WareHouseRepository {
    Optional<WareHouse> findById(int warehouseId);

    Optional<WareHouse> findByName(String name);

    List<WareHouse> findAll();

    List<WareHouse> findByLocation(String location);

    List<WareHouse> findActive();

    WareHouse save(WareHouse warehouse);

    void deleteById(int warehouseId);

    boolean existsByName(String name);
}
