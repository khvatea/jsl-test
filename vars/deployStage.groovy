import ru.nspk.ConfigParser

def call() {
  def configParser = new ConfigParser()

  // Map data = configParser.parseYamlFile("stands/prod.yml")

  def yamlContent = libraryResource "stands/prod.yml"
  Map data = configParser.parseYamlContent(yamlContent)

  echo "Hello!"

  println(data)
  println(data.deploy)
}