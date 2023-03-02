def apply(String file){
  sh "kubectl apply -f ${file}"
}
