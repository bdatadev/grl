// automatically generated, do not modify

package grl.flatbuffer;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class JointImpedenceControlMode extends Table {
  public static JointImpedenceControlMode getRootAsJointImpedenceControlMode(ByteBuffer _bb) { return getRootAsJointImpedenceControlMode(_bb, new JointImpedenceControlMode()); }
  public static JointImpedenceControlMode getRootAsJointImpedenceControlMode(ByteBuffer _bb, JointImpedenceControlMode obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public JointImpedenceControlMode __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public double stiffness(int j) { int o = __offset(4); return o != 0 ? bb.getDouble(__vector(o) + j * 8) : 0; }
  public int stiffnessLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer stiffnessAsByteBuffer() { return __vector_as_bytebuffer(4, 8); }
  public double damping(int j) { int o = __offset(6); return o != 0 ? bb.getDouble(__vector(o) + j * 8) : 0; }
  public int dampingLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer dampingAsByteBuffer() { return __vector_as_bytebuffer(6, 8); }

  public static int createJointImpedenceControlMode(FlatBufferBuilder builder,
      int stiffnessOffset,
      int dampingOffset) {
    builder.startObject(2);
    JointImpedenceControlMode.addDamping(builder, dampingOffset);
    JointImpedenceControlMode.addStiffness(builder, stiffnessOffset);
    return JointImpedenceControlMode.endJointImpedenceControlMode(builder);
  }

  public static void startJointImpedenceControlMode(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addStiffness(FlatBufferBuilder builder, int stiffnessOffset) { builder.addOffset(0, stiffnessOffset, 0); }
  public static int createStiffnessVector(FlatBufferBuilder builder, double[] data) { builder.startVector(8, data.length, 8); for (int i = data.length - 1; i >= 0; i--) builder.addDouble(data[i]); return builder.endVector(); }
  public static void startStiffnessVector(FlatBufferBuilder builder, int numElems) { builder.startVector(8, numElems, 8); }
  public static void addDamping(FlatBufferBuilder builder, int dampingOffset) { builder.addOffset(1, dampingOffset, 0); }
  public static int createDampingVector(FlatBufferBuilder builder, double[] data) { builder.startVector(8, data.length, 8); for (int i = data.length - 1; i >= 0; i--) builder.addDouble(data[i]); return builder.endVector(); }
  public static void startDampingVector(FlatBufferBuilder builder, int numElems) { builder.startVector(8, numElems, 8); }
  public static int endJointImpedenceControlMode(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

