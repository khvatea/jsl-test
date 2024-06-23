import ru.nspk.SampleClass

def call() {
  def sampleClass = new SampleClass()
  def sampleYaml =  """
    key1: value1
    key2: value2
    """

  echo "Hello!"

  println(sampleClass.parseYamlContent(sampleYaml))
}