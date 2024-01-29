#!/bin/bash

# Change working folder
cd "$(dirname "$0")"

# Add: (local:remote)
curl -s -X POST -H "Content-Type: application/json" -d "@json/add.account.json" http://localhost:3000/accounts/add | jq .