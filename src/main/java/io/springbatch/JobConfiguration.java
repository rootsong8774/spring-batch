package io.springbatch;

import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*@Configuration
@RequiredArgsConstructor
public class JobConfiguration {

    private final JobBuilderFactory jobBuilderFactory;
    private final StepBuilderFactory stepBuilderFactory;
    
    @Bean
    public Job job() {
        return jobBuilderFactory.get("job")
            .start(step1())
            .next(step2())
            .next(step3())
            .next(step4())
            .build();
    }
    
   
    
    @Bean
    public Step step1() {
        return stepBuilderFactory.get("step1")
            .tasklet((contribution, chunkContext) -> {
                System.out.println("step1 was executed");
                JobParameters jobParameters = contribution.getStepExecution().getJobExecution()
                    .getJobParameters();
                System.out.println("name = "+ jobParameters.getString("name"));
                System.out.println("seq = "+jobParameters.getLong("seq"));
                System.out.println("date = " +jobParameters.getDate("date"));
                System.out.println("age = " +jobParameters.getDouble("age"));
    
                Map<String, Object> jobParameters1 = chunkContext.getStepContext()
                    .getJobParameters();
                return RepeatStatus.FINISHED;
            })
            .build();
    }
    
    @Bean
    public Step step2() {
        return stepBuilderFactory.get("step2")
            .tasklet((contribution, chunkContext) -> {
                System.out.println("step2 was executed");
//                throw new RuntimeException("step2 failed");
                return RepeatStatus.FINISHED;
            })
            .build();
    }
    
    @Bean
    public Step step3() {
        return stepBuilderFactory.get("step3")
            .tasklet(new CustomTasklet())
            .build();
    }
    
    @Bean
    public Step step4() {
        return stepBuilderFactory.get("step4")
            .tasklet(null)
            .build();
    }
}*/
