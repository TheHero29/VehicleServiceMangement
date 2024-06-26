package com.scaler.groupproject.vehicleservicemanagement.controllers;

import com.scaler.groupproject.vehicleservicemanagement.models.ServiceType;
import com.scaler.groupproject.vehicleservicemanagement.services.ServiceTypeDataService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service-type")
public class ServiceTypeController {
    private ServiceTypeDataService serviceTypeDataService;

    public ServiceTypeController(ServiceTypeDataService serviceTypeDataService) {
        this.serviceTypeDataService = serviceTypeDataService;
    }

    @GetMapping("/{id}")
    public ServiceType getServiceTypeById(@PathVariable Long id) {
        return serviceTypeDataService.getServiceTypeById(id);
    }

    @GetMapping
    public List<ServiceType> getAllServiceTypes() {
        return serviceTypeDataService.getAllServiceTypes();
    }

    @DeleteMapping("/{id}")
    public ServiceType deleteServiceTypeById(@PathVariable Long id) {
        return serviceTypeDataService.deleteServiceTypeById(id);
    }

    @PostMapping
    public ServiceType createServiceType(@RequestBody ServiceType serviceType) {
        return serviceTypeDataService.createServiceType(serviceType);
    }
}
