
allow_scm_jenkinsfile = true

libraries{
  merge = true 
  example {
      agent = 'jnlp-agent'
  }
}

stages{
    continuous_integration{
        build
    }
}