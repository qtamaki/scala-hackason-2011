package com.qtamaki.hackason

import processing.core.PApplet
import processing.core.PConstants._

class Ro3D extends PApplet {

  var count = 0
  
  override def setup() {
    size(400,400, P3D)
    colorMode(RGB, 255)
    //background(255,255,255)
    //noStroke()
    
    
  }

  override def draw() {
    background(0)
    lights
    translate(width/2, height/2, 0)
    rotateX(PI/5 * count * 0.05f)
    rotateY(PI/5 * count * 0.03f)
    rotateZ(PI/5 * count * 0.01f)
    fill(255,0,0)
    box(100,100,100)
    //sphere(50)
    translate(0,0,-65)
    fill(0,255,0)
    box(30)
    translate(0,-65,65)
    fill(0,255,0)
    box(30)
    translate(-65,65,0)
    fill(0,255,0)
    box(30)
    translate(65,0,65)
    fill(0,255,0)
    box(30)
    translate(0,65,-65)
    fill(0,255,0)
    box(30)
    translate(65,-65,0)
    fill(0,255,0)
    box(30)
    count += 2
    
  }

}