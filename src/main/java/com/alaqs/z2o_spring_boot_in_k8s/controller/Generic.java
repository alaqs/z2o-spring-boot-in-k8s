package com.alaqs.z2o_spring_boot_in_k8s.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v0")
public class Generic {

  @GetMapping
  public ResponseEntity<String> sayHello() {
    return ResponseEntity.ok("I'm alive ... in a non-threatening way");
  }
}