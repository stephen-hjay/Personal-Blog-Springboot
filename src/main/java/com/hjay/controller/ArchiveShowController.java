package com.hjay.controller;

import com.hjay.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: HJAY
 * @Description: com.hjay.controller
 * @version: 1.0
 */
@Controller
public class ArchiveShowController {
    @Autowired
    private BlogService blogServiceImpl;


    @GetMapping("/archives")
    public String archives(Model model) {
        model.addAttribute("archiveMap", blogServiceImpl.archiveBlog());
        model.addAttribute("blogCount", blogServiceImpl.countBlog());
        return "archives";
    }
}
