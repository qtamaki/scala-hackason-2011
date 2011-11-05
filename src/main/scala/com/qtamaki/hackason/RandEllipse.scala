package com.qtamaki.hackason

import processing.core._

class RandEllipse extends PApplet {

  override def setup() {
    size(400,400)
    colorMode(PConstants.RGB, 255)
    background(0,0,0)
    noStroke()
  }

  override def draw() {
    val rr=random(10,100)
    val x=random(0,400)
    val y=random(0,400)
    val r=random(0,255)
    val g=random(0,255)
    val b=random(0,255)
    val h=random(0,255)
    
    fill(r,g,b,h)
    ellipse(x,y,rr,rr)
  }


}

object RandEllipse extends PApplet{
  
}