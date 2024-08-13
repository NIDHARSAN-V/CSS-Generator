package com.SpringCrud.SpringApp.CController;


import com.SpringCrud.SpringApp.DTO.CustDTO;
import com.SpringCrud.SpringApp.DTO.CustSaveDTO;
import com.SpringCrud.SpringApp.DTO.CustUpdateDTO;
import com.SpringCrud.SpringApp.Service.CustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/customer")
public class CustController {

    @Autowired
    private CustService serviceobj;

@PostMapping(path = "/addcust")
    public String addCustomer(@RequestBody CustSaveDTO SaveDTObj) {

         String id = serviceobj.addCustService(SaveDTObj);
         System.out.print(SaveDTObj);
         return id;

}
@GetMapping(path ="/all")
    private List<CustDTO> getAllCust()
{
    List<CustDTO> result = serviceobj.getAllCustService();
    return result;
}

@PostMapping(path = "/update")
    private String UpdateCust(@RequestBody CustUpdateDTO UpdateDTObj) {
    String id = serviceobj.updateCustService(UpdateDTObj);
    return id+" Updated";
}


@DeleteMapping(path = "/delete/{id}")
    private String DeleteCust(@PathVariable(value = "id")int id)
{
    String res  = serviceobj.deleteCustService(id);
    System.out.println(id +"adfasdasdasdasdasd");
    return res;
}

}
