package cn.ickck.environmental.domain;

import java.util.Date;

/**
 * @ClassName Staff  员工信息类
 * @Description TODO
 * @Author ck
 * @Date 2020/1/9 16:47
 * @Version 1.0
 **/
public class Staff {
    private int id; //主键
    private   String name; //姓名
    private String telephone; //电话
    private String password; //密码
    private String basicSalary; //基本薪资
    private String attendanceForfeit; // 考勤罚款
    private String attendance;  //考勤状态
    private String attendanceAward; //考勤奖励
    private String insurance; //保险金
    private String personalTax; //个人税
    private String realWages; //真实薪资
    //考勤日期
    private String attendanceDate;
    //垃圾桶编号
    private Integer canNum;
    //员工昵称
    private String username;
    //员工状态
    private String status;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCanNum() {
        return canNum;
    }

    public void setCanNum(Integer canNum) {
        this.canNum = canNum;
    }

    public String getAttendanceForfeit() {
        return attendanceForfeit;
    }

    public void setAttendanceForfeit(String attendanceForfeit) {
        this.attendanceForfeit = attendanceForfeit;
    }

    public String getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(String attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    Date date;  //信息更新时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(String basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public String getAttendanceAward() {
        return attendanceAward;
    }

    public void setAttendanceAward(String attendanceAward) {
        this.attendanceAward = attendanceAward;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public String getPersonalTax() {
        return personalTax;
    }

    public void setPersonalTax(String personalTax) {
        this.personalTax = personalTax;
    }

    public String getRealWages() {
        return realWages;
    }

    public void setRealWages(String realWages) {
        this.realWages = realWages;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
