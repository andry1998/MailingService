// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/EventService.proto

package ru.mgt.icp.event.contract.proto;

public final class EventProto {
  private EventProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Event_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Event_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Event_Argument_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Event_Argument_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030proto/EventService.proto\032\033google/proto" +
      "buf/empty.proto\032\027proto/shared/uuid.proto" +
      "\"v\n\005Event\022\021\n\002id\030\001 \001(\0132\005.Uuid\022\r\n\005title\030\002 " +
      "\001(\t\022\"\n\targuments\030\003 \003(\0132\017.Event.Argument\032" +
      "\'\n\010Argument\022\014\n\004name\030\001 \001(\t\022\r\n\005value\030\002 \001(\t" +
      "B/\n\037ru.mgt.icp.event.contract.protoB\nEve" +
      "ntProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          ru.mgt.icp.proto.shared.UuidProto.getDescriptor(),
        });
    internal_static_Event_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Event_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Event_descriptor,
        new java.lang.String[] { "Id", "Title", "Arguments", });
    internal_static_Event_Argument_descriptor =
      internal_static_Event_descriptor.getNestedTypes().get(0);
    internal_static_Event_Argument_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Event_Argument_descriptor,
        new java.lang.String[] { "Name", "Value", });
    com.google.protobuf.EmptyProto.getDescriptor();
    ru.mgt.icp.proto.shared.UuidProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
