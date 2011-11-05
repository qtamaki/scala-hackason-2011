package com.qtamaki.hackason

import processing.core.PApplet
import processing.core.PConstants._

class Mouse1 extends PApplet {

  override def setup() {
    size(400,400)
    colorMode(RGB, 255)
    noStroke()
  }

  var chk = false
  
  override def mousePressed(){
	 chk = true
  }

  override def mouseReleased(){
    chk = false
  }
  
  override def draw() {
    if(chk && mouseButton == LEFT){
      fill(255,0,0)
      ellipse(mouseX, mouseY, 10, 10)
    }
    
    if(chk && mouseButton == CENTER){
      fill(0,255,0)
      ellipse(mouseX, mouseY, 10, 10)
    }
    if(chk && mouseButton == RIGHT){
      fill(0,0,255)
      ellipse(mouseX, mouseY, 10, 10)
    }
  }

}