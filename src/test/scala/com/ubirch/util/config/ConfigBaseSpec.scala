package com.ubirch.util.config

import org.scalatest.featurespec.AnyFeatureSpec
import org.scalatest.matchers.should.Matchers

/**
  * author: cvandrei
  * since: 2018-03-07
  */
class ConfigBaseSpec extends AnyFeatureSpec
  with Matchers
  with ConfigBase {

  Feature("environmentId()") {

    Scenario("read config --> ubirch-local") {
      environmentId() shouldBe "test-local"
    }

  }

}
