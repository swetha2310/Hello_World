def sonarAnalysis(String Project_Name, String Sonar_URL, String Sonar_login){
      sh echo ${Project_Name}
      sh echo ${Sonar_URL}
      sh echo ${Sonar_login}
      sh "mvn sonar:sonar \
      -Dsonar.projectName=${Project_Name}  \
      -Dsonar.host.url=${Sonar_URL}  \
      -Dsonar.login=${Sonar_login}"
}
