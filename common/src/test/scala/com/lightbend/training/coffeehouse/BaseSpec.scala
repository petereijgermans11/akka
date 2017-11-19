/**
 * Copyright © 2014 - 2016 Lightbend, Inc. All rights reserved. [http://www.lightbend.com]
 */

package com.lightbend.training.coffeehouse

import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.{Inspectors, Matchers, WordSpec}

abstract class BaseSpec extends WordSpec with Matchers with TypeCheckedTripleEquals with Inspectors
