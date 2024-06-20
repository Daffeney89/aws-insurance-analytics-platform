package com.example.s3;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;

public class S3BucketSetup {
    public static void main(String[] args) {
        AmazonS3 s3Client = AmazonS3ClientBuilder.standard().build();
        String bucketName = "insurance-data-bucket";
        if (!s3Client.doesBucketExistV2(bucketName)) {
            Bucket bucket = s3Client.createBucket(bucketName);
            System.out.println("Bucket created: " + bucket.getName());
        }
    }
}
