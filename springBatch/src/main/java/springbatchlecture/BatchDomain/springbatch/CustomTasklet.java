// package springbatchlecture.BatchDomain.springbatch;
//
// import org.springframework.batch.core.StepContribution;
// import org.springframework.batch.core.scope.context.ChunkContext;
// import org.springframework.batch.core.step.tasklet.Tasklet;
// import org.springframework.batch.repeat.RepeatStatus;
// import org.springframework.stereotype.Component;
//
// //@Component // 빈으로 생성해도 됨
// public class CustomTasklet implements Tasklet {
//
//     @Override
//     public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
//
//         System.out.println("step2 was executed");
//
//         return RepeatStatus.FINISHED;
//     }
// }
