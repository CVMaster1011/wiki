package com.longlong.wiki.service;

import com.longlong.wiki.domain.Ebook;
import com.longlong.wiki.domain.EbookExample;
import com.longlong.wiki.mapper.EbookMapper;
import com.longlong.wiki.req.EbookReq;
import com.longlong.wiki.resp.EbookResp;
import com.longlong.wiki.util.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {
    @Resource
//    @Autowired
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
        
//        List<EbookResp> respList = new ArrayList<>();
//        for (Ebook ebook : ebookList) {
////            EbookResp ebookResp = new EbookResp();
//            EbookResp ebookResp = CopyUtil.copy(ebook, EbookResp.class);
////            BeanUtils.copyProperties(ebook, ebookResp);
//            respList.add(ebookResp);
//        }
        List<EbookResp> list = CopyUtil.copyList(ebookList, EbookResp.class);
        return list;
    }
}
