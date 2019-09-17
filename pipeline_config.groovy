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