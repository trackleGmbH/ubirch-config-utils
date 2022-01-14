package com.ubirch.util.config


import org.scalatest.featurespec.AnyFeatureSpec
import org.scalatest.matchers.should.Matchers

/**
  * author: cvandrei
  * since: 2018-03-06
  */
class EnvironmentUtilSpec extends AnyFeatureSpec
  with Matchers {

  Feature("POSTFIX_PROD") {

    Scenario("value is _-prod_") {
      EnvironmentUtil.POSTFIX_PROD shouldBe "-prod"
    }

  }

  Feature("POSTFIX_DEMO") {

    Scenario("value is _-demo_") {
      EnvironmentUtil.POSTFIX_DEMO shouldBe "-demo"
    }

  }

  Feature("POSTFIX_DEV") {

    Scenario("value is _-dev_") {
      EnvironmentUtil.POSTFIX_DEV shouldBe "-dev"
    }

  }

  Feature("POSTFIX_LOCAL") {

    Scenario("value is _-local_") {
      EnvironmentUtil.POSTFIX_LOCAL shouldBe "-local"
    }

  }

  Feature("isProd()") {

    Scenario("empty string --> false") {
      EnvironmentUtil.isProd("") shouldBe false
    }

    Scenario("postfix begins with wrong delimiter --> false") {
      EnvironmentUtil.isProd(s"ubirch${EnvironmentUtil.POSTFIX_PROD.replace("-", "_")}") shouldBe false
    }

    Scenario("postfix is _-prod_ --> true") {
      EnvironmentUtil.isProd(s"ubirch${EnvironmentUtil.POSTFIX_PROD}") shouldBe true
    }

    Scenario("postfix is _-demo_ --> false") {
      EnvironmentUtil.isProd(s"ubirch${EnvironmentUtil.POSTFIX_DEMO}") shouldBe false
    }

    Scenario("postfix is _-dev_ --> false") {
      EnvironmentUtil.isProd(s"ubirch${EnvironmentUtil.POSTFIX_DEV}") shouldBe false
    }

    Scenario("postfix is _-local_ --> false") {
      EnvironmentUtil.isProd(s"ubirch${EnvironmentUtil.POSTFIX_LOCAL}") shouldBe false
    }

  }

  Feature("isNotProd()") {

    Scenario("empty string --> true") {
      EnvironmentUtil.isNotProd("") shouldBe true
    }

    Scenario("postfix begins with wrong delimiter --> true") {
      EnvironmentUtil.isNotProd(s"ubirch${EnvironmentUtil.POSTFIX_PROD.replace("-", "_")}") shouldBe true
    }

    Scenario("postfix is _-prod_ --> false") {
      EnvironmentUtil.isNotProd(s"ubirch${EnvironmentUtil.POSTFIX_PROD}") shouldBe false
    }

    Scenario("postfix is _-demo_ --> true") {
      EnvironmentUtil.isNotProd(s"ubirch${EnvironmentUtil.POSTFIX_DEMO}") shouldBe true
    }

    Scenario("postfix is _-dev_ --> true") {
      EnvironmentUtil.isNotProd(s"ubirch${EnvironmentUtil.POSTFIX_DEV}") shouldBe true
    }

    Scenario("postfix is _-local_ --> true") {
      EnvironmentUtil.isNotProd(s"ubirch${EnvironmentUtil.POSTFIX_LOCAL}") shouldBe true
    }

  }

  Feature("isDemo()") {

    Scenario("empty string --> false") {
      EnvironmentUtil.isDemo("") shouldBe false
    }

    Scenario("postfix begins with wrong delimiter --> false") {
      EnvironmentUtil.isDemo(s"ubirch${EnvironmentUtil.POSTFIX_DEMO.replace("-", "_")}") shouldBe false
    }

    Scenario("postfix is _-prod_ --> false") {
      EnvironmentUtil.isDemo(s"ubirch${EnvironmentUtil.POSTFIX_PROD}") shouldBe false
    }

    Scenario("postfix is _-demo_ --> true") {
      EnvironmentUtil.isDemo(s"ubirch${EnvironmentUtil.POSTFIX_DEMO}") shouldBe true
    }

    Scenario("postfix is _-dev_ --> false") {
      EnvironmentUtil.isDemo(s"ubirch${EnvironmentUtil.POSTFIX_DEV}") shouldBe false
    }

    Scenario("postfix is _-local_ --> false") {
      EnvironmentUtil.isDemo(s"ubirch${EnvironmentUtil.POSTFIX_LOCAL}") shouldBe false
    }

  }

  Feature("isNotDemo()") {

    Scenario("empty string --> true") {
      EnvironmentUtil.isNotDemo("") shouldBe true
    }

    Scenario("postfix begins with wrong delimiter --> true") {
      EnvironmentUtil.isNotDemo(s"ubirch${EnvironmentUtil.POSTFIX_DEMO.replace("-", "_")}") shouldBe true
    }

    Scenario("postfix is _-prod_ --> true") {
      EnvironmentUtil.isNotDemo(s"ubirch${EnvironmentUtil.POSTFIX_PROD}") shouldBe true
    }

    Scenario("postfix is _-demo_ --> false") {
      EnvironmentUtil.isNotDemo(s"ubirch${EnvironmentUtil.POSTFIX_DEMO}") shouldBe false
    }

    Scenario("postfix is _-dev_ --> true") {
      EnvironmentUtil.isNotDemo(s"ubirch${EnvironmentUtil.POSTFIX_DEV}") shouldBe true
    }

    Scenario("postfix is _-local_ --> true") {
      EnvironmentUtil.isNotDemo(s"ubirch${EnvironmentUtil.POSTFIX_LOCAL}") shouldBe true
    }

  }

  Feature("isDev()") {

    Scenario("empty string --> false") {
      EnvironmentUtil.isDev("") shouldBe false
    }

    Scenario("postfix begins with wrong delimiter --> false") {
      EnvironmentUtil.isDev(s"ubirch${EnvironmentUtil.POSTFIX_DEV.replace("-", "_")}") shouldBe false
    }

    Scenario("postfix is _-prod_ --> false") {
      EnvironmentUtil.isDev(s"ubirch${EnvironmentUtil.POSTFIX_PROD}") shouldBe false
    }

    Scenario("postfix is _-demo_ --> false") {
      EnvironmentUtil.isDev(s"ubirch${EnvironmentUtil.POSTFIX_DEMO}") shouldBe false
    }

    Scenario("postfix is _-dev_ --> true") {
      EnvironmentUtil.isDev(s"ubirch${EnvironmentUtil.POSTFIX_DEV}") shouldBe true
    }

    Scenario("postfix is _-local_ --> false") {
      EnvironmentUtil.isDev(s"ubirch${EnvironmentUtil.POSTFIX_LOCAL}") shouldBe false
    }

  }

  Feature("isNotDev()") {

    Scenario("empty string --> true") {
      EnvironmentUtil.isNotDev("") shouldBe true
    }

    Scenario("postfix begins with wrong delimiter --> true") {
      EnvironmentUtil.isNotDev(s"ubirch${EnvironmentUtil.POSTFIX_DEV.replace("-", "_")}") shouldBe true
    }

    Scenario("postfix is _-prod_ --> true") {
      EnvironmentUtil.isNotDev(s"ubirch${EnvironmentUtil.POSTFIX_PROD}") shouldBe true
    }

    Scenario("postfix is _-demo_ --> true") {
      EnvironmentUtil.isNotDev(s"ubirch${EnvironmentUtil.POSTFIX_DEMO}") shouldBe true
    }

    Scenario("postfix is _-dev_ --> false") {
      EnvironmentUtil.isNotDev(s"ubirch${EnvironmentUtil.POSTFIX_DEV}") shouldBe false
    }

    Scenario("postfix is _-local_ --> true") {
      EnvironmentUtil.isNotDev(s"ubirch${EnvironmentUtil.POSTFIX_LOCAL}") shouldBe true
    }

  }

  Feature("isLocalDev()") {

    Scenario("empty string --> false") {
      EnvironmentUtil.isLocal("") shouldBe false
    }

    Scenario("postfix begins with wrong delimiter --> false") {
      EnvironmentUtil.isLocal(s"ubirch${EnvironmentUtil.POSTFIX_DEV.replace("-", "_")}") shouldBe false
    }

    Scenario("postfix is _-prod_ --> false") {
      EnvironmentUtil.isLocal(s"ubirch${EnvironmentUtil.POSTFIX_PROD}") shouldBe false
    }

    Scenario("postfix is _-demo_ --> false") {
      EnvironmentUtil.isLocal(s"ubirch${EnvironmentUtil.POSTFIX_DEMO}") shouldBe false
    }

    Scenario("postfix is _-dev_ --> false") {
      EnvironmentUtil.isLocal(s"ubirch${EnvironmentUtil.POSTFIX_DEV}") shouldBe false
    }

    Scenario("postfix is _-local_ --> true") {
      EnvironmentUtil.isLocal(s"ubirch${EnvironmentUtil.POSTFIX_LOCAL}") shouldBe true
    }

  }

  Feature("isNotLocal()") {

    Scenario("empty string --> true") {
      EnvironmentUtil.isNotLocal("") shouldBe true
    }

    Scenario("postfix begins with wrong delimiter --> true") {
      EnvironmentUtil.isNotLocal(s"ubirch${EnvironmentUtil.POSTFIX_LOCAL.replace("-", "_")}") shouldBe true
    }

    Scenario("postfix is _-prod_ --> true") {
      EnvironmentUtil.isNotLocal(s"ubirch${EnvironmentUtil.POSTFIX_PROD}") shouldBe true
    }

    Scenario("postfix is _-demo_ --> true") {
      EnvironmentUtil.isNotLocal(s"ubirch${EnvironmentUtil.POSTFIX_DEMO}") shouldBe true
    }

    Scenario("postfix is _-dev_ --> true") {
      EnvironmentUtil.isNotLocal(s"ubirch${EnvironmentUtil.POSTFIX_DEV}") shouldBe true
    }

    Scenario("postfix is _-local_ --> false") {
      EnvironmentUtil.isNotLocal(s"ubirch${EnvironmentUtil.POSTFIX_LOCAL}") shouldBe false
    }

  }

}
