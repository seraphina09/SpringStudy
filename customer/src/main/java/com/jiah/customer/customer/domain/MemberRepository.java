package com.jiah.customer.customer.domain;
import com.jiah.customer.customer.domain.Member;

import java.nio.file.OpenOption;
import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);

    Optional<Member> findById(Long id);
    Optional<Member> fineByName(String name);
    List<Member> findAll();


}
