package com.eee.mari.member;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/member")
public class MemberController {
	private static final Logger logger=LoggerFactory.getLogger(MemberController.class);
	@Resource
	MemberService memberService;
	
	MemberDTO memberDTO;
	
	@RequestMapping("/loginMember.do")
	public String LoginMember(Model model) {
		logger.info("/member/loginMember.jsp");
//		List list=memberService.sample();
//		model.addAttribute("list",list);
		return "tiles/member/loginMember";
	}
	
	@RequestMapping(value="/login.do")
	public ModelAndView MemberLogin(@RequestParam Map<String, String> loginMap, HttpServletRequest request, HttpServletResponse response) throws Exception {
		logger.info("/member/memberLogin");
		ModelAndView mav = new ModelAndView();
		memberDTO = memberService.memberLogin(loginMap);
		System.out.println(memberDTO!=null);
		
		if(memberDTO != null && memberDTO.getId()!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("isLogOn", true); // 로그온 플래그를 true로 지정
			session.setAttribute("memberInfo", memberDTO); //회원정보를 session에 저장
			
			List memberInfo = new ArrayList();
			memberInfo.add("번호 : " + ((MemberDTO)session.getAttribute("memberInfo")).getSeq());
			memberInfo.add("아이디 : " + ((MemberDTO)session.getAttribute("memberInfo")).getId());
			memberInfo.add("비밀번호 : " + ((MemberDTO)session.getAttribute("memberInfo")).getPwd());
			memberInfo.add("이름 : " + ((MemberDTO)session.getAttribute("memberInfo")).getName());
			memberInfo.add(((MemberDTO)session.getAttribute("memberInfo")).getJumin1());
			memberInfo.add(((MemberDTO)session.getAttribute("memberInfo")).getJumin2());
			memberInfo.add(((MemberDTO)session.getAttribute("memberInfo")).getTel());
			memberInfo.add(((MemberDTO)session.getAttribute("memberInfo")).getUa());
			memberInfo.add(((MemberDTO)session.getAttribute("memberInfo")).getUseyn());
			
			
			System.out.println(memberInfo);
			mav.setViewName("redirect:/");
		}else {
			String message = "아이디 또는 비밀번호가 틀립니다. 다시 로그인 해주세요.";
			mav.addObject("message", message);
			mav.setViewName("tiles/member/loginMember");
		}
		return mav;
	}
	
	@RequestMapping("/joinMember.do")
	public String JoinMember(Model model) {
		logger.info("/member/memberForm.jsp");
		return "tiles/member/memberForm";
	}
	
	@RequestMapping("/insertMember.do")
	public String InsertMember(Model model, MemberDTO memberDTO, HttpServletRequest request, HttpServletResponse response) throws Exception{
		logger.info("/member/InsertMember");
		response.setContentType("text/html;charset=utf-8");
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "text/html;charset=utf-8");
		memberService.insertMember(memberDTO);
		return "redirect:/member/loginMember.do";
	}
}
