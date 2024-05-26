package com.fastcampuspay.membership.adapter.in.web;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Data;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterMembershipRequest {
    private String name;

    private String address;

    private String email;

    private boolean isCorp;

}