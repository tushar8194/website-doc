import com.twitter.conversions.time._
import com.twitter.logging.config._
import com.twitter.ostrich.admin.config._
import com.twitter.searchbird.config._

// production mode.
new SearchbirdServiceConfig {

  // Add your own config here

  // Where your service will be exposed.
  thriftPort = 9999

  // Ostrich http admin port.  Curl this for stats, etc
  admin.httpPort = 9900

  // End user configuration

  // Expert-only: Ostrich stats and logger configuration.
  admin.statsNodes = new StatsConfig {
    reporters = new JsonStatsLoggerConfig {
      loggerName = "stats"
      serviceName = "searchbird"
    } :: new TimeSeriesCollectorConfig
  }

  loggers =
    new LoggerConfig {
      level = Level.INFO
      handlers = new FileHandlerConfig {
        filename = "/var/log/searchbird/production.log"
        roll = Policy.SigHup
      }
    } :: new LoggerConfig {
      node = "stats"
      level = Level.INFO
      useParents = false
      handlers = new FileHandlerConfig {
        filename = "stats.log"
        formatter = BareFormatterConfig
      }
    }
}
