package com.example.ds_project.controllers;

import com.example.ds_project.models.ToyInformation;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    @MessageMapping("/cart")
    public ToyInformation sendToyInformation(@Payload ToyInformation toyInformation){
        //todo get toy information data and send it back to the client
        return new ToyInformation(1,"Lego","Plastic building locks",200,2020 ,1234);
    }
/*
    @PostMapping(path="/id") // Map ONLY POST Requests
    public @ResponseBody String addNewId (@RequestParam String name
            , @RequestParam Integer code) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        ToyIdentificationDetails n = new ToyIdentificationDetails();
        n.setToy_name(name);
        n.setToy_code(code);
        identificationDetailsRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/ids")
    public @ResponseBody Iterable<ToyIdentificationDetails> getAllIds() {
        // This returns a JSON or XML with the users
        System.out.println("Found");
        return identificationDetailsRepository.findAll();
    }

    @PostMapping(path="/manufacturer") // Map ONLY POST Requests
    public @ResponseBody String addNewManufacturer (@RequestParam String companyName, @RequestParam String streetAddress, @RequestParam String country
            , @RequestParam Integer zipCode) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        ToyManufacturerDetails n = new ToyManufacturerDetails();
        n.setCompanyName(companyName);
        n.setCountry(country);
        n.setStreetAddress(streetAddress);
        n.setZipCode(zipCode);
        manufacturerInformationRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/manufacturers")
    public @ResponseBody Iterable<ToyManufacturerDetails> getAllManufacturers() {
        // This returns a JSON or XML with the users
        System.out.println("Found");
        return manufacturerInformationRepository.findAll();
    }

    @PostMapping(path="/toy") // Map ONLY POST Requests
    public @ResponseBody String addNewToy (@RequestParam String companyName, @RequestParam String toyName, @RequestParam String description
            , @RequestParam Integer price, @RequestParam Integer date, @RequestParam Integer batchNo) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        ToyInformation n = new ToyInformation();
        n.setName(toyName);
        n.setDescription(description);
        n.setPrice(price);
        n.setDateOfManufacture(date);
        n.setBatchNumber(batchNo);
        informationRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/toys")
    public @ResponseBody Iterable<ToyInformation> getAllToys() {
        // This returns a JSON or XML with the users
        System.out.println("Found");
        return informationRepository.findAll();
    }


 */
}