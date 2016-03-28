package pl.info.rkluszczynski.pmf.core

import org.springframework.boot.context.properties.ConfigurationProperties

import scala.beans.BeanProperty

@ConfigurationProperties(prefix = "pmf.grid")
class GridFieldProperties {
  @BeanProperty var height: Double = 1.0
  @BeanProperty var width: Double = 1.0
}
