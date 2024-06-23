package ru.nspk

import org.junit.Before
import org.junit.Ignore
import org.junit.Test
import static groovy.test.GroovyAssert.*

class SampleClassTest {
  def sampleClass

  @Before
  void setUp() {
    sampleClass = new SampleClass()
  }

  @Test
  void testIncrease() {
    def actual =  """
    key1: value1
    key2: value2
    """

    Map expect = [key1: "value1", key2: "value2"]

    println(sampleClass.parseYamlContent(actual))
    
    assertEquals expect, sampleClass.parseYamlContent(actual)
  }
}