package pl.info.rkluszczynski.pmf.core

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class GridField @Autowired()(val gridFieldProperties: GridFieldProperties) {

  override def toString: String = {
    gridFieldProperties.height.toString + " x " + gridFieldProperties.width.toString
  }
}
