@echo off
echo ================
echo VAULT Short Cuts
echo ================
echo va   -^> set VAULT_ADDR=%%1            -^> va https://127.0.0.1:8200               -^> Set the vault address                             
echo vault kv get secret/kv/murali-^> vault kv get secret/kv/murali -^> vault kv get secret/kv/murali           -^> Get key value pairs from a secret                 
echo vault kv put secret/kv/murali First=Mura Last=Karu Country=UK Location=London-^> vault kv put secret/kv/murali First=Mura Last=Karu Country=UK Location=London-^> vault kv put secret/kv/murali First=Mura Last=Karu Country=UK Location=London-^> Put key value pairs in a secret                   
echo vault token revoke <new_token>-^> vault token revoke <new_token>-^> vault token revoke <new_token>          -^> Revoke a token                                    
echo vc   -^> set VAULT_CACERT=%%1          -^> vc my-vault-cert.pem                    -^> Set the vault cacerts                             
echo vi   -^> vault operator init           -^> vi                                      -^> Initialize the vault                              
echo vpd  -^> vault policy delete %%1       -^> vpd admin-policy                        -^> Delete a policy in Vault                          
echo vpf  -^> vault policy fmt %%1          -^> vpf admin-policy.hcl                    -^> Format and validate a Vault policy                
echo vpl  -^> vault policy list             -^> vpl                                     -^> List the vault policy list                        
echo vpr  -^> vault policy read %%1         -^> vpr admin-policy                        -^> Read a vault policy                               
echo vpw  -^> vault policy write %%1 %%2    -^> vpw admin-policy admin-policy.hcl       -^> Write the policy to vault                         
echo vr   -^> set VAULT_TOKEN=%%s           -^> vr hvs.zENkM2BW1IENXB0Mg7NK             -^> Set the vault root token                          
echo vs   -^> vault server -config %%1      -^> vs vault-config.hcl                     -^> Start Vault                                       
echo vs   -^> vault status                  -^> vs                                      -^> Display the vault status                          
echo vsd  -^> vault secrets disable %%1     -^> vsd secret/                             -^> Disable a secret                                  
echo vse  -^> vault secrets enable -path=%%1 %%2-^> vse secret/ kv-v2                       -^> Create a secret in a vault                        
echo vsl  -^> vault secrets list            -^> vsl                                     -^> List the secrets in a vault                       
echo vtc  -^> vault token create -policy=%%1-^> vtc admin-policy                        -^> Create a token in vault for a policy              
echo vtl  -^> vault login %%1               -^> vtl RLkSejNEWPvHQ0hKBSsSSlql            -^> Login to Vault with a token                       
echo vu   -^> vault operator unseal %%1     -^> vu hvs.zENkM2BW1IENXB0Mg7NK             -^> Unseal the Vault                                  
