package com.example.application.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/api")
public class AppController {

    Logger LOGGER = LoggerFactory.getLogger(AppController.class);

    @Operation(summary = "Create a new resource", description = "This endpoint handles POST requests to create a new resource.")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Resource created successfully"), @ApiResponse(responseCode = "400", description = "Invalid input provided")})
    @PostMapping("/post")
    public String postMethod() {
        LOGGER.info("<<<<<POST START<<<<<");
        LOGGER.info("Post method is getting called...");
        LOGGER.info("<<<<<<POST END<<<<<<");
        return "This is post method..";
    }

    @Operation(summary = "Update an existing resource", description = "This endpoint handles PUT requests to update an existing resource.")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Resource updated successfully"), @ApiResponse(responseCode = "404", description = "Resource not found")})
    @PutMapping("/put")
    public String putMethod() {
        LOGGER.info("<<<<<PUT START<<<<<");
        LOGGER.info("Put method is getting called...");
        LOGGER.info("<<<<<<PUT END<<<<<<");
        return "This is put method..";
    }

    @Operation(summary = "Retrieve resource details", description = "This endpoint handles GET requests to fetch resource details.")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Resource retrieved successfully"), @ApiResponse(responseCode = "404", description = "Resource not found")})
    @GetMapping("/get")
    public String getMethod() {
        LOGGER.info("<<<<<GET START<<<<<");
        LOGGER.info("Get method is getting called...");
        LOGGER.info("<<<<<<GET END<<<<<<");
        return "This is get method..";
    }

    @Operation(summary = "Delete a resource", description = "This endpoint handles DELETE requests to remove a resource.")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Resource deleted successfully"), @ApiResponse(responseCode = "404", description = "Resource not found")})
    @DeleteMapping("/delete")
    public String deleteMethod() {
        LOGGER.info("<<<<<DELETE START<<<<<");
        LOGGER.info("Delete method is getting called...");
        LOGGER.info("<<<<<<DELETE END<<<<<<");
        return "This is delete method..";
    }
}
