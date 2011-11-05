package com.qtamaki.hackason

import processing.core._

class MyPApplet extends PApplet {
  private val mywidth = 300
  private val myheight = 250
  private var i:Float = 0
  private var j:Float = 0
  override def draw() {
    background(255, 255, 255);

    fill(0);

    textSize(24);
    textAlign(PConstants.CENTER, PConstants.CENTER);

    val x = mywidth / 2f;
    val y = myheight / 2f;
    text("Hello World.", x+i, y+j);
    i += 1
    j += 1
    if(i > mywidth / 2f) i = (mywidth / -2f)
    if(j > myheight / 2f) j = (myheight / -2f)
  }

  override def setup() {
    size(mywidth, myheight);

    textFont(createFont("Default", 9));

    smooth();
//    noLoop();
  }

}

object MyPApplet extends PApplet{
 
}