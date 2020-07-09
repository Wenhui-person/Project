package cn.edu.sdut.project.service.Impl;

import cn.edu.sdut.project.entity.Loss;
import cn.edu.sdut.project.mapper.LossMapper;
import cn.edu.sdut.project.service.LossService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LossServiceImpl implements LossService {

    @Resource
    private LossMapper lossMapper;

    @Override
    public List<Loss> queryLosses() {
        return this.lossMapper.queryLosses();
    }
}
