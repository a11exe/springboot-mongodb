package com.alllexe.springbootmongodb.controller;

import com.alllexe.springbootmongodb.dto.MemberDto;
import com.alllexe.springbootmongodb.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/justiceleague")
public class JusticeLeagueManagementController {

    private final MemberService memberService;

    public JusticeLeagueManagementController(MemberService memberService) {
        this.memberService = memberService;
    }

    @ResponseBody
    @ResponseStatus(value = HttpStatus.CREATED)
    @RequestMapping(method = RequestMethod.POST, path = "/addMember", produces = {
            MediaType.APPLICATION_JSON_VALUE
    }, consumes = {
            MediaType.APPLICATION_JSON_VALUE
    })
    public void addJusticeLeagueMember(@RequestBody MemberDto memberDto) {
        memberService.addMember(memberDto);
    }
}
