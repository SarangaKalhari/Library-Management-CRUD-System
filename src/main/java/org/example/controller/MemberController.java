package org.example.controller;

import org.example.model.entity.Member;
import org.example.service.MemberService;
import org.springframework.web.bind.annotation.*;

@RestController
public class MemberController {

    MemberService memberService = new MemberService();

    @GetMapping
    public String hello(){
        return "Hello";
    }

    @PostMapping("/add")
    public void addMember(@RequestBody Member member){
        memberService.addMember(member);
    }

    @PostMapping("/update")
    public void updateMember(@RequestBody Member member){
        memberService.updateMember(member);
    }

    @DeleteMapping("/delete")
    public void deleteMember(@RequestBody String id){
        memberService.deleteMember(id);
    }

    @GetMapping("/search/{id}")
    public Member searchMember(@PathVariable String id){
        return memberService.searchMember(id);
    }


}
