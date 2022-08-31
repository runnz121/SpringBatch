package springbatchlecture.lectureJob;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.job.flow.JobExecutionDecider;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class JobConfiguration {

    private final JobBuilderFactory jobBuilderFactory;
    private final StepBuilderFactory stepBuilderFactory;



    // @Bean
    // public Job batchJob1() {
    //     String[] req = {"name", "date"};
    //     String[] op = {};
    //
    //     return jobBuilderFactory.get("batchJob1")
    //         .start(step1()) // -> jobBuilder 반환
    //         .next(step2())
    //         .next(step3())
    //         .incrementer(new CustomJobParametersIncrement())
    //        // .validator(new CustomJobParametersValid())
    //         .validator(new DefaultJobParametersValidator(req, op))
    //         .preventRestart()
    //         .listener(new JobExecutionListener() {
    //             @Override
    //             public void beforeJob(JobExecution jobExecution) {
    //
    //             }
    //
    //             @Override
    //             public void afterJob(JobExecution jobExecution) {
    //
    //             }
    //         })
    //         .build();
    // }

    /**
     * flow job 적용
     * @return
     */
    // @Bean
    // public Job batchJob2() {
    //     return jobBuilderFactory.get("batchJob2")
    //         .start(flow())
    //         .next(step7())
    //         .end()
    //         .build();
    // }



//    // Flow 적용
//    @Bean
//    public Job batchJob4() {
//        return jobBuilderFactory.get("batchJob4")
//            .incrementer(new RunIdIncrementer())
//            .start(flowA())
//            .next(step3())
//            .next(flowB())
//            .next(step6())
//            .end()
//            .build();
//    }



    // decider -> exit status 에 따른 step 분기
    @Bean
    public Job batchJob7() {
        return jobBuilderFactory.get("batchJob7")
            .incrementer(new RunIdIncrementer())
            .start(step1())
            .next(decider())
            .from(decider()).on("ODD").to(step2())
            .from(decider()).on("EVEN").to(step3())
            .end()
            .build();
    }

    @Bean
    public Job batchJob8() {
        return jobBuilderFactory.get("batchJob8")
            .start(step1())
            .next(decider())
            .from(decider()).on("ODD").to(step2())
            .from(decider()).on("EVEN").to(step3())
            .end()
            .build();
    }

    public JobExecutionDecider decider() {
        return new CustomDecider();
    }

    @Bean
    public Flow flowA() {
        FlowBuilder<Flow> flowFlowBuilder = new FlowBuilder<>("flowA");
        flowFlowBuilder.start(step1())
            .next(step2())
            .end();

        return flowFlowBuilder.build();
    }

    @Bean
    public Flow flowB() {
        FlowBuilder<Flow> flowFlowBuilder = new FlowBuilder<>("flowB");
        flowFlowBuilder.start(step4())
            .next(step5())
            .end();

        return flowFlowBuilder.build();
    }


    @Bean
    public Step step1() {
        return stepBuilderFactory.get("step1")
            .tasklet(new Tasklet() {
                @Override
                public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws
                    Exception {
                    // chunkContext.getStepContext().getStepExecution().setStatus(BatchStatus.FAILED);
                    // stepContribution.setExitStatus(ExitStatus.STOPPED);
                    System.out.println("step1 finished");
                    return RepeatStatus.FINISHED;
                }
            })
            .build();
    }

    @Bean
    public Step step2() {
        return stepBuilderFactory.get("step2")
            .tasklet(new Tasklet() {
                @Override
                public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws
                    Exception {
                    System.out.println("step2 finished");
                    return RepeatStatus.FINISHED;
                }
            })
            .build();
    }

    @Bean
    public Step step3() {
        return stepBuilderFactory.get("step3")
            .tasklet((stepContribution, chunkContext) -> {
                // chunkContext.getStepContext().getStepExecution().setStatus(BatchStatus.FAILED);
                // stepContribution.setExitStatus(ExitStatus.STOPPED);
                //throw new Exception("step3 Failed");
                System.out.println("step3 has executed");
                return RepeatStatus.FINISHED;
            })
            .build();
    }

    @Bean
    public Step step4() {
        return stepBuilderFactory.get("step4")
            .tasklet((stepContribution, chunkContext) -> {
                // chunkContext.getStepContext().getStepExecution().setStatus(BatchStatus.FAILED);
                // stepContribution.setExitStatus(ExitStatus.STOPPED);
                //throw new Exception("step3 Failed");
                System.out.println("step4 has executed");
                return RepeatStatus.FINISHED;
            })
            .build();
    }



    /**
     * flow builder
     * @return
     */

    @Bean
    public Flow flow() {
        FlowBuilder<Flow> flowFlowBuilder = new FlowBuilder<>("flow");
        flowFlowBuilder.start(step5())
            .next(step6())
            .end();

        return flowFlowBuilder.build();
    }

    @Bean
    public Step step5() {
        return stepBuilderFactory.get("step5")
            .tasklet(new Tasklet() {
                @Override
                public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws
                    Exception {
                    System.out.println("step5 finished");
                    return RepeatStatus.FINISHED;
                }
            })
            .build();
    }

    @Bean
    public Step step6() {
        return stepBuilderFactory.get("step6")
            .tasklet(new Tasklet() {
                @Override
                public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws
                    Exception {
                    System.out.println("step6 finished");
                    return RepeatStatus.FINISHED;
                }
            })
            .build();
    }

    @Bean
    public Step step7() {
        return stepBuilderFactory.get("step7")
            .tasklet(new Tasklet() {
                @Override
                public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws
                    Exception {
                    System.out.println("step7 finished");
                    return RepeatStatus.FINISHED;
                }
            })
            .build();
    }

}
