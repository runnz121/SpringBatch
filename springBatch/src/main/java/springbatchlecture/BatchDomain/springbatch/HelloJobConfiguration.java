// package springbatchlecture.springbatch;
//
// import org.springframework.batch.core.Job;
// import org.springframework.batch.core.Step;
// import org.springframework.batch.core.StepContribution;
// import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
// import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
// import org.springframework.batch.core.scope.context.ChunkContext;
// import org.springframework.batch.core.step.tasklet.Tasklet;
// import org.springframework.batch.repeat.RepeatStatus;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
//
// import lombok.RequiredArgsConstructor;
//
// @RequiredArgsConstructor
// @Configuration
// public class HelloJobConfiguration {
//
//     // job을 생성하는 빌더 팩토리
//     private final JobBuilderFactory jobBuilderFactory;
//
//     // step을 생성하는 빌더 팩토리
//     private final StepBuilderFactory stepBuilderFactory;
//
//     @Bean
//     public Job helloJob() {
//         return jobBuilderFactory.get("helloJob")
//             .start(helloStep1())
//             .next(helloStep2())
//             .build();
//     }
//
//     // bean으로 등록하고 public으로 등록해야 한다
//     @Bean
//     public Step helloStep2() {
//         return stepBuilderFactory.get("helloStep2")
//             // 입력 클래스로 생성
//             .tasklet(new Tasklet() {
//                 // tasklet은 기본적으로 무한 반복임 따라서 RepeatStatus로 종료를 설정할 수 있다.
//                 @Override
//                 public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws
//                     Exception {
//                     System.out.println("====================");
//                     System.out.println("Hello Spring Batch!");
//                     System.out.println("Step2");
//                     System.out.println("====================");
//                     return RepeatStatus.FINISHED;
//                 }
//             }).build();
//     }
//
//     @Bean
//     public Step helloStep1() {
//         return stepBuilderFactory.get("helloStep1")
//             .tasklet(new helloStep1Task()).build();
//     }
//
//     public static class helloStep1Task implements Tasklet {
//
//         @Override
//         public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
//
//             System.out.println("====================");
//             System.out.println("Hello Spring Batch!");
//             System.out.println("Step2");
//             System.out.println("====================");
//
//             return RepeatStatus.FINISHED;
//         }
//     }
// }
