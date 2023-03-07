// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/EventService.proto

package ru.mgt.icp.event.contract.proto;

public interface EventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Event)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Uuid id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <code>.Uuid id = 1;</code>
   * @return The id.
   */
  ru.mgt.icp.proto.shared.Uuid getId();
  /**
   * <code>.Uuid id = 1;</code>
   */
  ru.mgt.icp.proto.shared.UuidOrBuilder getIdOrBuilder();

  /**
   * <code>string title = 2;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>repeated .Event.Argument arguments = 3;</code>
   */
  java.util.List<ru.mgt.icp.event.contract.proto.Event.Argument> 
      getArgumentsList();
  /**
   * <code>repeated .Event.Argument arguments = 3;</code>
   */
  ru.mgt.icp.event.contract.proto.Event.Argument getArguments(int index);
  /**
   * <code>repeated .Event.Argument arguments = 3;</code>
   */
  int getArgumentsCount();
  /**
   * <code>repeated .Event.Argument arguments = 3;</code>
   */
  java.util.List<? extends ru.mgt.icp.event.contract.proto.Event.ArgumentOrBuilder> 
      getArgumentsOrBuilderList();
  /**
   * <code>repeated .Event.Argument arguments = 3;</code>
   */
  ru.mgt.icp.event.contract.proto.Event.ArgumentOrBuilder getArgumentsOrBuilder(
      int index);
}
