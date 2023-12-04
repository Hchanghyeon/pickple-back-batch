package com.pickple.batch.game;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class JobLoggerListener extends JobExecutionListenerSupport {

    @Override
    public void afterJob(JobExecution jobExecution) {
        log.info("JOB 수행완료 {}", jobExecution);

        if (jobExecution.getStatus().equals(BatchStatus.COMPLETED)) {
            log.info("Job 성공 빌드 완료 -");
        } else {
            log.info("Job 실패 빌드 실패 -");
        }
    }
}
