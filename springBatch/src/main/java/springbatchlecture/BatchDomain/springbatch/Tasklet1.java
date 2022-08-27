// package springbatchlecture.BatchDomain.springbatch;
//
// import org.springframework.batch.core.StepContribution;
// import org.springframework.batch.core.scope.context.ChunkContext;
// import org.springframework.batch.core.step.tasklet.Tasklet;
// import org.springframework.batch.item.ExecutionContext;
// import org.springframework.batch.repeat.RepeatStatus;
// import org.springframework.stereotype.Component;
//
// @Component
// public class Tasklet1 implements Tasklet {
//
//     @Override
//     public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
//         System.out.println("step1");
//
//         ExecutionContext jobExecutionContext = stepContribution.getStepExecution().getJobExecution().getExecutionContext();
//         ExecutionContext stepExecutionContext = stepContribution.getStepExecution().getExecutionContext();
//
//         String jobName = chunkContext.getStepContext().getStepExecution().getJobExecution().getJobInstance().getJobName();
//         String stepName = chunkContext.getStepContext().getStepExecution().getStepName();
//
//         if(jobExecutionContext.get("jobName") == null) {
//             jobExecutionContext.put("jobName", jobName);
//         }
//
//         if(stepExecutionContext.get("stepName") == null) {
//             stepExecutionContext.put("stepName", stepName);
//         }
//
//         System.out.println("jobName : " + jobExecutionContext.get("jobName"));
//         System.out.println("stepName : " + stepExecutionContext.get("stepNAme"));
//
//         /**
//          * 비동기 확인을 위한 스레드 sleep
//          */
//         Thread.sleep(3000);
//
//
//
//         return RepeatStatus.FINISHED;
//     }
// }
