package com.example.crudeoperation.crudoperation;

import com.example.crudeoperation.entity.DeptEntity;

import java.util.List;

public interface CrudOpearationsMethods {
    // crete department data
    public DeptEntity saveDeptInfo(DeptEntity Department);

    //update department information
    public DeptEntity updateDeptInfo(DeptEntity Department);

    // Display data
    public List<DeptEntity> findAllDeptInfo();

    // Delete data
    public void deleteDeptInfo(int Id);
}
