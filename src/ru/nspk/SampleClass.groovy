package ru.nspk

import org.yaml.snakeyaml.Yaml

class SampleClass {
   def yaml
   def data

   def parseYamlContent(String yamlContent) {
      yaml = new Yaml()
      data = yaml.load(yamlContent)
      return data
   }
}
