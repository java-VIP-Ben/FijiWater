#!/bin/bash

# Change working folder
cd "$(dirname "$0")"

# Get Employees: (Local.remote)
curl -s -X GET http://localhost:3000/employee
