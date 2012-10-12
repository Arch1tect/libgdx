/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;

public class HullDesc {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected HullDesc(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(HullDesc obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_HullDesc(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public HullDesc() {
    this(gdxBulletJNI.new_HullDesc__SWIG_0(), true);
  }

  public HullDesc(int flag, long vcount, btVector3 vertices, long stride) {
    this(gdxBulletJNI.new_HullDesc__SWIG_1(flag, vcount, btVector3.getCPtr(vertices), vertices, stride), true);
  }

  public HullDesc(int flag, long vcount, btVector3 vertices) {
    this(gdxBulletJNI.new_HullDesc__SWIG_2(flag, vcount, btVector3.getCPtr(vertices), vertices), true);
  }

  public boolean HasHullFlag(int flag) {
    return gdxBulletJNI.HullDesc_HasHullFlag(swigCPtr, this, flag);
  }

  public void SetHullFlag(int flag) {
    gdxBulletJNI.HullDesc_SetHullFlag(swigCPtr, this, flag);
  }

  public void ClearHullFlag(int flag) {
    gdxBulletJNI.HullDesc_ClearHullFlag(swigCPtr, this, flag);
  }

  public void setMFlags(long value) {
    gdxBulletJNI.HullDesc_mFlags_set(swigCPtr, this, value);
  }

  public long getMFlags() {
    return gdxBulletJNI.HullDesc_mFlags_get(swigCPtr, this);
  }

  public void setMVcount(long value) {
    gdxBulletJNI.HullDesc_mVcount_set(swigCPtr, this, value);
  }

  public long getMVcount() {
    return gdxBulletJNI.HullDesc_mVcount_get(swigCPtr, this);
  }

  public void setMVertices(btVector3 value) {
    gdxBulletJNI.HullDesc_mVertices_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getMVertices() {
    long cPtr = gdxBulletJNI.HullDesc_mVertices_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setMVertexStride(long value) {
    gdxBulletJNI.HullDesc_mVertexStride_set(swigCPtr, this, value);
  }

  public long getMVertexStride() {
    return gdxBulletJNI.HullDesc_mVertexStride_get(swigCPtr, this);
  }

  public void setMNormalEpsilon(float value) {
    gdxBulletJNI.HullDesc_mNormalEpsilon_set(swigCPtr, this, value);
  }

  public float getMNormalEpsilon() {
    return gdxBulletJNI.HullDesc_mNormalEpsilon_get(swigCPtr, this);
  }

  public void setMMaxVertices(long value) {
    gdxBulletJNI.HullDesc_mMaxVertices_set(swigCPtr, this, value);
  }

  public long getMMaxVertices() {
    return gdxBulletJNI.HullDesc_mMaxVertices_get(swigCPtr, this);
  }

  public void setMMaxFaces(long value) {
    gdxBulletJNI.HullDesc_mMaxFaces_set(swigCPtr, this, value);
  }

  public long getMMaxFaces() {
    return gdxBulletJNI.HullDesc_mMaxFaces_get(swigCPtr, this);
  }

}
