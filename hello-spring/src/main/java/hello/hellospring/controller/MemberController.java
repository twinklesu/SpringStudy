package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/*
Controller 어노테이션이 있으면, 스프링부트가 오브젝트로 만들어서 관리한다.
 = 스프링 컨테이너에서 스프링 빈이 관리된다.
 */
@Controller
public class MemberController {

    private final MemberService memberService;

    // 스프링이 실행되면 컨트롤러 오브젝트를 무조건 실행하니까.. 생성자 무조건 실행됨됨
   // 이렇게 하면 하나의 memberService가 공유됨
    @Autowired // Spring에 있는 memberService 객체와 연결해줌
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members/new")
    public String createForm() {
        return "members/createMemberForm";
    }

    @PostMapping("/members/new")
    public String create(MemberForm form) { // post되면서 form의 필드가 채워져 넘어옴
        Member member = new Member();
        member.setName(form.getName());

        memberService.join(member);

        return "redirect:/"; //홈화면으로 보냄냄
    }

    @GetMapping("/members")
    public String list(Model model) {
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members); // 뷰에 넘김
        return "members/memberList";
    }

}
