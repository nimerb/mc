artifactory('Artifactory1') {

  localRepository('docker-local') {
  includesPattern "**/*"
  excludesPattern "" 
  repoLayoutRef "docker-default"
  archiveBrowsingEnabled false
  blackedOut false 
  packageType "docker"
  }

}