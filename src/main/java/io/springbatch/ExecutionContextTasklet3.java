package io.springbatch;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.stereotype.Component;

@Component
public class ExecutionContextTasklet3 implements Tasklet {
    
    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) {
        System.out.println("step3 was executed!");
    
        Object user = chunkContext.getStepContext().getStepExecution().getJobExecution()
            .getExecutionContext().get("user");
        if (user == null) {
            chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext().put("user", "user1");
//            throw new RuntimeException("step3 was failed.");
        }
        return RepeatStatus.FINISHED;
    }
}
