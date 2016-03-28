package pl.info.rkluszczynski.pmf.runner

import javax.annotation.PostConstruct

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import pl.info.rkluszczynski.pmf.core.GridField

@Component
class Main @Autowired()(val gridField: GridField) {

  @PostConstruct
  def simulate() = {
    logger.info(gridField.toString)
  }

  private val logger = LoggerFactory.getLogger(classOf[Main])
}
