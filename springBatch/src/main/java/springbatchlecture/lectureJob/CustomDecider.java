package springbatchlecture.lectureJob;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.job.flow.FlowExecutionStatus;
import org.springframework.batch.core.job.flow.JobExecutionDecider;

public class CustomDecider implements JobExecutionDecider {

    private int count = 0;

    @Override
    public FlowExecutionStatus decide(JobExecution jobExecution, StepExecution stepExecution) {

        count ++;

        // 분기처리에 따른 상태값 지정
        if (count % 2 == 0) {
            return new FlowExecutionStatus("EVEN"); // 상태값 지정
        } else {
            return new FlowExecutionStatus("ODD");
        }
    }
}
