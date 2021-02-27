package com.hjay.controller;




import com.hjay.po.Tag;
import com.hjay.service.BlogService;
import com.hjay.service.TagService;
import com.hjay.vo.BlogQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @Author: HJAY
 * @Description: com.hjay.controller
 * @version: 1.0
 */
@Controller
public class TagShowController {
    @Autowired
    private TagService tagServiceImpl;


    @Autowired
    private BlogService blogServiceImpl;


    @GetMapping("/tags/{id}")
    public String tags(Model model, @PageableDefault(size = 8, sort = {"updateTime"}, direction = Sort.Direction.DESC)
            @PathVariable Long id, Pageable pageable) {

        List<Tag> tags = tagServiceImpl.ListTagTop(10000);
        if (id == -1){
            id = tags.get(0).getId();
        }
        BlogQuery blogQuery = new BlogQuery();
        model.addAttribute("tags",tags);
        model.addAttribute("page",blogServiceImpl.ListBlog(id,pageable));
        model.addAttribute("avtiveTagId",id);
        return "tags";
    }

}
