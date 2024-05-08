package com.longlong.wiki.service;

import com.longlong.wiki.domain.Demo;
import com.longlong.wiki.domain.DemoExample;
import com.longlong.wiki.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoService {
    @Resource
//    @Autowired
    private DemoMapper DemoMapper;

    public List<Demo> list(){
        return DemoMapper.selectByExample(new DemoExample());
    }
}
