// package springbatchlecture.springbatch;
//
// import org.springframework.batch.core.Job;
// import org.springframework.batch.core.JobParameter;
// import org.springframework.batch.core.JobParameters;
// import org.springframework.batch.core.JobParametersBuilder;
// import org.springframework.batch.core.launch.JobLauncher;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.ApplicationArguments;
// import org.springframework.boot.ApplicationRunner;
// import org.springframework.boot.autoconfigure.batch.BatchProperties;
// import org.springframework.context.annotation.Configuration;
//
// /**
//  * ApplicationRunner : springBoot제공, 초기화되면 구동시점에 특정 코드를 실행시킴
//  */
// @Configuration // 빈으로 등록되어야 한다
// public class JobRunner implements ApplicationRunner {
//
//     @Autowired
//     private JobLauncher jobLauncher;
//
//     @Autowired
//     private Job job;
//
//     @Override
//     public void run(ApplicationArguments args) throws Exception {
//
//         JobParameters jobParameters = new JobParametersBuilder()
//             .addString("name", "user3")
//             .toJobParameters();
//
//         // jobLauncer는 job과 parameters를 받는다
//         jobLauncher.run(job, jobParameters);
//     }
// }
