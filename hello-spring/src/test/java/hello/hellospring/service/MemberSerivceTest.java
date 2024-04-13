package hello.hellospring.service;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;

import hello.hellospring.domain.Member;

public class MemberSerivceTest {
	
	MemberService memberService = new MemberService();
	
	@Test
	void 회원가입() {
		// given
		Member member = new Member();
		member.setName("hello");
		
		// when
		Long saveId = memberService.join(member);
		
		// then
		Member findMember = memberService.findOne(saveId).get();
		assertThat(member.getName()).isEqualTo(findMember.getName());
	}

}
