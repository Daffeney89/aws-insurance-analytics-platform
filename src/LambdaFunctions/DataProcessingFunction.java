package com.example.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.events.KinesisEvent;

public class DataProcessingFunction {
    public void handleRequest(KinesisEvent event, Context context) {
        LambdaLogger logger = context.getLogger();
        event.getRecords().forEach(record -> {
            // Process the data
            logger.log("Processing record: " + new String(record.getKinesis().getData().array()));
        });
    }
}
