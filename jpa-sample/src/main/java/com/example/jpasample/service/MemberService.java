package com.example.jpasample.service;

import java.util.List;

import com.example.jpasample.domain.Member;
import com.example.jpasample.repository.MemberRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {
	private final MemberRepository memberRepository;

	public List<Member> getMember() {
		return memberRepository.findAll();
	}

	public Member getMember(Long id) {
		Member findMember = memberRepository.getOne(id);
		// List<Order> orders = findMember.getOrders();
		return findMember;
	}
}
