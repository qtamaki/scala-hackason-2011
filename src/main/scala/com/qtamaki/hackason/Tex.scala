package com.qtamaki.hackason

import processing.core.PApplet
import processing.opengl._
import processing.core.PConstants._

class Tex extends PApplet {

  override def setup(){
    size(400,400,OPENGL)
    rectMode(CENTER)
    colorMode(RGB, 255)
  }

  var count:Float = 0
  var step:Float = 2
  
  override def draw(){
    background(0)
    lights
    translate(width/2, height/2, 0)
    rotateX(PI/5 * count * 0.05f)
    rotateY(PI/5 * count * 0.03f)
    rotateZ(PI/5 * count * 0.01f)

    fill(255, 0, 0)
    box(100, 100, 100)
    translate(0, 0, -150)
    fill(0, 255, 0)
    box(30)
    count+=step
  }
  
}