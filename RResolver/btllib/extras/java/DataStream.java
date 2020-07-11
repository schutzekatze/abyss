/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package btllib;

public class DataStream {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected DataStream(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DataStream obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        btllibJNI.delete_DataStream(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public DataStream(String path, DataStream.Operation op) {
    this(btllibJNI.new_DataStream(path, op.swigValue()), true);
  }

  public void close() {
    btllibJNI.DataStream_close(swigCPtr, this);
  }

  public SWIGTYPE_p_FILE __ref__() {
    long cPtr = btllibJNI.DataStream___ref__(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_FILE(cPtr, false);
  }

  public SWIGTYPE_p_FILE __deref__() {
    long cPtr = btllibJNI.DataStream___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_FILE(cPtr, false);
  }

  public final static class Operation {
    public final static DataStream.Operation READ = new DataStream.Operation("READ");
    public final static DataStream.Operation WRITE = new DataStream.Operation("WRITE");
    public final static DataStream.Operation APPEND = new DataStream.Operation("APPEND");
    public final static DataStream.Operation CLOSE = new DataStream.Operation("CLOSE");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Operation swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Operation.class + " with value " + swigValue);
    }

    private Operation(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Operation(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Operation(String swigName, Operation swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Operation[] swigValues = { READ, WRITE, APPEND, CLOSE };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
