ui = true # UI @ 127.0.0.1:8200/ui

disable_mlock = true

storage "file" {
  path = "vault-data"
}

listener "tcp" {
  address       = "127.0.0.1:8200"
  tls_disable   = false
  tls_cert_file = "my-vault-cert.pem"
  tls_key_file  = "my-vault-key.pem"
}

api_addr = "https://127.0.0.1:8200"
cluster_addr = "https://127.0.0.1:8201"