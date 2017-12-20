repoName = userInput (
    type : "STRING"
    description : "Please provide a repository name (local already included)"
  )
 
localRepository(repoName) {
  packageType "docker"
  description "local docker releases repository"
  includesPattern "*/**"
  handleSnapshots true
  handleReleases true
  checksumPolicyType "server-generated-checksums"
}
