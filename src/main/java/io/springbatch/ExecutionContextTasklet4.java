package io.springbatch;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.stereotype.Component;

@Component
public class ExecutionContextTasklet4 implements Tasklet {
    
    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) {
        
        System.out.println("name: "+ chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext().get("user"));
        System.out.println("step4 was executed!");
        return RepeatStatus.FINISHED;
    }
}
