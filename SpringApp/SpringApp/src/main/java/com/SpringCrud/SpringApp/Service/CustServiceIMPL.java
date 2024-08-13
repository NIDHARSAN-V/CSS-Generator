package com.SpringCrud.SpringApp.Service;

import com.SpringCrud.SpringApp.CRepo.CustRepo;
import com.SpringCrud.SpringApp.DTO.CustDTO;
import com.SpringCrud.SpringApp.DTO.CustSaveDTO;
import com.SpringCrud.SpringApp.DTO.CustUpdateDTO;
import com.SpringCrud.SpringApp.Entity.Cust;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustServiceIMPL implements CustService{

    @Autowired
    private CustRepo RepoObj;



    public List<CustDTO> getAllCustService() {
        List<Cust> custList = RepoObj.findAll();
        List<CustDTO> custDTOList = new ArrayList<CustDTO>();
        for (Cust cust : custList) {

            CustDTO custDTO = new CustDTO(
                    cust.getCustid(),
                    cust.getCustname(),
                    cust.getPhone()
            );
            custDTOList.add(custDTO);
            System.out.println(custDTO);
        }
        return custDTOList;
    }

    @Override
    public String addCustService(CustSaveDTO SaveDTObj) {
        Cust custobj = new Cust(

                SaveDTObj.getCustname(),
                SaveDTObj.getPhone()
        );
        System.out.println(SaveDTObj+ " ===========In Service ");
        RepoObj.save(custobj);
         return custobj.getCustname();
    }

    @Override
    public String updateCustService(CustUpdateDTO updateDTObj) {

        String oldname;
        String newname;
        System.out.print(updateDTObj.getCustid()+"idssssssssssssssssssssssssssssssssgdfgf");
        if(RepoObj.existsById(updateDTObj.getCustid()))
        {
            Cust custobj = RepoObj.getById(updateDTObj.getCustid());

            custobj.setCustname(updateDTObj.getCustname());
            custobj.setPhone(updateDTObj.getPhone());
            RepoObj.save(custobj);
            oldname = custobj.getCustname();
            newname = updateDTObj.getCustname();
        }
        else {
            return "Sorry to say this ID not found";
        }
        return oldname+" was changerd to "+newname;


    }

    @Override
    public String deleteCustService(int id) {

        System.out.println(id +"adfasdasdasdasdasd");
        if(RepoObj.existsById(id))
        {
            RepoObj.deleteById(id);
            return "Deleted Successfully ID:" + id;
        }
        return "Data Not Found";
    }


}
