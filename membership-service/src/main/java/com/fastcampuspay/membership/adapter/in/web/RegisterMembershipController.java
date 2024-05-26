package com.fastcampuspay.membership.adapter.in.web;

import com.fastcampuspay.membership.application.port.in.RegisterMembershipCommand;
import com.fastcampuspay.membership.application.port.in.RegisterMembershipUseCase;
import com.fastcampuspay.membership.domain.Membership;
import common.WebAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
public class  RegisterMembershipController {
    private final RegisterMembershipUseCase registerMembershipUseCase;
    @PostMapping(path = "/membership/register/")
    Membership registerMembership(@RequestBody RegisterMembershipRequest request){
        //System.out.println("Hello World");
        //request -> Command 추상화
        //Usecase
        RegisterMembershipCommand command = RegisterMembershipCommand.builder()
                .name(request.getName())
                .address(request.getAddress())
                .email(request.getEmail())
                .build();
       return registerMembershipUseCase.registerMembership(command);
    }
}
