package com.AdoptAFloof.AdoptAFloof.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.AdoptAFloof.AdoptAFloof.Available_Floofs.Available_Floofs;
import com.AdoptAFloof.AdoptAFloof.Exception.ResourceNotFoundException;
import com.AdoptAFloof.AdoptAFloof.Repository.FR;

@Service
public class Available_FloofsServiceImpl implements Available_FloofsService {
  private FR fr;//fr = Floof Repository
  
  @Autowired
  public Available_FloofsServiceImpl(FR fr) {
    super();
    this.fr = fr;
  }
  
  //Save Available Floofs
  @Override
  public Available_Floofs saveAvailable_Floofs(Available_Floofs available_floofs) {
    return fr.save(available_floofs);
  }

  //get all available floofs
  @Override
  public List<Available_Floofs> getALLAvailable_Floofs() {
    return fr.findAll();
  }
//Get floof by ID!
  @Override
  public Available_Floofs getAvailable_FloofsByID(int id) {
    return fr.findById(id).orElseThrow(() -> 
    new ResourceNotFoundException("Available_Floofs", "ID", id)
        );
  }
}
