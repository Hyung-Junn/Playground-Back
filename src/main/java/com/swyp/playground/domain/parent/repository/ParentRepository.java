package com.swyp.playground.domain.parent.repository;

import com.swyp.playground.domain.parent.domain.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.reflect.Member;

public interface ParentRepository extends JpaRepository<Parent,Long> {
}
