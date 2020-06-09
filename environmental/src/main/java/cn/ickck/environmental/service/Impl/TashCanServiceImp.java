package cn.ickck.environmental.service.Impl;

import cn.ickck.environmental.domain.TrashCan;
import cn.ickck.environmental.mapper.TrashCanMapper;
import cn.ickck.environmental.service.TrashCanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TashCanServiceImp implements TrashCanService {

    @Autowired
    TrashCanMapper trashCanMapper;

    @Override
    public List<TrashCan> findAllTrashCan() {
        return trashCanMapper.findAllTrashCan();
    }

    @Override
    public TrashCan findTrashCanInfoById(Integer id) {
        return  trashCanMapper.findTrashCanById(id);
    }

    @Override
    public Integer InsertTrashCan(TrashCan trashCan) {
        return  trashCanMapper.InsertTrashCan(trashCan);
    }

    @Override
    public Integer[] findAllTrashCanId() {
        return trashCanMapper.findAllTrashCanId();
    }

    @Override
    public void deleteTrashCanById(Integer id) {
        trashCanMapper.deleteTrashCan(id);
    }
}
