package ru.nspk

import org.junit.Before
import org.junit.Ignore
import org.junit.Test
import static groovy.test.GroovyAssert.*

class SampleClassTest {
  def configParser

  @Before
  void setVars() {
    configParser = new ConfigParser()
  }

  @Test
  void testYaml() {
    Map actual = configParser.parseYamlFile("stands/prod.yml")

    String expectDeployPlaybook = "site.yml"
    Map expectExtraVars = [var_1: "test_var_1", var_2: "test_var_2", var_3: "test_var_3"]

    assertEquals expectDeployPlaybook, actual.deploy.playbook
    assertEquals expectExtraVars, actual.deploy.extra_vars
  }
}