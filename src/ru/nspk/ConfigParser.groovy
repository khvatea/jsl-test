package ru.nspk

import org.yaml.snakeyaml.Yaml

class ConfigParser {
   def yaml
   def data

   // Получить yaml контент из строковой переменной
   def parseYamlContent(String yamlContent) {
      yaml = new Yaml()
      data = yaml.load(yamlContent)
      return data
   }

   // Получить yaml контент из файла (используется getResource, что позволяет забирать файл из ресурсов проекта "resources")
   def parseYamlFile(String yamlFile) {
      yaml = new Yaml()
      InputStream inputStream = this.getClass()
                                    .getClassLoader()
                                    .getResourceAsStream(yamlFile);
      
      if (inputStream == null) {
         throw new FileNotFoundException("Resource not found: " + yamlFile);
      }

      data = yaml.load(inputStream)
      // println(data)
      return data
   }
}
