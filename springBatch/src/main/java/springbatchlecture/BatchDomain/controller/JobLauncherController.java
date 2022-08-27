// package springbatchlecture.BatchDomain.controller;
//
// import java.util.Date;
//
// import org.springframework.batch.core.Job;
// import org.springframework.batch.core.JobParameters;
// import org.springframework.batch.core.JobParametersBuilder;
// import org.springframework.batch.core.JobParametersInvalidException;
// import org.springframework.batch.core.launch.JobLauncher;
// import org.springframework.batch.core.launch.support.SimpleJobLauncher;
// import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
// import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
// import org.springframework.batch.core.repository.JobRestartException;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.autoconfigure.batch.BasicBatchConfigurer;
// import org.springframework.core.task.SyncTaskExecutor;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
//
// import springbatchlecture.BatchDomain.domain.Member;
//
// @RestController
// @RequestMapping("/")
// public class JobLauncherController {
//
//     @GetMapping("/check")
//     public String healthCheck() {
//         return "health check";
//     }
//
//     /**
//      * 비동기 실행을 위한 컨트롤러 설정
//      */
//     @Autowired
//     private Job job;
//
//     @Autowired
//     private JobLauncher simplejobLauncher;
//
//     @Autowired
//     private BasicBatchConfigurer basicBatchConfiguar;
//
//     @PostMapping("/batch")
//     public String launch(@RequestBody Member member) throws
//         JobInstanceAlreadyCompleteException,
//         JobExecutionAlreadyRunningException,
//         JobParametersInvalidException,
//         JobRestartException {
//
//         JobParameters jobParameters = new JobParametersBuilder()
//             .addString("id", member.getId())
//             .addDate("date", new Date())
//             .toJobParameters();
//         /**
//          * 실제 객체, 프록시 객체 차이
//          */
//         // 실제 객체인 BasicBatchConfiguer를 갖고와서 타입캐스팅
//         SimpleJobLauncher jobLauncher = (SimpleJobLauncher) basicBatchConfiguar.getJobLauncher();
//         // 프록시 객체를 갖고와서 타입 캐스팅 -> 에러남
//         //SimpleJobLauncher jobLauncher = (SimpleJobLauncher) simplejobLauncher;
//
//         /**
//          *  동기, 비동기 방식 차이 -> Tasklet1에 thread 3000ms 주었음
//          */
//
//         // 동기 방식 -> 3초 지난 후 값 반환
//         jobLauncher.setTaskExecutor(new SyncTaskExecutor());
//
//         // 비동기 방식 -> 3초 지나기전에 바로 값 반환
//         //jobLauncher.setTaskExecutor(new SimpleAsyncTaskExecutor());
//         jobLauncher.run(job, jobParameters);
//
//         return "batch Completed";
//     }
//
// }
