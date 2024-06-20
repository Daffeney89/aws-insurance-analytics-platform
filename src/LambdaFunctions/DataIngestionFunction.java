package com.example.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.events.KinesisEvent;

public class DataIngestionFunction {
    public void handleRequest(KinesisEvent event, Context context) {
        LambdaLogger logger = context.getLogger();
        event.getRecords().forEach(record -> {
            String data = new String(record.getKinesis().getData().array());
            logger.log("Data received: " + data);
            // Further processing can be added here
        });
    }
}
