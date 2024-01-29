#!/bin/bash

#Change working directory
cd "$(dirname "$0")"

# Delete (local:remote)
curl -s -X DELETE -H "Content-Type: application/json" -d "@json/delete.account.json" http://localhost:3000/accounts/delete/:id
