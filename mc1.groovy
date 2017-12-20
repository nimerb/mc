artifactory('Artifactory1') {

  localRepository('docker-local') {
   description "Made by script from git to MC "
  includesPattern "**/*"
  excludesPattern "" 
  repoLayoutRef "simple-default"
  archiveBrowsingEnabled false
  blackedOut false 
  packageType "docker"
  }

}