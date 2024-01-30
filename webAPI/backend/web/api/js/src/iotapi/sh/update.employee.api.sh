#!/bin/bash 

# Change working folder
cd "$(dirname "$0")"

# Update Employees Test (local:remote)
curl -s -X POST -H "Content-Type: application/json" -d "@json/update.employee.json" http://localhost:3000/employee/update
