docker run -d --name sonarqube -p 9000:9000 \
    -e SONAR_JDBC_URL=jdbc:posgresql://172.17.0.1:5433/sonarqube \
    -e SONAR_JDBC_USERNAME=postgres \
    -e SONAR_JDBC_PASSWORD=123 \
    sonarqube \
    -Dsonar.es.bootstrap.checks.disable=true


    #!/bin/bash
OK=$(curl -u admin:123 http://172.17.0.1:9000/api/qualitygates/project_status?projectKey=Backend | grep -Po '"status":.*?[^\\]","con')
OK="${OK/\"status\":\"}"
OK="${OK/\",\"con}"

if [ "$OK" = "OK" ]; then
    exit 0
else
    exit 1
fi
