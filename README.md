# android-sonar-kotlin
Sample project for usage of sonar kotlin plugin

1. Setup Sonarqube 6.7 with Kotlin plugin
2. Install Sonarqube Jacoco plugin: https://docs.sonarqube.org/display/PLUG/JaCoCo+Plugin
2. Setup your project
3. Run command (executes tests, generates report and starts sonar):
```
./gradlew clean sonarqube
``` 

### To run Sonarqube with docker go to [sonarqube](sonarqube) directory and run:

```bash
docker-compose build
docker-compose up
```