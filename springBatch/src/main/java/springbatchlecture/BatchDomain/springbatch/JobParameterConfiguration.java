// package springbatchlecture.BatchDomain.springbatch;
//
// import org.springframework.batch.core.Job;
// import org.springframework.batch.core.JobExecutionListener;
// import org.springframework.batch.core.Step;
// import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
// import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
//
// import lombok.RequiredArgsConstructor;
//
// @Configuration
// @RequiredArgsConstructor
// public class JobParameterConfiguration {
//
//     private final JobBuilderFactory jobBuilderFactory;
//     private final StepBuilderFactory stepBuilderFactory;
//     private final JobExecutionListener jobExecutionListener;
//
//     @Bean
//     public Job jobParameter() {
//         return jobBuilderFactory.get("job")
//             .start(step1())
//             .next(step2())
//             .next(step3())
//             .next(step4())
//             .listener(jobExecutionListener)
//             .build();
//     }
//
//     // @Bean
//     // public Step step1() {
//     //     return stepBuilderFactory.get("jobParameterStep1").tasklet(
//     //         new Tasklet() {
//     //             @Override
//     //             public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws
//     //                 Exception {
//     //
//     //                 JobParameters jobParameters = stepContribution.getStepExecution().getJobExecution().getJobParameters();
//     //                 jobParameters.getString("name");
//     //                 jobParameters.getLong("seq");
//     //                 jobParameters.getDate("date");
//     //                 jobParameters.getDouble("age");
//     //
//     //                 Map<String, Object> jobParameters1 = chunkContext.getStepContext().getJobParameters();
//     //
//     //                 System.out.println("jobParameterStep1");
//     //
//     //                 return RepeatStatus.FINISHED;
//     //             }
//     //         }
//     //     ).build();
//     // }
//     //
//     // @Bean
//     // public Step step2() {
//     //     return stepBuilderFactory.get("jobParameterStep2").tasklet(
//     //         new Tasklet() {
//     //             @Override
//     //             public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws
//     //                 Exception {
//     //
//     //                 System.out.println("jobParameterStep2");
//     //
//     //                 return RepeatStatus.FINISHED;
//     //             }
//     //         }
//     //     ).build();
//     // }
//
//     @Bean
//     public Step step1() {
//         return stepBuilderFactory.get("jobParameterStep1")
//             .tasklet(new Tasklet1())
//             .build();
//     }
//
//     @Bean
//     public Step step2() {
//         return stepBuilderFactory.get("jobParameterStep2")
//             .tasklet(new Tasklet2())
//             .build();
//     }
//
//     @Bean
//     public Step step3() {
//         return stepBuilderFactory.get("jobParameterStep3")
//             .tasklet(new Tasklet3())
//             .build();
//     }
//
//     @Bean
//     public Step step4() {
//         return stepBuilderFactory.get("jobParameterStep4")
//             .tasklet(new Tasklet4())
//             .build();
//     }
//
//
// }
