package com.example.jpasample.api;

import java.util.List;
import java.util.stream.Collectors;

import com.example.jpasample.domain.Member;
import com.example.jpasample.service.MemberService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MemberController {
  private final MemberService memberService;

  @GetMapping("api/v1/member")
  public List<MemberDto> getMember() {
    List<Member> members = memberService.getMember();

    List<MemberDto> collect = members.stream().map(member -> new MemberDto(member.getId(), member.getName()))
        .collect(Collectors.toList());

    return collect;
  }

  @Data
  static class MemberDto {
    public MemberDto(Long id, String name) {
      this.id = id;
      this.name = name;
    }

    private Long id;
    private String name;

  }
}
