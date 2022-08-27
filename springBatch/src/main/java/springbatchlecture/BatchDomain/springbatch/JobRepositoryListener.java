// package springbatchlecture.BatchDomain.springbatch;
//
// import org.springframework.batch.core.BatchStatus;
// import org.springframework.batch.core.ExitStatus;
// import org.springframework.batch.core.JobExecution;
// import org.springframework.batch.core.JobExecutionListener;
// import org.springframework.batch.core.JobParameters;
// import org.springframework.batch.core.JobParametersBuilder;
// import org.springframework.batch.core.StepExecution;
// import org.springframework.batch.core.repository.JobRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Component;
//
// @Component
// public class JobRepositoryListener implements JobExecutionListener {
//
//     @Autowired
//     private JobRepository jobRepository;
//
//     @Override
//     public void beforeJob(JobExecution jobExecution) {
//
//     }
//
//     @Override
//     public void afterJob(JobExecution jobExecution) {
//         String jobName = jobExecution.getJobInstance().getJobName();
//
//         // BATCH_JOB_EXECUTION_PARAMAS 에 저장되어 있는 값을 갖고 오기 위해 key, value를 입력해준다(저장되어있는 부분)
//         JobParameters jobParameters  = new JobParametersBuilder()
//             .addString("name", "user4").toJobParameters();
//
//         JobExecution lastJobExecution = jobRepository.getLastJobExecution(jobName, jobParameters);
//         if (lastJobExecution != null) {
//             for (StepExecution execution : lastJobExecution.getStepExecutions()) {
//                 BatchStatus status = execution.getStatus();
//                 System.out.println("status = " + status);
//                 ExitStatus exitStatus = execution.getExitStatus();
//                 System.out.println("exitStatus = " + exitStatus);
//                 String stepName = execution.getStepName();
//                 System.out.println("stepName = " + stepName);
//             }
//         }
//     }
// }
