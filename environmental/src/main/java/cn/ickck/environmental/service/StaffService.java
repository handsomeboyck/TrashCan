package cn.ickck.environmental.service;

import cn.ickck.environmental.domain.Staff;

import java.util.List;

public interface StaffService {

    String findNameById(int id);

    List<Staff>  findAllBaseInformation();

    List<Staff>  findAllSalaryInformation();

    void UpdateStaff(Staff staff);

    void DeleteStaff(Integer id);

    Integer InsertStaff(Staff staff);


    List<Staff> findAllStaff();

    List<Staff> findAllBaseInfo();

    Staff findStaffBaseInfoById(Integer id);

    Integer findStaffIdByNameAndPassword(String name,String password);

    Integer CountStaffByNameAndPassword(String name,String password);
}
