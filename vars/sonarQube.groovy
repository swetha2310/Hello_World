def sonarAnalysis(String Project_Name, String Sonar_URL, String Sonar_login){
      echo ${Project_Name}
      echo ${Sonar_URL}
      echo ${Sonar_login}
      sh "mvn sonar:sonar \
      -Dsonar.projectName=${Project_Name}  \
      -Dsonar.host.url=${Sonar_URL}  \
      -Dsonar.login=${Sonar_login}"
}
