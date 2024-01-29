#!/bin/bash 

# Change working folder
cd "$(dirname "$0")"

# Update States Test (local:remote)
curl -s -X POST -H "Content-Type: application/json" -d "@json/update.account.json" http://localhost:3000/accounts/update
