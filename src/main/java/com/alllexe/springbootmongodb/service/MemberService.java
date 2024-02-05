package com.alllexe.springbootmongodb.service;

import com.alllexe.springbootmongodb.dto.MemberDto;
import com.alllexe.springbootmongodb.model.Member;
import com.alllexe.springbootmongodb.repository.JusticeLeagueRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private final JusticeLeagueRepository justiceLeagueRepo;

    public MemberService(JusticeLeagueRepository justiceLeagueRepo) {
        this.justiceLeagueRepo = justiceLeagueRepo;
    }

    public void addMember(MemberDto memberDto) {
        Member dbMember = justiceLeagueRepo.findBySuperHeroName(memberDto.name());

        if (dbMember != null) {
            throw new RuntimeException("Member already exist");
        }
        Member memberToPersist = Member.builder().
                name(memberDto.name())
                .location(memberDto.location())
                .superPower(memberDto.superPower())
                .build();
        justiceLeagueRepo.insert(memberToPersist);
    }
}
