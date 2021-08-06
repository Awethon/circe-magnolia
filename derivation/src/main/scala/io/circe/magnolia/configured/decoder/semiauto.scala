package io.circe.magnolia.configured.decoder

import io.circe.Decoder
import io.circe.magnolia.MagnoliaDecoder
import io.circe.magnolia.configured.Configuration
import magnolia1.*
import scala.deriving.*
object semiauto:
  inline def deriveConfiguredMagnoliaDecoder[T](using
      Configuration,
      Mirror.Of[T]
  ) = MagnoliaDecoder.derived[T]
