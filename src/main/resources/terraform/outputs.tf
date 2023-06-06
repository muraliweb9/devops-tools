output "instance_id" {
  description = "ID of the EC2 instance"
  value       = aws_instance.car-cloud-app-cluster-tf.id
}

output "instance_public_ip" {
  description = "Public IP address of the EC2 instance"
  value       = aws_instance.car-cloud-app-cluster-tf.public_ip
}