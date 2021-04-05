package com.example.store.api;

import javax.validation.Valid;

import com.example.store.dto.request.PublisherAddRequest;
import com.example.store.dto.response.EmptyResponse;
import com.example.store.service.PublisherAddService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/publisher")
@RequiredArgsConstructor
public class PublisherAddController {

    // ANCHOR - Declare service
    private final PublisherAddService publisherAddService;
    
    @PostMapping("/add")
    public EmptyResponse create(@Valid @RequestBody PublisherAddRequest request){

        // execute service
        publisherAddService.createNewPublisher(request);
        
        return new EmptyResponse();
    }
}
