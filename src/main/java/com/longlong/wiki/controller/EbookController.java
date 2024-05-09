package com.longlong.wiki.controller;

import com.longlong.wiki.req.EbookReq;
import com.longlong.wiki.resp.CommonResp;
import com.longlong.wiki.resp.EbookResp;
import com.longlong.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

// 返回字符串
@RestController

// 返回页面
// @Controller
@RequestMapping("/ebook")
public class EbookController {


    @Resource
    private EbookService ebookService;


    @GetMapping("/list")
    public CommonResp list(EbookReq req){
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list = ebookService.list(req);
        resp.setContent(list);
        return resp;
    }
}
