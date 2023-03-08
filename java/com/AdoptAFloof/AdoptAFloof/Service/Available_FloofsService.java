package com.AdoptAFloof.AdoptAFloof.Service;

import java.util.List;
import com.AdoptAFloof.AdoptAFloof.Available_Floofs.Available_Floofs;

public interface Available_FloofsService {

  //Creating or Posting Floofs that are available for adoption
    Available_Floofs saveAvailable_Floofs(Available_Floofs available_floofs);
    
  //GET all of the players
    List<Available_Floofs>getALLAvailable_Floofs();
    
  //GET a floof by ID!
    Available_Floofs getAvailable_FloofsByID(int id);
}
