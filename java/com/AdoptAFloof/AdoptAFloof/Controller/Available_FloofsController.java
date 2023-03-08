package com.AdoptAFloof.AdoptAFloof.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.AdoptAFloof.AdoptAFloof.Available_Floofs.Available_Floofs;
import com.AdoptAFloof.AdoptAFloof.Service.Available_FloofsService;

@RestController
@RequestMapping("/AdoptAFloof_DB/AvailableFloofs")
public class Available_FloofsController {
  
  private Available_FloofsService available_floofsService;
  @Autowired
  public Available_FloofsController(Available_FloofsService available_floofsService) {
    super();
    this.available_floofsService = available_floofsService;
  }
  //This is Creating or Posting a new Floof!
  @PostMapping()
  public ResponseEntity<Available_Floofs> savePlayer(@RequestBody Available_Floofs available_floofs){
    return new ResponseEntity<Available_Floofs>(available_floofsService.saveAvailable_Floofs(available_floofs),
        HttpStatus.CREATED);
  }
  //GETTING all available floofs
  @GetMapping
  public List<Available_Floofs> getAllAvailable_Floofs(){
    return available_floofsService.getALLAvailable_Floofs();
  }
  @GetMapping("{available_floofs_id}")
  public ResponseEntity<Available_Floofs> getAvailable_FloofsByID(@PathVariable("available_floofs_id") int available_floofsId){
    return new ResponseEntity<Available_Floofs>(available_floofsService.getAvailable_FloofsByID(available_floofsId), HttpStatus.CREATED);
  }
}
