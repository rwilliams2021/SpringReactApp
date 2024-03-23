package com.springreact.services;

import com.springreact.models.Designer;
import com.springreact.repositories.DesignerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class DesignerService {
    @Autowired
    private DesignerRepository designerRepository;
    
    public List<Designer> getClients() {
        return (List<Designer>)designerRepository.findAll();
    }
    
    public Designer getDesigner(Long id) {
        return designerRepository.findById(id).orElseThrow(RuntimeException::new);
    }
    
    public Designer createDesigner(Designer designer) {
        return designerRepository.save(designer);
    }
    
    public Designer updateDesigner(@PathVariable Long id, @RequestBody Designer designer) {
        Designer currentDesigner = designerRepository.findById(id).orElseThrow(RuntimeException::new);
        currentDesigner.setFirstName((designer.getFirstName()));
        currentDesigner.setEmail(designer.getEmail());
        return designerRepository.save(designer);
    }
    
    public void deleteDesigner(Long id) {
        designerRepository.deleteById(id);
    }
}
