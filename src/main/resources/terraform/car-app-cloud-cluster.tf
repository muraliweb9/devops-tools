# Provider Block
provider "aws" {
  profile = "default"
  region  = "eu-west-2"
}

# Resources Block
resource "aws_instance" "car-cloud-app-cluster-tf" {
  ami           = "ami-0e1c5be2aa956338b"
  instance_type = "t2.micro"

  tags = {
    Name = var.instance_name
  }
}