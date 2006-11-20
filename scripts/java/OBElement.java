/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.30
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class OBElement {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected OBElement(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OBElement obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      openbabelJNI.delete_OBElement(swigCPtr);
    }
    swigCPtr = 0;
  }

  public OBElement() {
    this(openbabelJNI.new_OBElement__SWIG_0(), true);
  }

  public OBElement(int num, String sym, double rcov, double rvdw, int maxbo, double mass, double elNeg, double ionize, double elAffin, double red, double green, double blue, String name) {
    this(openbabelJNI.new_OBElement__SWIG_1(num, sym, rcov, rvdw, maxbo, mass, elNeg, ionize, elAffin, red, green, blue, name), true);
  }

  public int GetAtomicNum() {
    return openbabelJNI.OBElement_GetAtomicNum(swigCPtr, this);
  }

  public String GetSymbol() {
    return openbabelJNI.OBElement_GetSymbol(swigCPtr, this);
  }

  public double GetCovalentRad() {
    return openbabelJNI.OBElement_GetCovalentRad(swigCPtr, this);
  }

  public double GetVdwRad() {
    return openbabelJNI.OBElement_GetVdwRad(swigCPtr, this);
  }

  public double GetMass() {
    return openbabelJNI.OBElement_GetMass(swigCPtr, this);
  }

  public int GetMaxBonds() {
    return openbabelJNI.OBElement_GetMaxBonds(swigCPtr, this);
  }

  public double GetElectroNeg() {
    return openbabelJNI.OBElement_GetElectroNeg(swigCPtr, this);
  }

  public double GetIonization() {
    return openbabelJNI.OBElement_GetIonization(swigCPtr, this);
  }

  public double GetElectronAffinity() {
    return openbabelJNI.OBElement_GetElectronAffinity(swigCPtr, this);
  }

  public String GetName() {
    return openbabelJNI.OBElement_GetName(swigCPtr, this);
  }

  public double GetRed() {
    return openbabelJNI.OBElement_GetRed(swigCPtr, this);
  }

  public double GetGreen() {
    return openbabelJNI.OBElement_GetGreen(swigCPtr, this);
  }

  public double GetBlue() {
    return openbabelJNI.OBElement_GetBlue(swigCPtr, this);
  }

}
