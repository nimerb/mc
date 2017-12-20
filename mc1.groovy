artifactory('Artifactory1') {

  localRepository('docker-local') {
  includesPattern "**/*"
  excludesPattern "" 
  repoLayoutRef "simple-default"
  archiveBrowsingEnabled false
  blackedOut false 
  packageType "docker"
  }

}