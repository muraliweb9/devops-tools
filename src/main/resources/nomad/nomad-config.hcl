server {
  enabled = true
  data_dir = "C:\\Apps\\Nomad"
}
ports {
  http = 14646
  rpc  = 14647
  serf = 14648
}
client {
  enabled = true
}
consul {
  address = "localhost:8501"
}
log_level = "INFO"
log_file = "C:\\Apps\\Nomad\\nomad.log"