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

public class btSphereSphereCollisionAlgorithm extends btActivatingCollisionAlgorithm {
  private long swigCPtr;

  protected btSphereSphereCollisionAlgorithm(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btSphereSphereCollisionAlgorithm_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btSphereSphereCollisionAlgorithm obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btSphereSphereCollisionAlgorithm(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public btSphereSphereCollisionAlgorithm(btPersistentManifold mf, btCollisionAlgorithmConstructionInfo ci, btCollisionObjectWrapper col0Wrap, btCollisionObjectWrapper col1Wrap) {
    this(gdxBulletJNI.new_btSphereSphereCollisionAlgorithm__SWIG_0(btPersistentManifold.getCPtr(mf), mf, btCollisionAlgorithmConstructionInfo.getCPtr(ci), ci, btCollisionObjectWrapper.getCPtr(col0Wrap), col0Wrap, btCollisionObjectWrapper.getCPtr(col1Wrap), col1Wrap), true);
  }

  public btSphereSphereCollisionAlgorithm(btCollisionAlgorithmConstructionInfo ci) {
    this(gdxBulletJNI.new_btSphereSphereCollisionAlgorithm__SWIG_1(btCollisionAlgorithmConstructionInfo.getCPtr(ci), ci), true);
  }

}
