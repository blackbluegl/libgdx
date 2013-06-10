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

public class btMultiSphereShapeData {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btMultiSphereShapeData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btMultiSphereShapeData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btMultiSphereShapeData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_convexInternalShapeData(btConvexInternalShapeData value) {
    gdxBulletJNI.btMultiSphereShapeData_m_convexInternalShapeData_set(swigCPtr, this, btConvexInternalShapeData.getCPtr(value), value);
  }

  public btConvexInternalShapeData getM_convexInternalShapeData() {
    long cPtr = gdxBulletJNI.btMultiSphereShapeData_m_convexInternalShapeData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btConvexInternalShapeData(cPtr, false);
  }

  public void setM_localPositionArrayPtr(btPositionAndRadius value) {
    gdxBulletJNI.btMultiSphereShapeData_m_localPositionArrayPtr_set(swigCPtr, this, btPositionAndRadius.getCPtr(value), value);
  }

  public btPositionAndRadius getM_localPositionArrayPtr() {
    long cPtr = gdxBulletJNI.btMultiSphereShapeData_m_localPositionArrayPtr_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btPositionAndRadius(cPtr, false);
  }

  public void setM_localPositionArraySize(int value) {
    gdxBulletJNI.btMultiSphereShapeData_m_localPositionArraySize_set(swigCPtr, this, value);
  }

  public int getM_localPositionArraySize() {
    return gdxBulletJNI.btMultiSphereShapeData_m_localPositionArraySize_get(swigCPtr, this);
  }

  public void setM_padding(String value) {
    gdxBulletJNI.btMultiSphereShapeData_m_padding_set(swigCPtr, this, value);
  }

  public String getM_padding() {
    return gdxBulletJNI.btMultiSphereShapeData_m_padding_get(swigCPtr, this);
  }

  public btMultiSphereShapeData() {
    this(gdxBulletJNI.new_btMultiSphereShapeData(), true);
  }

}
