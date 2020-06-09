package cn.ickck.environmental.service.Impl;

import cn.ickck.environmental.domain.Staff;
import cn.ickck.environmental.mapper.StaffMapper;
import cn.ickck.environmental.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName StaffServiceImp
 * @Description TODO
 * @Author ck
 * @Date 2020/1/9 21:34
 * @Version 1.0
 **/
@Service
public class StaffServiceImp implements StaffService {
    @Autowired
    StaffMapper staffMapper;
    @Override
    public String findNameById(int id) {
        return staffMapper.selectById(id);
    }

    @Override
    public List<Staff> findAllBaseInformation() {
        return staffMapper.findAllStaff_attendence_information();
    }

    @Override
    public List<Staff> findAllSalaryInformation() {
        return staffMapper.findAllStaff_salary();
    }

    @Override
    public void UpdateStaff(Staff staff) {
       staffMapper.UpdateStaff(staff);
    }

    @Override
    public void DeleteStaff(Integer id) {
        staffMapper.DeleteStaff(id);
    }

    @Override
    public Integer InsertStaff(Staff staff) {
        return staffMapper.insert(staff);
    }

    @Override
    public List<Staff> findAllStaff() {
       return staffMapper.findAllStaff();
    }

    @Override
    public List<Staff> findAllBaseInfo() {
        return staffMapper.findAllStaff_BaseInfo();
    }

    @Override
    public Staff findStaffBaseInfoById(Integer id) {
        return staffMapper.findStaff_BaseInfoById(id);
    }

    @Override
    public Integer findStaffIdByNameAndPassword(String name, String password) {
        return staffMapper.findStaffIdByNameAndPWD(name,password);
    }

    @Override
    public Integer CountStaffByNameAndPassword(String name, String password) {
        return staffMapper.CountStaff(name, password);
    }
}
