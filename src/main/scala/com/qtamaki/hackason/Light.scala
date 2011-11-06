package com.qtamaki.hackason

import processing.core.PApplet
import processing.opengl._
import processing.core.PConstants._


class Light extends PApplet {

  private var ang:Float = 0
  
  override def setup(){
    size(800,800,OPENGL)
    background(0)
    noStroke()
    rectMode(CENTER)
    
  }
  
  override def draw(){
    background(0)
    pointLight(200, 200, 0, 65, 65, 100)
    pointLight(0, 0, 200, 65, -65, 100)
    translate(width/2.0f, height/2.0f, -50)
    rotateY(PApplet.radians(ang))
    rotateX(PApplet.radians(ang))
    fill(200)
    box(200,200,200)
    ang += 1
    
  }
}