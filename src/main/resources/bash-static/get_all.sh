#!/bin/bash

echo "Getting all JARs from S3 ...."

echo "Make sure that the S3 bucket was created with \"ACLs enabled\" ...."
echo "Make sure that the S3 bucket has \"Block all public access\" disabled...."
echo "Make sure that the file has \"Make public using ACL\" enabled...."

set -v

wget https://eobao-bucket.s3.eu-west-2.amazonaws.com/eobao-onboarding-app-0.0.1-SNAPSHOT.jar