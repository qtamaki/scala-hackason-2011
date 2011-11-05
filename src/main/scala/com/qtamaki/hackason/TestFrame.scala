package com.qtamaki.hackason

import java.awt.Font
import javax.swing.JFrame
import java.awt.event.WindowAdapter
import java.awt.event.WindowEvent
import java.awt.event.ComponentAdapter
import java.awt.event.ComponentEvent
import java.awt.BorderLayout
import java.awt.Event
import processing.core.PApplet

class TestFrame(a: PApplet) extends JFrame {

  addWindowListener(new WindowAdapter() {
    override def windowClosing(e: WindowEvent) {
      System.exit(0);
    }
  });

  addComponentListener(new ComponentAdapter() {
    override def componentShown(e: ComponentEvent) {
      println("2")
      if (a != null)
        a.redraw();
    }
    override def componentResized(e: ComponentEvent) {
      println("3")
      if (a != null)
        a.redraw();
    }
  });

  setLayout(new BorderLayout());
  add(a, BorderLayout.CENTER);

  override def getFont(): Font = { null }

  override def postEvent(evt: Event): Boolean = { false }
}

object TestFrame extends JFrame {
}
