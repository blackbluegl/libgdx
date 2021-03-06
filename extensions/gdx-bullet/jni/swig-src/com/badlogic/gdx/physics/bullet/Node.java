/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class Node extends Feature {
  private long swigCPtr;

  protected Node(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.Node_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Node obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_Node(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setM_x(btVector3 value) {
    gdxBulletJNI.Node_m_x_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_x() {
    long cPtr = gdxBulletJNI.Node_m_x_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_q(btVector3 value) {
    gdxBulletJNI.Node_m_q_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_q() {
    long cPtr = gdxBulletJNI.Node_m_q_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_v(btVector3 value) {
    gdxBulletJNI.Node_m_v_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_v() {
    long cPtr = gdxBulletJNI.Node_m_v_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_f(btVector3 value) {
    gdxBulletJNI.Node_m_f_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_f() {
    long cPtr = gdxBulletJNI.Node_m_f_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_n(btVector3 value) {
    gdxBulletJNI.Node_m_n_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_n() {
    long cPtr = gdxBulletJNI.Node_m_n_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_im(float value) {
    gdxBulletJNI.Node_m_im_set(swigCPtr, this, value);
  }

  public float getM_im() {
    return gdxBulletJNI.Node_m_im_get(swigCPtr, this);
  }

  public void setM_area(float value) {
    gdxBulletJNI.Node_m_area_set(swigCPtr, this, value);
  }

  public float getM_area() {
    return gdxBulletJNI.Node_m_area_get(swigCPtr, this);
  }

  public void setM_leaf(btDbvtNode value) {
    gdxBulletJNI.Node_m_leaf_set(swigCPtr, this, btDbvtNode.getCPtr(value), value);
  }

  public btDbvtNode getM_leaf() {
    long cPtr = gdxBulletJNI.Node_m_leaf_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btDbvtNode(cPtr, false);
  }

  public void setM_battach(int value) {
    gdxBulletJNI.Node_m_battach_set(swigCPtr, this, value);
  }

  public int getM_battach() {
    return gdxBulletJNI.Node_m_battach_get(swigCPtr, this);
  }

  public Node() {
    this(gdxBulletJNI.new_Node(), true);
  }

}
