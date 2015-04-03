package com.asiainfo.ocdc.save

import scala.beans.BeanProperty

/**
 * @author surq
 * @since 2015.4.2
 * @comment mc信令cache结构
 */
class MCStatus extends SaveStatus {

  @BeanProperty
  var eventID: Int = _
  @BeanProperty
  var time: Long = _
  @BeanProperty
  var lac: Int = _
  @BeanProperty
  var ci: Int = _
  @BeanProperty
  var imsi: Long = _
  @BeanProperty
  var imei: Long = _
}