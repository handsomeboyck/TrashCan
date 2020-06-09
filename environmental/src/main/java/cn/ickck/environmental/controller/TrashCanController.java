package cn.ickck.environmental.controller;

import cn.ickck.environmental.domain.JsonData;
import cn.ickck.environmental.domain.TrashCan;
import cn.ickck.environmental.service.TrashCanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TrashCanController
 * @Description TODO
 * @Author ck
 * @Date 2019/12/28 19:15
 * @Version 1.0
 **/
@RestController
@RequestMapping("/authc")
public class TrashCanController {

    @Autowired
    TrashCanService trashCanService;

    @RequestMapping("findAllTrashCanInfo")
    public JsonData findAllTrashCanInfo()
    {
        return JsonData.buildSuccess(trashCanService.findAllTrashCan());
    }

    @RequestMapping("findTrashCanInfoById")
    public JsonData findTrashCanInfoById(Integer id)
    {
        return JsonData.buildSuccess(trashCanService.findTrashCanInfoById(id));
    }

    @PostMapping("insertTrashCan")
    public  JsonData InsertTrashCan(@RequestBody TrashCan trashCan)
    {
        trashCanService.InsertTrashCan(trashCan);
        return JsonData.buildSuccess(trashCan.getId()+"号垃圾桶信息插入成功");
    }

    @RequestMapping("findAllTrahCanId")
    public JsonData findAllTrashCanId()
    {
        return JsonData.buildSuccess(trashCanService.findAllTrashCanId());
    }

    @RequestMapping("deleteTrashCanById")
    public  JsonData deleteTrashCanById(Integer id)
    {
        trashCanService.deleteTrashCanById(id);
        return JsonData.buildSuccess(id+"号垃圾桶删除成功");

    }
}
