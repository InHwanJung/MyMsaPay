package com.fastcampuspay.membership.adapter.out.persistence;
import com.fastcampuspay.membership.domain.Membership;
import org.springframework.stereotype.Component;
@Component
public class MembershipMapper {
    public Membership mapToDomainEntity(
            MembershipJpaEntity membership) {
        System.out.println(membership.toString());
        return Membership.generateMember(
                new Membership.MembershipId(membership.getMembershipId()+""),
                new Membership.MembershipName(membership.getName()),
                new Membership.MembershipEmail(membership.getEmail()),
                new Membership.MembershipAddress(membership.getAddress()),
                new Membership.MembershipIsValid(membership.isValid()),
                new Membership.MembershipIsCorp(membership.isCorp())
        );
    }
}
