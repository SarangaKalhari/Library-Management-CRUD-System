package org.example.service;

import org.example.model.entity.Member;
import org.example.repository.MemberRepository;

public class MemberService {
    MemberRepository memberRepository = new MemberRepository();

    public void addMember(Member member){
        memberRepository.addMember(member);
    }

    public void updateMember(Member member){
        memberRepository.updateMember(member);
    }

    public void deleteMember(String id){
        memberRepository.deleteMember(id);
    }

    public Member searchMember(String id){
       return memberRepository.searchMember(id);
    }
}
