package com.darklovy.em.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class MemberController {

    @RequestMapping("/getMember")
    public String getMember() {
        return "this is getMember";
    }
}
