job "car-workflow-cloud-app-job" {
  datacenters = ["dc1"]
  type        = "service"
  group "car-workflow-cloud-app-group" {
    count = 2 // Run 2 instances
    task "car-workflow-cloud-app" {
      driver = "java" // This can be java. docker etc.
      config {
        jar_path    = "C:\\gitprojects\\car-records-app\\target\\car-records-app-0.0.1-SNAPSHOT.jar"
        jvm_options = ["-Xms256m", "-Xmx512m"]
        args        = []
      }
      resources {
        cpu    = 100 //MHz
        memory = 1024 // MB
      }
    }
  }
}