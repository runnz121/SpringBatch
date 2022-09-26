package MiniProject1.job;


import MiniProject1.service.BatchService;
import MiniProject1.tasklet.ReadCSVTasklet;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.JobScope;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class PostJob {

    private final JobBuilderFactory jobBuilderFactory;
    private final StepBuilderFactory stepBuilderFactory;

    private final BatchService batchService;



    @Bean
    @JobScope
    public Job PostJob() {
        return jobBuilderFactory.get("postJob")
            .incrementer(new RunIdIncrementer())
            .start(step1())
           // .next(step2())
            .build();
    }

    @Bean
    public Step step1() {
        return stepBuilderFactory.get("step1")
            .tasklet(new ReadCSVTasklet(batchService))
            .build();

    }

//    @Bean
//    public Step step2() {
//
//    }

}
