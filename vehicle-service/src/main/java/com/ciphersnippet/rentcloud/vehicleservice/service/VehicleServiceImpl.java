package com.ciphersnippet.rentcloud.vehicleservice.service;

import lk.codelabs.rentcloud.model.vehicle.Vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciphersnippet.rentcloud.vehicleservice.repository.VehicleRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 15-October-2019 06:08
 * @Project rentcloudmodel
 */
@Service
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    VehicleRepository vehicleRepository;


    @Override
    public Vehicle save(Vehicle customer) {
        return vehicleRepository.save(customer);
    }


    @Override
    public Vehicle findById(int id) {
        Optional<Vehicle> vehicle = vehicleRepository.findById(id);

        if (vehicle.isPresent())
            return vehicle.get();
        else
            return new Vehicle();

    }


    @Override
    public List<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }
}
