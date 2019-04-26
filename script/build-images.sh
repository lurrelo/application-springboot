#!/bin/bash
docker build -t dockerluisurrelo/application-springboot:latest .
docker tag dockerluisurrelo/application-springboot:latest dockerluisurrelo/application-springboot:unittest