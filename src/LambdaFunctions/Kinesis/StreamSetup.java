package com.example.kinesis;

import com.amazonaws.services.kinesis.AmazonKinesis;
import com.amazonaws.services.kinesis.AmazonKinesisClientBuilder;
import com.amazonaws.services.kinesis.model.CreateStreamRequest;

public class StreamSetup {
    public static void main(String[] args) {
        AmazonKinesis kinesisClient = AmazonKinesisClientBuilder.standard().build();
        CreateStreamRequest createStreamRequest = new CreateStreamRequest();
        createStreamRequest.setStreamName("InsuranceDataStream");
        createStreamRequest.setShardCount(1);
        kinesisClient.createStream(createStreamRequest);
        System.out.println("Stream created: InsuranceDataStream");
    }
}
