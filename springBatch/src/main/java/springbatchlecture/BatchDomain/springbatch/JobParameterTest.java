// package springbatchlecture.springbatch;
//
// import java.util.Date;
//
// import org.springframework.batch.core.Job;
// import org.springframework.batch.core.JobParameter;
// import org.springframework.batch.core.JobParameters;
// import org.springframework.batch.core.JobParametersBuilder;
// import org.springframework.batch.core.launch.JobLauncher;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.ApplicationArguments;
// import org.springframework.boot.ApplicationRunner;
// import org.springframework.stereotype.Component;
//
// @Component
// public class JobParameterTest implements ApplicationRunner {
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
//         /**
//          * JobParametersBuilder로 파라미터를 생성
//          */
//         JobParameters parameters = new JobParametersBuilder()
//             .addString("name","user4")
//             // .addLong("seq", 2L)
//             // .addDate("date", new Date())
//             // .addDouble("age", 16.5)
//             .toJobParameters();
//
//         jobLauncher.run(job, parameters);
//     }
// }
