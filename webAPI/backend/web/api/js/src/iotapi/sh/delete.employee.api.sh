#!/bin/bash

#Change working directory
cd "$(dirname "$0")"

# Delete (local:remote)
curl -s -X DELETE -H "Content-Type: application/json" -d "@json/delete.employee.json" http://localhost:3000/employee/delete/:id
