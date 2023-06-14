@echo off
echo ==================
echo AWS CLI Short Cuts
echo ==================
echo awscc-^> aws configure                 -^> awscc                                   -^> Configure AWSCLI set credentials etc.             
echo awsci-^> aws sts get-caller-identity   -^> awsci                                   -^> Check the identity of caller                      
echo awscl-^> aws lambda list-functions     -^> awscl                                   -^> List lambda funstions                             
echo awsclu-^> aws iam list-users            -^> awsclu                                  -^> List IAM users                                    
echo awscs3-^> aws s3 ls                     -^> awscs3                                  -^> List S3 buckets                                   
echo awscs3c-^> aws s3 ls %%1                 -^> awscs3c car-app-cloud-storage           -^> List S3 bucket contents                           
echo awscs3p-^> aws s3 cp %%1 %%2             -^> awscs3p s3://car-app-cloud-storage/springbootadmin-0.0.1-SNAPSHOT.jar s3://car-app-cloud-storage-2/-^> Copy S3 bucket                                    
echo awscs3r-^> aws s3api create-bucket --bucket %%1 --region %%2 --create-bucket-configuration LocationConstraint=%%2-^> awscs3r car-app-cloud-storage-2 eu-west-2-^> Create S3 bucket                                  
