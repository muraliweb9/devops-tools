@echo off
echo ================
echo VAULT Short Cuts
echo ================
echo va   -^> set VAULT_ADDR=%%1            -^> va https://127.0.0.1:8200               -^> Set the vault address                             
echo vc   -^> set VAULT_CACERT=%%1          -^> vc my-vault-cert.pem                    -^> Set the vault cacerts                             
echo vf   -^> vault policy fmt %%1          -^> vf admin-policy.hcl                     -^> Format and validate a Vault policy                
echo vi   -^> vault operator init           -^> vi                                      -^> Initialize the vault                              
echo vpl  -^> vault policy list             -^> vpl                                     -^> List the vault policy list                        
echo vpr  -^> vault policy read %%1         -^> vpr admin-policy                        -^> Read a vault policy                               
echo vr   -^> set VAULT_TOKEN=%%s           -^> vr hvs.zENkM2BW1IENXB0Mg7NK             -^> Set the vault root token                          
echo vs   -^> vault server -config %%1      -^> ns vault-config.hcl                     -^> Start Vault                                       
echo vs   -^> vault status                  -^> vs                                      -^> Display the vault status                          
echo vu   -^> vault operator unseal %%1     -^> vu hvs.zENkM2BW1IENXB0Mg7NK             -^> Unseal the Vault                                  
echo vw   -^> vault policy write %%1 %%2    -^> vw admin-policy admin-policy.hcl        -^> Write the policy to vault                         
