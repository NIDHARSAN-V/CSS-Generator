package com.SpringCrud.SpringApp.Service;

import com.SpringCrud.SpringApp.DTO.CustDTO;
import com.SpringCrud.SpringApp.DTO.CustSaveDTO;
import com.SpringCrud.SpringApp.DTO.CustUpdateDTO;

import java.util.List;

public interface CustService {



    List<CustDTO> getAllCustService();

    String addCustService(CustSaveDTO SaveDTObj);


    String updateCustService(CustUpdateDTO updateDTObj);

    String deleteCustService(int id);
}
