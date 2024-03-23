package com.springreact.controllers;

import com.springreact.models.Designer;
import com.springreact.services.DesignerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/designer")
public class DesignerController {
    private final DesignerService designerService;
    
    public DesignerController(DesignerService designerService) {
        this.designerService = designerService;
    }
    
    @GetMapping
    public List<Designer> getDesigners() {
        return designerService.getClients();
    }
    
    @GetMapping("/{id}")
    public Designer getDesigner(@PathVariable Long id) {
        return designerService.getDesigner(id);
    }
    
    @PostMapping
    public ResponseEntity createDesigner(@RequestBody Designer designer) throws URISyntaxException {
        Designer savedDesigner = designerService.createDesigner(designer);
        return ResponseEntity.created(new URI("/clients/" + savedDesigner.getId())).body(savedDesigner);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity updateDesigner(@PathVariable Long id, @RequestBody Designer designer) {
        Designer currentDesigner = designerService.updateDesigner(id, designer);
        return ResponseEntity.ok(currentDesigner);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity deleteDesigner(@PathVariable Long id) {
        designerService.deleteDesigner(id);
        return ResponseEntity.ok().build();
    }
}
