package springbatchlecture.lectureJob;

import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.JobParametersValidator;

public class CustomJobParametersValid implements JobParametersValidator {

    @Override
    public void validate(JobParameters jobParameters) throws JobParametersInvalidException {

        // name 키 가 없는 경우
        if (jobParameters.getString("name") == null) {
            throw new JobParametersInvalidException("name parameters is not found");
        }
    }
}
