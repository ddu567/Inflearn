package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional // jpa 사용 시 필요
public class MemberService {

    private final MemberRepository memberRepository;

    // MemberRepository를 new로 새로 생성하지 말고 constructor로 외부에서 넣도록 함.

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /* 회원 가입 */
    public long join(Member member) {
            validateDuplicateMember(member); // 중복 회원 검증
            memberRepository.save(member);
            return member.getId();
    }

    // ctrl + alt + shift + t => method
    // ctrl + alt + M
    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName()).ifPresent(m -> {
           throw new IllegalStateException("이미 존재하는 회원입니다.");
       });
    }

    /* 전체 회원 조회*/
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> findOne (Long memberId) {
        return memberRepository.findById(memberId);
    }
}
