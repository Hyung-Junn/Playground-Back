package com.swyp.playground.domain.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swyp.playground.domain.report.domain.Report;

public interface ReportRepository extends JpaRepository<Report, Long> {
    
}
