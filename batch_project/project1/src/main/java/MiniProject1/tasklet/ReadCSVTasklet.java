package MiniProject1.tasklet;

import MiniProject1.service.BatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;


@RequiredArgsConstructor
public class ReadCSVTasklet implements Tasklet {

    private final BatchService batchService;

    private final static String FILE_PATH = "./data1.csv";


    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext)
        throws Exception {

        batchService.readLine(FILE_PATH);









        return RepeatStatus.FINISHED;
    }
}
