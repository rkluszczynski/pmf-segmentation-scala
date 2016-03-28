package pl.info.rkluszczynski.pmf.core

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.ComponentScan


@ComponentScan(Array("pl.info.rkluszczynski.pmf.core"))
@EnableConfigurationProperties(Array(classOf[GridFieldProperties]))
class GridFieldAutoConfiguration {
}
