package cn.ickck.environmental.service;

import cn.ickck.environmental.domain.TrashCan;

import java.util.List;

public interface TrashCanService {


    List<TrashCan> findAllTrashCan();

    TrashCan findTrashCanInfoById(Integer id);

    Integer InsertTrashCan(TrashCan trashCan);

    Integer[] findAllTrashCanId();

    void deleteTrashCanById(Integer id);


}
