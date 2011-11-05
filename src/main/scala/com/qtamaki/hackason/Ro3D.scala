package com.qtamaki.hackason

import processing.core.PApplet
import processing.core.PConstants

class Ro3D extends PApplet {

  var count = 0
  
  override def setup() {
    size(400,400, PConstants.P3D)
    colorMode(PConstants.RGB, 255)
    //background(255,255,255)
    //noStroke()
    
    
  }

  override def draw() {
    background(0)
    lights
    translate(width/2, height/2, 0)
    rotateX(PConstants.PI/5 * count * 0.05f)
    rotateY(PConstants.PI/5 * count * 0.03f)
    rotateZ(PConstants.PI/5 * count * 0.01f)
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