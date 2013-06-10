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

public class btCollisionShape {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btCollisionShape(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btCollisionShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btCollisionShape(swigCPtr);
      }
      swigCPtr = 0;
    }
  }


  public static btCollisionShape newDerivedObject(long swigCPtr, boolean owner) {
    if (swigCPtr == 0) {
      return null;
    }
    
    final int shapeType = gdxBulletJNI.btCollisionShape_getShapeType(swigCPtr, null);
    
    switch (shapeType) {
    case BroadphaseNativeTypes.BOX_SHAPE_PROXYTYPE:
      return new btBoxShape(swigCPtr, owner);
    case BroadphaseNativeTypes.TRIANGLE_SHAPE_PROXYTYPE:
      return new btTriangleShape(swigCPtr, owner);
    case BroadphaseNativeTypes.TETRAHEDRAL_SHAPE_PROXYTYPE:
      return new btBU_Simplex1to4(swigCPtr, owner);
    case BroadphaseNativeTypes.CONVEX_TRIANGLEMESH_SHAPE_PROXYTYPE:
      return new btConvexTriangleMeshShape(swigCPtr, owner);
    case BroadphaseNativeTypes.CONVEX_HULL_SHAPE_PROXYTYPE:
      return new btConvexHullShape(swigCPtr, owner);
    case BroadphaseNativeTypes.CONVEX_POINT_CLOUD_SHAPE_PROXYTYPE:
      return new btConvexPointCloudShape(swigCPtr, owner);
    case BroadphaseNativeTypes.CUSTOM_POLYHEDRAL_SHAPE_TYPE:
      // TODO ?
      break;
    case BroadphaseNativeTypes.SPHERE_SHAPE_PROXYTYPE:
      return new btSphereShape(swigCPtr, owner);
    case BroadphaseNativeTypes.MULTI_SPHERE_SHAPE_PROXYTYPE:
      return new btMultiSphereShape(swigCPtr, owner);
    case BroadphaseNativeTypes.CAPSULE_SHAPE_PROXYTYPE:
      return new btCapsuleShape(swigCPtr, owner);
    case BroadphaseNativeTypes.CONE_SHAPE_PROXYTYPE:
      return new btConeShape(swigCPtr, owner);
    case BroadphaseNativeTypes.CONVEX_SHAPE_PROXYTYPE:
      return new btConvexShape(swigCPtr, owner);
    case BroadphaseNativeTypes.CYLINDER_SHAPE_PROXYTYPE:
      return new btCylinderShape(swigCPtr, owner);
    case BroadphaseNativeTypes.UNIFORM_SCALING_SHAPE_PROXYTYPE:
      return new btUniformScalingShape(swigCPtr, owner);
    case BroadphaseNativeTypes.MINKOWSKI_SUM_SHAPE_PROXYTYPE:
      // btMinkowskiSumShape is actually a MINKOWSKI_DIFFERENCE_SHAPE_PROXYTYPE and nothing
      // is one of these
      break;
    case BroadphaseNativeTypes.MINKOWSKI_DIFFERENCE_SHAPE_PROXYTYPE:
      return new btMinkowskiSumShape(swigCPtr, owner);
    case BroadphaseNativeTypes.BOX_2D_SHAPE_PROXYTYPE:
      return new btBox2dShape(swigCPtr, owner);
    case BroadphaseNativeTypes.CONVEX_2D_SHAPE_PROXYTYPE:
      return new btConvex2dShape(swigCPtr, owner);
    case BroadphaseNativeTypes.CUSTOM_CONVEX_SHAPE_TYPE:
      // TODO ?
      break;
    case BroadphaseNativeTypes.TRIANGLE_MESH_SHAPE_PROXYTYPE:
      return new btBvhTriangleMeshShape(swigCPtr, owner);
    case BroadphaseNativeTypes.SCALED_TRIANGLE_MESH_SHAPE_PROXYTYPE:
      return new btScaledBvhTriangleMeshShape(swigCPtr, owner);
    case BroadphaseNativeTypes.FAST_CONCAVE_MESH_PROXYTYPE:
      // TODO I couldn't find one
      break;
    case BroadphaseNativeTypes.TERRAIN_SHAPE_PROXYTYPE:
      return new btHeightfieldTerrainShape(swigCPtr, owner);
/*
    case BroadphaseNativeTypes.GIMPACT_SHAPE_PROXYTYPE:
      return new btGimpactShape(swigCPtr, owner);
*/
    case BroadphaseNativeTypes.MULTIMATERIAL_TRIANGLE_MESH_PROXYTYPE:
      return new btMultimaterialTriangleMeshShape(swigCPtr, owner);
    case BroadphaseNativeTypes.EMPTY_SHAPE_PROXYTYPE:
      return new btEmptyShape(swigCPtr, owner);
    case BroadphaseNativeTypes.STATIC_PLANE_PROXYTYPE:
      return new btStaticPlaneShape(swigCPtr, owner);
    case BroadphaseNativeTypes.CUSTOM_CONCAVE_SHAPE_TYPE:
      // TODO ?
      break;
    case BroadphaseNativeTypes.COMPOUND_SHAPE_PROXYTYPE:
      return new btCompoundShape(swigCPtr, owner);
/*
    case BroadphaseNativeTypes.SOFTBODY_SHAPE_PROXYTYPE:
      return new btSoftBodyShape(swigCPtr, owner);
    case BroadphaseNativeTypes.HFFLUID_SHAPE_PROXYTYPE:
      return new (swigCPtr, owner);
    case BroadphaseNativeTypes.HFFLUID_BUOYANT_CONVEX_SHAPE_PROXYTYPE:
      return new (swigCPtr, owner);
    case BroadphaseNativeTypes.INVALID_SHAPE_PROXYTYPE:
      return new (swigCPtr, owner);
*/
    }

    throw new RuntimeException("Unknown shape type " + Integer.toString(shapeType));
  }

  public void getAabb(Matrix4 t, Vector3 aabbMin, Vector3 aabbMax) {
    gdxBulletJNI.btCollisionShape_getAabb(swigCPtr, this, t, aabbMin, aabbMax);
  }

  public void getBoundingSphere(Vector3 center, SWIGTYPE_p_float radius) {
    gdxBulletJNI.btCollisionShape_getBoundingSphere(swigCPtr, this, center, SWIGTYPE_p_float.getCPtr(radius));
  }

  public float getAngularMotionDisc() {
    return gdxBulletJNI.btCollisionShape_getAngularMotionDisc(swigCPtr, this);
  }

  public float getContactBreakingThreshold(float defaultContactThresholdFactor) {
    return gdxBulletJNI.btCollisionShape_getContactBreakingThreshold(swigCPtr, this, defaultContactThresholdFactor);
  }

  public void calculateTemporalAabb(Matrix4 curTrans, Vector3 linvel, Vector3 angvel, float timeStep, Vector3 temporalAabbMin, Vector3 temporalAabbMax) {
    gdxBulletJNI.btCollisionShape_calculateTemporalAabb(swigCPtr, this, curTrans, linvel, angvel, timeStep, temporalAabbMin, temporalAabbMax);
  }

  public boolean isPolyhedral() {
    return gdxBulletJNI.btCollisionShape_isPolyhedral(swigCPtr, this);
  }

  public boolean isConvex2d() {
    return gdxBulletJNI.btCollisionShape_isConvex2d(swigCPtr, this);
  }

  public boolean isConvex() {
    return gdxBulletJNI.btCollisionShape_isConvex(swigCPtr, this);
  }

  public boolean isNonMoving() {
    return gdxBulletJNI.btCollisionShape_isNonMoving(swigCPtr, this);
  }

  public boolean isConcave() {
    return gdxBulletJNI.btCollisionShape_isConcave(swigCPtr, this);
  }

  public boolean isCompound() {
    return gdxBulletJNI.btCollisionShape_isCompound(swigCPtr, this);
  }

  public boolean isSoftBody() {
    return gdxBulletJNI.btCollisionShape_isSoftBody(swigCPtr, this);
  }

  public boolean isInfinite() {
    return gdxBulletJNI.btCollisionShape_isInfinite(swigCPtr, this);
  }

  public void setLocalScaling(Vector3 scaling) {
    gdxBulletJNI.btCollisionShape_setLocalScaling(swigCPtr, this, scaling);
  }

  public Vector3 getLocalScaling() {
	return gdxBulletJNI.btCollisionShape_getLocalScaling(swigCPtr, this);
}

  public void calculateLocalInertia(float mass, Vector3 inertia) {
    gdxBulletJNI.btCollisionShape_calculateLocalInertia(swigCPtr, this, mass, inertia);
  }

  public String getName() {
    return gdxBulletJNI.btCollisionShape_getName(swigCPtr, this);
  }

  public int getShapeType() {
    return gdxBulletJNI.btCollisionShape_getShapeType(swigCPtr, this);
  }

  public Vector3 getAnisotropicRollingFrictionDirection() {
	return gdxBulletJNI.btCollisionShape_getAnisotropicRollingFrictionDirection(swigCPtr, this);
}

  public void setMargin(float margin) {
    gdxBulletJNI.btCollisionShape_setMargin(swigCPtr, this, margin);
  }

  public float getMargin() {
    return gdxBulletJNI.btCollisionShape_getMargin(swigCPtr, this);
  }

  public void setUserPointer(SWIGTYPE_p_void userPtr) {
    gdxBulletJNI.btCollisionShape_setUserPointer(swigCPtr, this, SWIGTYPE_p_void.getCPtr(userPtr));
  }

  public SWIGTYPE_p_void getUserPointer() {
    long cPtr = gdxBulletJNI.btCollisionShape_getUserPointer(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public int calculateSerializeBufferSize() {
    return gdxBulletJNI.btCollisionShape_calculateSerializeBufferSize(swigCPtr, this);
  }

  public String serialize(SWIGTYPE_p_void dataBuffer, SWIGTYPE_p_btSerializer serializer) {
    return gdxBulletJNI.btCollisionShape_serialize(swigCPtr, this, SWIGTYPE_p_void.getCPtr(dataBuffer), SWIGTYPE_p_btSerializer.getCPtr(serializer));
  }

  public void serializeSingleShape(SWIGTYPE_p_btSerializer serializer) {
    gdxBulletJNI.btCollisionShape_serializeSingleShape(swigCPtr, this, SWIGTYPE_p_btSerializer.getCPtr(serializer));
  }

}
