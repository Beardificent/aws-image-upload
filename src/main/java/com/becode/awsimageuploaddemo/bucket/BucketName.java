package com.becode.awsimageuploaddemo.bucket;

public enum BucketName {
    PROFILE_IMAGE("becode-image-upload");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
